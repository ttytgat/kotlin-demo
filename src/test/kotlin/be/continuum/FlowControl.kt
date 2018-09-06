package be.continuum

import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.assertThat
import org.junit.Test

class FlowControl {

    @Test
    fun range() {
        for (i in 1..5) {
            println("Loop $i")
        }
    }

    @Test
    fun rangeUntil() {
        for (i in 0 until 5) {
            println("Loop $i")
        }
    }

    @Test
    fun forLoop() {
        val carBrands = createCarBrandsArray()
        for (brand in carBrands) {
            println("Brand ${brand.toUpperCase()}")
        }
    }

    @Test
    fun forStream() {
        val carBrands = createCarBrandsArray()
        val filteredCarBrands = carBrands.filterNot { it == "Skoda" }.toList()
        assertThat(filteredCarBrands, not(hasItem("Skoda")))
    }

    private fun createCarBrandsArray() = arrayOf("BMW", "Audi", "Volkswagen", "Skoda", "Volvo")

    @Test
    fun forMap() {
        val map = hashMapOf<String, Int>()
        map["one"] = 1
        map["two"] = 2

        for ((key, value) in map) {
            println("Key: '$key', value: '$value'")
        }
    }

    @Test
    fun forMapLazy() {
        val map: Map<String, Int> by lazy {
            println("Computed!")
            mapOf(
                    "one" to 1,
                    "two" to 2
            )
        }

        println("Value for one: '${map["one"]}'")
        println("Value for two: '${map["two"]}'")
    }

}