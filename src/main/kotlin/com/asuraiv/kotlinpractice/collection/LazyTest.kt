package com.asuraiv.kotlinpractice.collection

class LazyTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val people = listOf(Person("Hong", 36), Person("Lee", 29),
                    Person("Park", 65), Person("Um", 29), Person("Kim", 36))

            val over30Age = { p: Person -> p.age > 30 }

            println(people.asSequence().filter(over30Age).map { it.name }.toSet())

            // 지연 연산 결과 출력
            println(listOf(1, 2, 3, 4).asSequence()
                    .map { print("map($it) "); it * it }
                    .filter { print("filter($it) "); it % 2 == 0}
                    .toList() // 최종 연산을 호출 하면, 그때 지연되었던 연산들이 수행된다
            )

            println(listOf(1, 2, 3, 4).asSequence()
                    .map { it * it }
                    .find { it > 3 } // map + find 가 쌍으로 평가되므로, 두번째 원소 즉 '2'를 처리하고 나서 그 다음 find 가 수행되면서 연산이 종료된다. '3', '4' 는 처리되지 않는다.
            )
        }
    }
}