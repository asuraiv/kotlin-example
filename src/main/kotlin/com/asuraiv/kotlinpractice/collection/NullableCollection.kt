package com.asuraiv.kotlinpractice.collection

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main(args: Array<String>) {

    val bufferedReader = BufferedReader(FileReader(File("testfiles/numbers.txt")))

    val numbers = readNumbers(bufferedReader)

    println(numbers)

    addValidNumbers(numbers)

    addValidNumberWithFilter(numbers)
}

fun addValidNumberWithFilter(numbers: List<Int?>) {

    val filtered = numbers.filterNotNull()

    println("Sum of valid numbers: ${filtered.asSequence().sum()}")
    println("Invalid numbers: ${numbers.size - filtered.size}")
}

fun addValidNumbers(numbers: List<Int?>) {

    var sumOfValidNumbers = 0;
    var invalidNumbers = 0;

    for(number in numbers) {

        if(number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }

    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

fun readNumbers(reader: BufferedReader): List<Int?> {

    val result = mutableListOf<Int?>() // 타입 파라메터에 ?면 컬렉션 안에 null이 들어갈 수 있다는 뜻

    for(line in reader.lineSequence()) {

        try {
            val number = line.toInt()
            result.add(number)
        } catch(e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}