package com.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrencyType(
    val name : String,
    val acronym: String,
    val symbol : String,
    @SerialName("country_flag_image_url")
    val countryFlagImageUrl : String
)

@Serializable
data class CurrencyTypeResult(
    val values: List<CurrencyType>
)

// Lista estática simulando um Banco de Dados ou resposta de API
val currencyTypes = listOf(
    CurrencyType(
        name = "Dólar Americano",
        acronym = "USD",
        symbol = "$",
        countryFlagImageUrl = "https://flagcdn.com/us.svg"
    ),
    CurrencyType(
        name = "Euro",
        acronym = "EUR",
        symbol = "€",
        countryFlagImageUrl = "https://flagcdn.com/eu.svg"
    ),
    CurrencyType(
        name = "Real Brasileiro",
        acronym = "BRL",
        symbol = "R$",
        countryFlagImageUrl = "https://flagcdn.com/br.svg"
    ),
    CurrencyType(
        name = "Libra Esterlina",
        acronym = "GBP",
        symbol = "£",
        countryFlagImageUrl = "https://flagcdn.com/gb.svg"
    ),
    CurrencyType(
        name = "Iene Japonês",
        acronym = "JPY",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/jp.svg"
    ),
    CurrencyType(
        name = "Dólar Canadense",
        acronym = "CAD",
        symbol = "C$",
        countryFlagImageUrl = "https://flagcdn.com/ca.svg"
    ),
    CurrencyType(
        name = "Dólar Australiano",
        acronym = "AUD",
        symbol = "A$",
        countryFlagImageUrl = "https://flagcdn.com/au.svg"
    ),
    CurrencyType(
        name = "Yuan Chinês",
        acronym = "CNY",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/cn.svg"
    ),
    CurrencyType(
        name = "Franco Suíço",
        acronym = "CHF",
        symbol = "Fr",
        countryFlagImageUrl = "https://flagcdn.com/ch.svg"
    ),
    CurrencyType(
        name = "Peso Argentino",
        acronym = "ARS",
        symbol = "$",
        countryFlagImageUrl = "https://flagcdn.com/ar.svg"
    )
)