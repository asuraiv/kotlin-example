package com.asuraiv.kotlinpactice.`object`.`interface`

class UserClazz(val name: String) {

    var address: String = "unspecified"
        set(value: String) {

            println("""
                Address was changed for ${name}:
                "${field} -> ${value}" // 여기서 'field'는 특별한 참조로, 현재 세터 메서드의 해당 필드를 나타낸다. (약간 this랑 비슷한 개념?) (backing field 라고도 하는 듯)
            """.trimIndent())

            field = value
        }
}