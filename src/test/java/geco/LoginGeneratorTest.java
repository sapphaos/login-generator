package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginGenerator log;
    LoginService logservice;

    @Before
    public void setUp() {
        String loginsE[] = {"AGAI"};
        logservice = new LoginService(loginsE);
        log = new LoginGenerator(logservice);
    }

    @Test
    public void generateLoginForNomAndPrenomExistsFalse() {
        String prenom = "Jean";
        String nom = "Dupont";
        assertEquals("JDUP",log.generateLoginForNomAndPrenom(nom,prenom));
    }

    @Test
    public void generateLoginForNomAndPrenomExistsTrue() {
        String prenom = "Apolline";
        String nom = "Gaillard";
        assertEquals("AGAI1",log.generateLoginForNomAndPrenom(nom,prenom));
    }
}