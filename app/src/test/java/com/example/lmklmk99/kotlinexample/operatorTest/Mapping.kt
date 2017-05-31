package com.example.lmklmk99.kotlinexample.operatorTest

import org.junit.Test

/**
 * Created by lmklmk99 on 2016-07-24.
 */
class Mapping {
    var list = listOf(1, 2, 3, 4, 5, 6)

    @Test
    @Throws(Exception::class)
    fun test_flatMap() {
        println("flatMap : " +
                listOf(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7) + " : " +
                list.flatMap { listOf(it, it + 1) })
    }

    @Test
    @Throws(Exception::class)
    fun test_groupBy() {
        println("groupBy : " + mapOf("odd" to listOf(1, 3, 5), "even" to listOf(2, 4, 6)) + " : " +
                list.groupBy { if (it % 2 == 0) "even" else "odd" })
    }

    @Test
    @Throws(Exception::class)
    fun test_map() {
        println("map : " + listOf(2, 4, 6, 8, 10, 12) + " : " + list.map { it * 2 })
    }

    @Test
    @Throws(Exception::class)
    fun test_mapIndexed() {
        println("mapIndexed : " + listOf(0, 2, 6, 12, 20, 30) + " : " + list.mapIndexed { index, it -> index * it })
    }

    @Test
    @Throws(Exception::class)
    fun test_mapNotNull() {
        var list = listOf(1, 2, 3, 4, null, null)
        println("mapNotNull : " + listOf(2, 4, 6, 8) + " : " + list.mapNotNull { it?.times(2) })
    }
}