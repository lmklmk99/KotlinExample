package com.example.lmklmk99.kotlinexample.operatorTest

import org.junit.Test

/**
 * Created by lmklmk99 on 2016-07-24.
 */
class Ordering {
    val unsortedList = listOf(3, 2, 6, 4, 7, 5)

    @Test
    @Throws(Exception::class)
    fun test_reverse() {
        println("reverse : " + listOf(5, 7, 2, 3) + " : " +
                unsortedList.reversed())
    }

    @Test
    @Throws(Exception::class)
    fun test_sort() {
        println("sort : " + listOf(2, 3, 5, 7) + " : " +
                unsortedList.sorted())
    }

    @Test
    @Throws(Exception::class)
    fun test_sortBy() {
        println("sortedBy : " + listOf(3, 7, 2, 5) + " : "
                + unsortedList.sortedBy { it % 3 })
    }

    @Test
    @Throws(Exception::class)
    fun test_sortDescending() {
        println("sortDescending : " + listOf(7, 5, 3, 2) + " : " +
                unsortedList.sortedDescending())
    }

    @Test
    @Throws(Exception::class)
    fun test_sortDescendingBy() {
        println("sortDescendingBy : " + listOf(2, 5, 7, 3) + " : " +
                unsortedList.sortedByDescending { it % 3 })
    }
}