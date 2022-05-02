package com.jldev.sbkotlindemo.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("LANGUAGES")
data class Lang(@Id val id: String?, val lang: String)