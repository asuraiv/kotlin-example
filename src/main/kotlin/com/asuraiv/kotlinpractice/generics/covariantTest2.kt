package com.asuraiv.kotlinpractice.generics

class Producer<out T>(
    private val value: T
) {
    fun get(): T {
        return value
    }
}

class Consumer<in T>{
    fun consume(value: T) {
        println("Consume value: $value")
    }
}

fun useProducer(producer: Producer<Number>) {
    println("Produce value: ${producer.get()}")
}

fun useConsumer(consumer: Consumer<Number>) {
    consumer.consume(999)
}

fun main() {
    val producer = Producer<Int>(999)
    useProducer(producer)

    val consumer = Consumer<Any>()
    useConsumer(consumer)
}