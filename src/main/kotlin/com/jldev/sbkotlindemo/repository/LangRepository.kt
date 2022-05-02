package com.jldev.sbkotlindemo.repository

import com.jldev.sbkotlindemo.model.Lang
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface LangRepository : CrudRepository<Lang, String> {
    @Query("SELECT * FROM LANGUAGES")
    fun findLanguages(): List<Lang>
}