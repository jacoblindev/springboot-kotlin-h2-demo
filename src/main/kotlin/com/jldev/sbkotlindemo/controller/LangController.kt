package com.jldev.sbkotlindemo.controller

import com.jldev.sbkotlindemo.model.Lang
import com.jldev.sbkotlindemo.service.LangService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/lang")
@Tag(name = "Lang", description = "the languages API with documentation annotations")
class LangController(val service: LangService) {
    @Operation(summary = "Get all languages")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "Found languages",
                content = [
                    Content(mediaType = "application/json", schema = Schema(implementation = Lang::class))
                ]
            ),
            ApiResponse(
                responseCode = "400",
                description = "Bad Request",
                content = arrayOf(Content())
            )
        ]
    )
    @GetMapping
    fun index(): List<Lang> = service.findLanguages()

    @PostMapping
    fun postLang(@RequestBody lang: Lang) {
        service.postLang(lang)
    }
}