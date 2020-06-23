package com.asuraiv.kotlinpractice.collectionandlambda

data class Person(val name: String, val age: Int)

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {

    // map 생성
    val map = mapOf(1 to "foo", 2 to "bar", 3 to "baz")

    println(map)

    // 각종 list 연산
    val people = listOf(Person("Hong", 36), Person("Lee", 29), Person("Park", 65), Person("Um", 29), Person("Kim", 36))


    println("filter under 30 age: ${people.filter { it.age < 30 }}")

    println("map to name list: ${people.map(Person::name)}")

    println("all over 20 age: ${people.all { it.age > 20 }}")

    println("find first person over 30 age: ${people.find { it.age > 30 }}")

    println("count under 30 age: ${people.count { it.age < 30 }}")

    println("group by same age to each person name: ${people.groupByTo(mutableMapOf(), Person::age, {it.name})}")

    // flat 관련 연산
    val books = listOf(
            Book("bible", listOf("John", "Luke", "Jesus")),
            Book("kotlin in action", listOf("Hong", "Kim")),
            Book("java8 in action", listOf("James"))
    )

    println("flatMap result: ${books.flatMap { it.authors }.toList()}")
}