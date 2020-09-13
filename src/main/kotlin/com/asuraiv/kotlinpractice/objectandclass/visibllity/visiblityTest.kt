package com.asuraiv.kotlinpractice.objectandclass.visibllity

import com.asuraiv.kotlinpractice.objectandclass.`interface`.Focusable

internal open class TalkativeButton: Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

/*
    # 아래 코드는 컴파일 에러 발생
    > 확장함수는 기본적으로 'public' 이다.
    하지만 해당 확장 함수 안에서 호출하는 'yell'과 'whisper' 메서드는 'internal' 이므로 'public' 보다 가시성이 낮다
    'internal'은 모듈 내부에서만 볼 수 있게하는 키워드인데, 이를 public 함수에 허용해버리면 캡슐화가 깨지므로
    허용되지 않고 컴파일 에러를 낸다.
 */
/*

fun TalkativeButton.giveSpeech() {
    yell()
    whisper()
}

 */

class LengthCounter {
    var counter: Int = 0
        private set
    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {

    val counter = LengthCounter()
    // counter.counter = 1 // Compile error (setter 의 가시성을 private 으로 지정했으므로)
    counter.addWord("Hello World!")
    println(counter.counter) // 12 출력
}