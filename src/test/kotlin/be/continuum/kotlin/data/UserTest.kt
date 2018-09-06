package be.continuum.kotlin.data

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.nullValue
import org.junit.Assert.assertThat
import org.junit.Test

class UserTest {

    @Test
    fun createUser() {
        val user = User(name = "Doe", surname = "John")

        assertThat(user.surname, equalTo("John"))
        assertThat(user.name, equalTo("Doe"))
        assertThat(user.age, nullValue())
    }

    @Test
    fun `Create user with age`() {
        val user = be.continuum.data.User("John", "Doe")
        user.age = 30

        assertThat(user.age, equalTo(30))
    }

}