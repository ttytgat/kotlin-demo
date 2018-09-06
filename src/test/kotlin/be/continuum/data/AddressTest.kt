package be.continuum.data

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException

class AddressTest {

    @Rule
    @JvmField
    val expectedException: ExpectedException = ExpectedException.none()

    @Test
    fun `Create address`() {
        val address = Address(street = "Guldensporenpark", number = 120)
        assertThat(address.street, equalTo("Guldensporenpark"))
        assertThat(address.number, equalTo(120))
    }

    @Test
    fun `Create address with default values`() {
        val address = Address()
        assertThat(address.street, equalTo("Klaverbladstraat"))
        assertThat(address.number, equalTo(7))
    }

    @Test
    fun unimplementedMethod() {
        expectedException.expect(NotImplementedError::class.java)

        Address().unimplementedMethod()
    }

}