package com.jldev.sbkotlindemo.service

import com.jldev.sbkotlindemo.model.Lang
import com.jldev.sbkotlindemo.repository.LangRepository
import org.springframework.stereotype.Service

@Service
class LangService(val db: LangRepository) {
    fun findLanguages(): List<Lang> = db.findLanguages()

    fun postLang(lang: Lang) {
        db.save(lang)
    }
}