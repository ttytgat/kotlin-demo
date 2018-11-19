package be.continuum.data;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void createUser() {
        User user = new User();
        user.setSurname("John");
        user.setName("Doe");

        assertThat(user.getSurname(), equalTo("John"));
        assertThat(user.getName(), equalTo("Doe"));
        assertThat(user.getAge(), nullValue());
    }

    @Test
    public void createUserWithAge() {
        User user = createJohnDoeUser();
        user.setAge(30);

        assertThat(user.getAge(), equalTo(30));
    }

    private User createJohnDoeUser() {
        User user = new User();
        user.setSurname("John");
        user.setName("Doe");
        return user;
    }

    @Test
    public void createKotlinUser() {
        KotlinUser user = new KotlinUser();
        user.setSurname("John");
        user.setName("Doe");
        user.setAge(30);

        assertThat(user.getSurname(), equalTo("John"));
        assertThat(user.getName(), equalTo("Doe"));
        assertThat(user.getAge(), equalTo(30));

        assertThat(user.toString(), equalTo("KotlinUser(surname=John, name=Doe)"));
    }

}