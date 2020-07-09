package com.asuraiv.kotlinpractice.highorder

fun main() {
    class Person(val name: String, val age: Int)

    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // #1
    fun findAlice(people: List<Person>) {
        people.forEach {
            if (it.name == "Alice") {
                println("Found!")
                return // findAlice 함수 자체에 대한 반환
            }
            println("Alice is not found.")
        }
        println("Loop ended.") // 함수 자체가 반환되므로 출력되지 않음
    }

    findAlice(people)

    // #2
    fun findAliceWithLabel(people: List<Person>) {
        people.forEach loop@{ // 람다에 레이블 이름을 붙였다.
            if (it.name == "Alice") {
                println("Found!")
                return@loop // 해당 람다에 대한 반환
            }
            println("Current is not Alice")
        }
        println("Loop ended.") // 람다에 대한 반환만을 수행하므로 루프가 끝나고 출력됨
    }

    findAliceWithLabel(people)


    // #3
    fun findAliceWithAnonymousFun(people: List<Person>) {
        people.forEach(fun(person) { // 무명 함수 방식으로 넘겼다.
            if (person.name == "Alice") {
                println("Found!")
                return  // 무명 함수는 기본적으로 local return 이므로, 무명 함수에 대한 반환
            }
            println("Current is not Alice")
        })
        println("Loop ended.")
    }

    findAliceWithAnonymousFun(people)
}

