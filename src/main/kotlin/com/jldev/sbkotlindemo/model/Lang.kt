package com.jldev.sbkotlindemo.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.validation.constraints.Size

@Table("LANGUAGES")
data class Lang(@Id val id: String?, @Size(min = 2, max = 60) val lang: String)