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

interface User {
    val nickName: String // 인터페이스의 추상 프로퍼티. 이 인터페이스를 구현하는 모든 클래스는 이 'nickName' 값을 얻을 수 있는 방법을 제공해야한다.
}

class PrivateUser(override val nickName: String) : User // privateUser.nickName 으로 접근 가능

class SubscribingUser(val email: String) : User {
    override val nickName: String
        get() = email.substringBefore('@') // 커스텀 게터를 구현하여 'nickName' 값을 얻게 했다.
}

fun main() {

    val button = Button()
    button.showOff()
    button.click()
    button.setFocus(true)

    println(PrivateUser("Rover").nickName) // Rover
    println(SubscribingUser("rover@gmail.com").nickName) // rover
}