package com.asuraiv.kotlinpractice.convention

import java.time.LocalDate

// 날짜 범위에 대한 이터레이터 구현.
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {

        var current = start
        override fun hasNext() = current <= endInclusive
        override fun next() = current.apply { current = plusDays(1) }
    }


fun main() {

    val newYear = LocalDate.ofYearDay(2020, 1)
    val daysOff = newYear.minusDays(1)..newYear

    for (dayOff in daysOff) {
        println(dayOff)
    }
}