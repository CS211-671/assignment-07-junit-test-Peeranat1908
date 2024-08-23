package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "user1-password");
        users.addUser("user2", "user2-password");
        users.addUser("user3", "user3-password");

        // TODO: find one of them
        User user = users.findUserByUsername("user1");
        // TODO: assert that UserList found User
        String expected = "user1";
        String actual = user.getUsername();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "user1-password");
        users.addUser("user2", "user2-password");
        users.addUser("user3", "user3-password");
        // TODO: change password of one user
        boolean actual = users.changePassword("user1", "user1-password", "1234");
        // TODO: assert that user can change password
        // assertTrue(actual);
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "user1-password");
        users.addUser("user2", "user2-password");
        users.addUser("user3", "user3-password");
        // TODO: call login() with correct username and password
        User expected = users.findUserByUsername("user1");
        User actual = users.login("user1", "user1-password");
        // TODO: assert that User object is found
        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "user1-password");
        users.addUser("user2", "user2-password");
        users.addUser("user3", "user3-password");
        // TODO: call login() with incorrect username or incorrect password
        User actual = users.login("user1", "user2-password");
        // TODO: assert that the method return null
        // assertNull(actual);
        assertNull(actual);
    }

}