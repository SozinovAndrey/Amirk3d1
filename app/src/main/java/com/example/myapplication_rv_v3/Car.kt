package com.example.myapplication_rv_v3

sealed class Car(open val brand: String) {

    class SportCar(
       override val brand: String,
        val speed: Int,
        val driftLevel: Int,
        val color: String
    ): Car(brand)

    class CityCar(
    override val brand: String,
        val comfortLevel: Int,
        val price: Int
    ): Car(brand)
}