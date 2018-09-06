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
        assertThat(user.toString(), equalTo("User(surname=John, name=Doe)"))
    }

    @Test
    fun `Create user with age`() {
        val user = createJohnDoeUser()
        user.age = 30

        assertThat(user.getFullName(), equalTo("John Doe"))
        assertThat(user.age, equalTo(30))
        assertThat(user.toString(), equalTo("User(surname=John, name=Doe)"))
    }

    private fun createJohnDoeUser() = User("John", "Doe")

    private fun User.getFullName(): String {
        return surname + name
    }

    @Test
    fun createUserCopy() {
        val user = createJohnDoeUser()
        assertThat(user.surname, equalTo("John"))
        assertThat(user.name, equalTo("Doe"))
        assertThat(user.age, nullValue())

        val copy = user.copy(surname = "Johan")
        assertThat(copy.surname, equalTo("Johan"))
        assertThat(copy.name, equalTo("Doe"))
        assertThat(copy.age, nullValue())
    }

    @Test
    fun destructuringDeclaration() {
        val user = createJohnDoeUser()
        val (surname, name) = user

        assertThat(surname, equalTo("John"))
        assertThat(name, equalTo("Doe"))
    }

}