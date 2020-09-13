package com.asuraiv.kotlinpractice.objectandclass.companion

import com.asuraiv.kotlinpractice.objectandclass.`interface`.SubscribingUser

/*
    동반 객체(companion object)를 활용한 '팩토리' 패턴
 */
class User private constructor(val nickname: String) {

    companion object {

        fun newSubscribingUser(email: String) = SubscribingUser(email)

        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int): String {
            TODO("Not yet implemented")
        }
    }
}

fun main() {

    println(User.newSubscribingUser("asuraiv@naver.com").nickName)
}