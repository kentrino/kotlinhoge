package com.github.kentrino.kotlinhoge

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.tables.row
import org.junit.Test

class TestHoge {
    @Test
    fun `square number got correctly`() {
        val hoge = Hoge()
        val res = hoge.square(3)
        res shouldBe 9
    }
}
