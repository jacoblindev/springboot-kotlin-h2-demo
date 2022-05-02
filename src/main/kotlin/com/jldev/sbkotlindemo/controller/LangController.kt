package com.jldev.sbkotlindemo.controller

import com.jldev.sbkotlindemo.model.Lang
import com.jldev.sbkotlindemo.service.LangService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lang")
class LangController(val service: LangService) {
    @GetMapping
    fun index(): List<Lang> = service.findLanguages()

    @PostMapping
    fun postLang(@RequestBody lang: Lang) {
        service.postLang(lang)
    }
}