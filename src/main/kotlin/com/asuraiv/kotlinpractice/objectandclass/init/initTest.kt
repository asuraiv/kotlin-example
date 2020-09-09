package com.asuraiv.kotlinpractice.objectandclass.init

open class User (
    val nickName: String,
    val isSubscribed: Boolean = true
)

class TwitterUser(nickName: String) : User(nickName) // 클래스 상속시, 구문에 상위 클래스 생성자를 호출해야함

fun main() {

    val user = User(nickName = "Rover") // 'isSubscribed' 필드는 디폴트 값이 사용된다.
    println(user.nickName)
}