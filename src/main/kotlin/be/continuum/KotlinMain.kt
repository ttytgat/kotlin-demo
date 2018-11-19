package be.continuum

import be.continuum.data.Address
import be.continuum.data.Car
import be.continuum.data.KotlinUser
import be.continuum.data.User

fun main(args: Array<String>) {
    /*val user = User()
    user.surname = "Jan"
    user.name = "Dockx"
    val address = Address()
    address.number = 100
    user.address = address
    val car = Car()
    car.brand = "VW"
    car.model = "Golf"
    car.price = 25000
    car.pollutionCo2 = 89
    user.car = car*/

    val user_1 = user1 {
        it.surname = "Jan"
        it.name = "Dockx"
        it.address = address1{ thisAddress ->
            thisAddress.number = 100
        }
        it.car = car {
            brand = "VW"
            model = "Golf"
            price = 25000
            pollutionCo2 = 89
        }
    }

    val user_2 = user2 {
        surname = "Jan"
        name = "Dockx"
        address = address2 {
            number = 100
        }
        car = car {
            brand = "VW"
            model = "Golf"
            price = 25000
            pollutionCo2 = 89
        }
    }

    println("Hello,  $user_1!")

    println("Hello,  $user_2!")
}

fun user1(block: (User) -> Unit): User {
    val p = User()
    block(p)
    return p
}

fun user2(block: KotlinUser.() -> Unit): KotlinUser = KotlinUser().apply(block)

fun address1(block: (Address) -> Unit): Address {
    val a = Address()
    block(a)
    return a
}

fun address2(block: Address.() -> Unit): Address = Address().apply(block)


fun car(block: Car.() -> Unit): Car = Car().apply(block)