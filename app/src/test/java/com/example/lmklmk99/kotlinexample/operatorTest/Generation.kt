package com.example.lmklmk99.kotlinexample.operatorTest

import org.junit.Test

/**
 * Created by lmklmk99 on 2016-07-24.
 */
class Generation {
    var list = listOf(1, 2, 3, 4, 5, 6)

    @Test
    @Throws(Exception::class)
    fun test_merge() {
        var listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
//        println("merge : " + listOf(3,4,6,8,10,11) + " : " +
//                list.merge(listRepeated) { it1, it2 -> it1 + it2 } )
        println("merge : " + listOf(3,4,6,8,10,11) + " : " +
                list.zip(listRepeated) { it1, it2 -> it1 + it2 } )
    }

    @Test
    @Throws(Exception::class)
    fun test_partition() {
        println("partition : " + Pair(listOf(2, 4, 6), listOf(1, 3, 5)) + " : " +
                list.partition { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_plus() {
        println("plus : " + listOf(1, 2, 3, 4, 5, 6, 7, 8) + " : " + list.plus(listOf(7, 8)))
    }

    @Test
    @Throws(Exception::class)
    fun test_zip() {
        println("zip : " + listOf(Pair(1, 7), Pair(2, 8)) + " : " +
                list.zip(listOf(7, 8)))
    }

    @Test
    @Throws(Exception::class)
    fun test_unzip() {
        println("unzip : " + Pair(listOf(5, 6), listOf(7, 8)) + " : " +
                listOf(Pair(5, 7), Pair(6, 8)).unzip())
    }
}