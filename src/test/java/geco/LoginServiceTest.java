package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService log;
    String tests;

    @Before
    public void SetUp() {
        String loginsE[] = {"test","login","tests"};
        log = new LoginService(loginsE);
    }

    @Test
    public void loginExistsTrue() {
        tests = "test";
        assertTrue(log.loginExists(tests));
    }

    @Test
    public void loginExistsFalse() {
        tests = "tester";
        assertFalse(log.loginExists(tests));
    }

    @Test
    public void addLogin() {
        String nouveau = "nouveau";
        log.addLogin(nouveau);
        assertTrue(log.loginExists(nouveau));
    }

    @Test
    public void findAllLoginsStartingWith() {
        assertThat(log.findAllLoginsStartingWith("tes"),containsInAnyOrder("test","tests"));
    }

    @Test
    public void findAllLogins() {
        assertThat(log.findAllLogins(),containsInAnyOrder("tests","test","login"));
    }
}