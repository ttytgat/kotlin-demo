package be.continuum.kotlin

class Main {

    fun main(args: Array<String>) {
        if (args.isEmpty()) {
            println("Please provide a name as a command-line argument")
            return
        }
        println("Hello, ${args[0]}!")
    }

}