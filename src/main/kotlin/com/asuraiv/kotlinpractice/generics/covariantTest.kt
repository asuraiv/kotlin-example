package com.asuraiv.kotlinpractice.generics

open class Animal {
    fun feed() {
        println("yum yum.")
    }

    fun run() {
        println("${this::class.simpleName} is running!")
    }
}

class Cat : Animal() {
    fun cleanLitter() { println("clean~") }
}

// 'out' 키워드는 공변으로 선언하는 것을 뜻한다.
// 이는 생산(out)하는 위치에서 안전한 업 캐스팅을 보장해 준다.
class Herd<out T : Animal>(
    val list: MutableList<out T>
) {
    val size: Int get() = list.size
    operator fun get(i: Int): T = list[i]
}


fun takeCareOfCats(cats: Herd<Cat>) {
    for(i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    feedAll(cats) // 공변 (out) 으로 선언했기 때문에 컴파일 에러가 발생하지 않는다.
}

fun feedAll(animals: Herd<Animal>) {
    for(i in 0 until animals.size) {
        animals[i].feed()
    }
}

fun main() {
    /*
        Type inference failed. Expected type mismatch:
        required: Herd<Animal>
        found: Herd<Cat>
     */
    // feedAll(Herd(mutableListOf(Cat(), Cat()))) // '무공변'일 경우. 위와 같은 오류 발생

     takeCareOfCats(Herd(mutableListOf(Cat(), Cat())))
}