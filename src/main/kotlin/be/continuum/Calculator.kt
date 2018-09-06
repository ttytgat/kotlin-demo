package be.continuum

class Calculator private constructor() {

    companion object {

        @JvmStatic
        fun sum(a: Int = 4, b: Int = 3): Int {
            return a + b
        }

        @JvmStatic
        @JvmOverloads
        fun min(a: Int = 4, b: Int = 3): Int {
            return a - b
        }

    }

}