package com.asuraiv.kotlinpractice.objectandclass.`interface`

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun showOff() = println("I'm focusable")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked.")
    }

    override fun showOff() {
        super<Clickable>.showOff()// <> 안에 인터페이스를 입력하여 다중 인터페이스 구현시 어떤 메서드를 호출할지 결정할 수 있음.
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.showOff()
    button.click()
    button.setFocus(true)
}