package be.continuum

import be.continuum.data.Address
import be.continuum.data.Car
import be.continuum.data.User

class KotlinMain {

    fun main(args: Array<String>) {

        val user = User("Jan", "Dockx")
        val address = Address()
        address.number = 100
        user.address = address
        val car = Car()
        car.brand = "VW"
        car.model = "Golf"
        car.price = 25000
        car.pollutionCo2 = 89
        user.car = car

        if (args.isEmpty()) {
            println("Please provide a name as a command-line argument")
            return
        }
        println("Hello, ${args[0]}!")
    }

}