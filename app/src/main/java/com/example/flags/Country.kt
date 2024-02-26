package com.example.flags

class Country(
    val name: String,
    val capital: String,
    val population: Long,
    val area: Long,
    val languages: List<Language>,
    val flag:String
)

class Language(
    val name: String
)