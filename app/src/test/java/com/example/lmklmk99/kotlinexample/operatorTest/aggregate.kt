package com.example.lmklmk99.kotlinexample.operatorTest

import org.junit.Test

/**
 * Created by lmklmk99 on 2016-07-24.
 */
class aggregate {

    var list = listOf(1, 2, 3, 4, 5 ,6)

    @Test
    @Throws(Exception::class)
    fun test_any() {
        println("any : true : " + list.any { it % 2 == 0 })
        println("any : false : " + list.any { it > 10 })
    }

    @Test
    @Throws(Exception::class)
    fun test_all() {
        println("all : true : " + list.all { it < 10 })
        println("all : false : " + list.all { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_count() {
        println("count : 3 : " + list.count { it % 2 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_fold() {
        println("fold : 25 : " + list.fold(4) { total, next -> total + next })
    }

    @Test
    @Throws(Exception::class)
    fun test_foldRight() {
        println("foldRight : 25 : " + list.foldRight(4) { total, next -> total + next })
    }

    @Test
    @Throws(Exception::class)
    fun test_forEach() {
        list.forEach { println(it) }
    }

    @Test
    @Throws(Exception::class)
    fun test_forEachIndexed() {
        list.forEachIndexed { index, value -> println("position $index contains a $value") }
    }

    @Test
    @Throws(Exception::class)
    fun test_max() {
        println("max : 6 : " + list.max())
    }

    @Test
    @Throws(Exception::class)
    fun test_maxBy() {
        println("maxBy : 1 : " + list.maxBy { it % 2 })
    }

    @Test
    @Throws(Exception::class)
    fun test_min() {
        println("min : 1 : " + list.min())
    }

    @Test
    @Throws(Exception::class)
    fun test_minBy() {
        println("minBy : 6 : " + list.minBy { -it })
    }

    @Test
    @Throws(Exception::class)
    fun test_none() {
        println("none : true : " + list.none { it % 7 == 0 })
    }

    @Test
    @Throws(Exception::class)
    fun test_reduce() {
        println("reduce : 21 : " + list.reduce { total, next -> total + next })
    }

    @Test
    @Throws(Exception::class)
    fun test_reduceRight() {
        println("reduceRight : 21 : " + list.reduceRight { total, next -> total + next })
    }

    @Test
    @Throws(Exception::class)
    fun test_sumBy() {
        println("sumBy : 3 : " + list.sumBy { it % 2 })
    }
}