package com.asuraiv.kotlinpractice.objectandclass.nested

sealed class DayType

object WeekDay : DayType()
object SaturDay : DayType()
object HolyDay : DayType()

fun main() {

    print(getDescription(dayType = WeekDay))
}

fun getDescription(dayType: DayType): String =
    when(dayType) {
        is WeekDay -> "Normal days."
        is SaturDay -> "Exciting Day."
        is HolyDay -> "We should go to church."
        // sealed 클래스는 계층 정의를 할때, 확장을 제한하여 when 절 컴파일에 영향을 미친다. sealed 클래스의 하위 클래스 중,
        // when 절에 조건을 처리하는 코드가 없다면 컴파일 에러를 발생시킨다.
        else -> "Nothing."
    }