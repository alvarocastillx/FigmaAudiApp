package com.acasloa946.figmaproject.routes

sealed class Routes(var route:String) {
    object InitialScreen : Routes("InitialScreen")
    object CatalogScreen : Routes("CatalogScreen")
    object OptionsScreen : Routes("SecondScreen")



}