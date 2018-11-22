package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginGenerator log;
    LoginService logservice;

    @Before
    public void setUp() {
        logservice = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        log = new LoginGenerator(logservice);
    }

    @Test
    public void generateLoginForNomAndPrenomExistsCT1() {
        String prenom = "Paul";
        String nom = "Durand";
        assertEquals("PDUR",log.generateLoginForNomAndPrenom(nom,prenom));
    }

}