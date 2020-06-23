package com.asuraiv.kotlinpractice

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyTest {

    // 널이 될수 없는 타입을 생성자 외 다른 곳 에서 초기화 할 수 없다. (?나 !!를 사용해야함)
    // 하지만 'lateinit' 키워드를 사용하면 다른 메서드에서 초기화 가능하다
    private lateinit var myService: MyService

    @Before
    fun setUp() {

        myService = MyService()
    }

    @Test
    fun testAction() {
        Assert.assertEquals("foo", myService.performAction())
    }
}

class MyService {

    fun performAction(): String = "foo"
}