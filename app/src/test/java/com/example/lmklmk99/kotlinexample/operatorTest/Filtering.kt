package com.example.lmklmk99.kotlinexample.operatorTest

import org.junit.Test

/**
 * Created by lmklmk99 on 2016-07-24.
 */
class Filtering {
    var list = listOf(1, 2, 3, 4, 5, 6)

    @Test
    @Throws(Exception::class)
    fun test_drop() {
        println("drop : " + listOf(5, 6) + " : " + list.drop(4))
    }

    @Test
    @Throws(Exception::class)
    fun test_dropWhile() {
        println("dropWhile : " + listOf(3, 4, 5, 6) + " : " + list.dropWhile { it < 3 })
    }

    @Test
    @Throws(Exception::class)
    fun test_dropLastWhile() {
        println("dropLastWhile : " + listOf(1, 2, 3, 4) + " : " + list.dropLastWhile { it > 4 })
    }

    @Test
    @Throws(Exception::class)
    fun test_filter() {
        println("filter : " + listOf(2, 4, 6) + " : " + list.filter { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_filterNot() {
        println("filterNot : " + listOf(1, 3, 5) + " : " + list.filterNot { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_filterNotNull() {
        var list = listOf(1, 2, 3, 4, null, null)
        println("filterNotNull : " + listOf(1, 2, 3, 4) + " : " + list.filterNotNull())
    }

    @Test
    @Throws(Exception::class)
    fun test_slice() {
        var list = listOf(1, 2, 3, 4, null, null)
        println("slice : " + listOf(2, 4, 5) + " : " + list.slice(listOf(1, 3, 4)))
    }

    @Test
    @Throws(Exception::class)
    fun test_take() {
        println("take : " + listOf(1, 2) + " : " + list.take(2))
    }

    @Test
    @Throws(Exception::class)
    fun test_takeLast() {
        println("takeLast : " + listOf(5, 6) + " : " + list.takeLast(2))
    }

    @Test
    @Throws(Exception::class)
    fun test_takeWhile() {
        println("takeWhile : " + listOf(1, 2) + " : " + list.takeWhile { it < 3 })
    }

    @Test
    @Throws(Exception::class)
    fun test_takeLastWhile() {
        println("takeLastWhile : " + listOf(5, 6) + " : " + list.takeLastWhile { it > 4 })
    }
}