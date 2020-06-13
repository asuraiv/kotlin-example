package com.asuraiv.kotlinpactice.`null`

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

class NullTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val john = Person(name = "john", company = null)

            println(john.company?.name) // null 출력

            // 회사 객체가 없을 경우 기본 값 출력 (elvis 연산자 사용)
            println(john.company?.name ?: "백수")

            // 회사 객체가 없을 경우 별도 함수 호출 (예외를 던질 수도 있음)
            println(john.company?.name ?: errorHandler())

            // return 문도 사용 가능!
            println(john.company?.name ?: return)
        }

        private fun errorHandler(): String = "회사를 다니지 않습니다"
    }
}