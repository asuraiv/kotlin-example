package com.asuraiv.kotlinpractice.highorder

import java.util.concurrent.locks.ReentrantLock

inline fun <T> synchronized(lock: ReentrantLock, action: () -> T): T {
    lock.lock()
    try {
        return action() // 이 부분(람다)이 인라이닝 된다.
    }
    finally {
        lock.unlock()
    }
}

fun foo(l: ReentrantLock) {

    println("Before sync")

    // 인라인 함수의 람다 파라메터를 람다 블록으로 넘겼을때 인라이닝 된다. 람다를 다른 변수에 저장하고 synchronized(l, lambda) 와 같은 형식으로 넘기면 인라이닝 되지 않는다.
    synchronized(l) {
        println("Action")
    }

    println("After sync")
}

fun main() {

    foo(ReentrantLock())
}
