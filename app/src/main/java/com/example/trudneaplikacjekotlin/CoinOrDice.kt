package com.example.trudneaplikacjekotlin
import kotlin.random.Random

interface RollingTool {
    fun losowanie(): Any
}

class Coin : RollingTool {
    override fun losowanie(): String {
        val losowa = Random.nextInt(1, 3)
        if (losowa == 1){
            println(losowa)
            return "Heads"

        }
        else{
            println(losowa)
            return "Tails"
        }
    }
}

class Dice : RollingTool {
    override fun losowanie(): Int {
        return Random.nextInt(1, 7)
    }
}

fun main() {
    print("Choose 'coin' or 'dice': ")
    val choice = readLine()

    val wynik = when(choice) {
        "coin" -> Coin()
        "dice" -> Dice()
        else -> null
    }

    if (wynik != null) {
        val finalnywynik = wynik.losowanie()
        println("Result: $finalnywynik")
    } else {
        println("Invalid choice")
    }
}
