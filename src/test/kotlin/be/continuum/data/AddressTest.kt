package be.continuum.data

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class AddressTest {

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

}