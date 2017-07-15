package com.example.dsamaryan.kotlindetect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.gc()
    }

    fun init(
        v1: Int,
        v2: Int,
        v3: Int,
        v4: Int,
        v5: Int,
        v6: Int,
        v7: Int,
        v8: Int,
        v9: Int,
        v10: Int,
        v11: Int,
        v12: Int,
        v13: Int,
        v14: Int,
        v15: Int,
        v16: Int,
        pet: Pet
    ): Unit {
        val v = v1 - v2 * v3
        when (pet) {
            Pet.DOG -> Log.d("", "")
            Pet.CAT -> Log.d("", "")
            Pet.CAT -> Log.d("", "")
        }
    }
    abstract class A {
        open protected val v = ""
        open suspend internal fun f(v: Any): Any = ""
        lateinit public var lv: String
        tailrec abstract fun findFixPoint(x: Double = 1.0): Double
    }

    class B : A() {
        override public val v = ""
        override suspend fun f(v: Any): Any = ""
        override tailrec fun findFixPoint(x: Double): Double
            = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))
    }

    companion object {
        private const val pi = 3.14f
    }

    enum class Pet {
        DOG,
        CAT
    }

}
