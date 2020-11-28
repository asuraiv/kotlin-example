package com.asuraiv.kotlinpractice.leetcode

class ParkingSystem(big: Int, medium: Int, small: Int) {

    var _big = big
    var _medium = medium
    var _small = small

    fun addCar(carType: Int): Boolean {

        when(carType) {
            1 -> {
                if(this._big > 0) {
                    this._big--
                    return true
                }
            }
            2 -> {
                if(this._medium > 0) {
                    this._medium--
                    return true
                }
            }
            3 -> {
                if(this._small > 0) {
                    this._small--
                    return true
                }
            }
        }
        return false
    }

}

fun main() {

    val obj = ParkingSystem(big = 1, medium = 1, small = 0)
    assert(obj.addCar(carType = 1))
    assert(obj.addCar(carType = 2))
    assert(!obj.addCar(carType = 3))
    assert(!obj.addCar(carType = 1))
}