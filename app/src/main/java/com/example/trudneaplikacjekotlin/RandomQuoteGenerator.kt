package com.example.trudneaplikacjekotlin
import kotlin.random.Random

class Quotes {
    val quotes = mutableListOf(
        "Rób to, co możesz, tym, co posiadasz, i tam, gdzie jesteś.",
        "Jeśli jest noc, musi być dzień, jeśli łza – uśmiech.",
        "Jestem, jaka jestem. Niepojęty przypadek, jak każdy przypadek."
    )

    fun getRandomQuotes(): String {
        return quotes[Random.nextInt(quotes.size)]
    }

    fun addQuote(quote: String) {
        quotes.add(quote)
    }

    companion object {
        private var instance: Quotes? = null
        fun getInstance(): Quotes {
            if (instance == null) {
                instance = Quotes()
            }
            return instance!!
        }
    }

}
fun main(){
    val quotes = Quotes.getInstance()
    println(quotes.getRandomQuotes())
    quotes.addQuote("Jakis nowy cytat")
    println(quotes.getRandomQuotes())
}
