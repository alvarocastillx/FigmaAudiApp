package com.acasloa946.figmaproject.routes

sealed class Routes(var route:String) {
    object InitialScreen : Routes("InitialScreen")
    object CatalogScreen : Routes("CatalogScreen")
    object OptionsScreen : Routes("OptionsScreen")
    object LoginScreen : Routes("LoginScreen")
    object SecondScreen : Routes("SecondScreen")
    object ThirdScreen : Routes("ThirdScreen")
    object EspecRS7Screen : Routes("EspecRS7Screen")
    object EspecRS6Screen : Routes("EspecRS6Screen")
    object EspecR8Screen : Routes("EspecR8Screen")
    object EspecEtronScreen : Routes("EspecEtronScreen")
    object EspecSQ8Screen : Routes("EspecSQ8Screen")
    object EspecQ4Screen : Routes("EspecQ4Screen")










}