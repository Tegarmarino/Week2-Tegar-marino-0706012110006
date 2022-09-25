package com.example.week2.model

class ayam : models ("" , "" , "" , "") {
    override var animalEat: String
        get() = super.animalEat
        set(value) {"Kamu memberi makan hewan dengan biji - biji an"}

    override var animalInterac: String
        get() = super.animalInterac
        set(value) {"Bock bock bock..."}
}