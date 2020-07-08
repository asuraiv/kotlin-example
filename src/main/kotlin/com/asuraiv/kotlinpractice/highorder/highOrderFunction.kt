package com.asuraiv.kotlinpractice.highorder

import kotlin.contracts.contract

// 기본 고차함수 예제
fun twoAndThree(operation: (Int, Int) -> Int): Int {
    return operation(2, 3)
}


fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for(i in 0 until length) {
        val el = get(i)
        if(predicate(el)) {
            sb.append(el)
        }
    }
    return sb.toString()
}

// 함수를 반환하는 함수

// 배송비 계산 예제
enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {

    if(delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return  { order -> 1.2 * order.itemCount }
}

// 연락처 관리 예제
class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {

        val startsWithPrefix = { p: Person ->

            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if(!onlyWithPhoneNumber) {
            return startsWithPrefix
        }

        return { startsWithPrefix(it) && it.phoneNumber != null }
    }
}

data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)

fun main() {

    // 기본 고차 함수 테스트
    println(twoAndThree {x, y -> x + y})

    println("Hello World!".filter { c -> c != 'e' })

    // 함수를 반환하는 함수 테스트
    val shippingCostCalculator = getShippingCostCalculator(Delivery.STANDARD)
    println(shippingCostCalculator(Order(5)))

    val contacts = listOf(Person("Dmitry", "Jemerov", "123-456"), Person("Svetlana", "Isakova", null))

    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))
}