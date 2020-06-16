package com.asuraiv.kotlinpractice.`object`.`interface`

class PrivateUser(override val nickname: String) : User // 주 생성자로 nickname 접근자 구현 'val' 키워드

class SubscribingUser(val email: String) : User {

    override val nickname: String
        get() = email.substringBefore('@') // 사용자 정의 접근자
}

class FacebookUser(val accountId: Int) : User {

    override val nickname = getFacebookName(accountId) // 특정 메서드를 통해 프로퍼티 초기화

    private fun getFacebookName(accountId: Int): String {
        TODO("Not yet implemented")
    }
}