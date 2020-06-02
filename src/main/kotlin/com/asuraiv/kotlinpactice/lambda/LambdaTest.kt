package com.asuraiv.kotlinpactice.lambda

class LambdaTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            // 람다 사용 필터로직
            val people = listOf(Person("홍길동", 25), Person("김철수", 30))

            println(findMaxAge(people))

            // 위임 예제
            val action = { p: Person, message: String -> sendEmail(p, message) } // 내부적으로 'sendMail' 함수에 로직 위임 (as-is)

            val nextAction = ::sendEmail // 함수 참조를 통해 로직 위임 (to-be) 더 간결하다


            println(action(Person("hone", 10), "Hello!!"))

            println(nextAction(Person("hone", 10), "Hello!!"))

        }

        private fun sendEmail(p: Person, message: String) {

            println(p.name + " send to message '" + message + "'")
        }
    }
}