package com.example.lmklmk99.kotlinexample.operatorTest

import org.junit.Test

/**
 * Created by lmklmk99 on 2016-07-24.
 */
class Elements {

    var list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    @Test
    @Throws(Exception::class)
    fun test_contain() {
        println("contain : true : " + list.contains(2))
    }

    @Test
    @Throws(Exception::class)
    fun test_elementAt() {
        println("elementAt : 2 : " + list.elementAt(1))
    }

    @Test
    @Throws(Exception::class)
    fun test_elementAtOrElse() {
        println("elementAtOrElse : 20 : " + list.elementAtOrElse(10, { 2 * it }))
    }

    @Test
    @Throws(Exception::class)
    fun test_elementAtOrNull() {
        println("elementAtOrNull : null : " + list.elementAtOrNull(10))
    }

    @Test
    @Throws(Exception::class)
    fun test_first() {
        println("first : 2 : " + list.first { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_firstOrNull() {
        println("firstOrNull : null : " + list.firstOrNull { it % 7 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_indexOf() {
        println("indexOf : 3 : " + list.indexOf(4))
    }

    @Test
    @Throws(Exception::class)
    fun test_indexOfFirst() {
        println("indexOfFirst : 1 : " + list.indexOfFirst { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_indexOfList() {
        println("indexOfFirst : 5 : " + list.indexOfLast { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_last() {
        println("last : 6 : " + list.last { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_lastIndexOf() {
        var listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
        println("lastIndexOf : 5 : " + listRepeated.lastIndexOf(5))
    }

    @Test
    @Throws(Exception::class)
    fun test_lastOrNull() {
        println("lastOrNull : null : " + list.lastOrNull { it % 7 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_single() {
        println("single : 5 : " + list.single { it % 5 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_singleOrNull() {
        println("singleOrNull : null : " + list.singleOrNull { it % 5 == 0 })
    }
}