package com.asuraiv.kotlinpractice.`object`

// 클래스를 상속 가능하게 open 키워드로 작성
open class RichButton : Clickable {

    fun disable() {} // open 키워드가 없으면 기본적으로 final

    open fun animate() {} // open 키워드가 있으니 오버라이드 가능 (하지만 오버라이드가 필수는 아님)

    override fun click() { // 상위 인터페이스의 메서드를 구현했음.
        TODO("Not yet implemented")
    }
}