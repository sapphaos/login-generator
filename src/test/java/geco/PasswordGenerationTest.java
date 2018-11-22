package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration psswd;

    @Before
    public void setUp() {
        psswd = new PasswordGeneration();
    }

    @Test
    public void getRandomPasswordLength() {
        assertEquals(8,psswd.getRandomPassword().length());
    }
}