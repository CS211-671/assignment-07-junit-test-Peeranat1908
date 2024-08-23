package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    @DisplayName("test username")
    public void testIsUserName(){
        User users = new User("frame");
        assertEquals("frame", users.getUsername());
    }

    @Test
    @DisplayName("testSetPassword")
    public void testSetPassword(){
        User users = new User("frame");
        users.setPassword("1234");
        assertNotNull(users.getPassword());
        assertNotEquals("1234",  users.getPassword());
    }
    @Test
    @DisplayName("testValidatePassword")
    public void testValidatePassword(){
        User users = new User("frame");
        users.setPassword("1234");
        assertTrue(users.validatePassword("1234"));
        assertFalse(users.validatePassword("fake-password"));
    }
}