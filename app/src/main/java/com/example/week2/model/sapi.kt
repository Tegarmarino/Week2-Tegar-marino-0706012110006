package com.example.week2.model

class sapi(name: String, animalType: String, age: String, animalImage: String) : models ("" , "" , "" , "") {

    override var animalEat: String
        get() = super.animalEat
        set(value) {"Kamu memberi makan hewan dengan rerumputan"}

    override var animalInterac: String
        get() = super.animalInterac
        set(value) {"Mooooo...."}
}