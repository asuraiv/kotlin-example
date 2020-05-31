package com.asuraiv.kotlinpactice.lambda

data class Person(val name: String, val age: Int)

fun findMaxAge(list: Collection<Person>) : Person? {

    return list.maxBy { p -> p.age } // 람다 사용
}

fun findMaxAgeUsingIt(list: Collection<Person>) : Person? {

    return list.maxBy { it.age } // 'it(그것)' 키워드를 사용한 축약형 람다
}