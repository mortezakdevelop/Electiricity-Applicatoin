package com.example.electricityapplication.domain

data class Title(
    val id: Int,
    val title: String,
    val subTitle: List<RowSubTitle>,
)