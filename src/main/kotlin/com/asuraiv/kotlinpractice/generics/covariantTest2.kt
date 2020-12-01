package com.asuraiv.kotlinpractice.generics

class Dog : Animal()

class AnimalCage<out T : Animal>(
    val animals: List<T>
)

fun letGoAnimals(animalCage: AnimalCage<Animal>) {
    for(animal in animalCage.animals) {
        animal.run()
    }
}

fun main() {
    val dogCage = AnimalCage(mutableListOf(Dog(), Dog()))
    letGoAnimals(dogCage)
}