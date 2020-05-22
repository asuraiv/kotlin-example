package com.asuraiv.kotlinpactice.function

open class View {

    open fun click() = println("View Clicked")
}

class Button: View() {

    override  fun click() = println("Button Clicked")
}

fun View.showOff() = println("I'm view")
fun Button.showOff() = println("I'm button")

class Test {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val view: View = Button()

            println(view.click()) // 일반적인 오버라이드는 동적 시간에 어느 메소드를 호출할지 결정

            println(view.showOff()) // Button에 같은 확장 함수가 있어도 오버라이드 되지 않은 View의 확장함수가 호출됨.
        }
    }
}

