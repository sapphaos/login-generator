package geco;

import java.security.SecureRandom;

public class PasswordGeneration {

    private static SecureRandom random = new SecureRandom();

    private String password;
    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final int longueurmdp = 10;

    /**
     * retourne un mot de passe généré aléatoirement.
     * @return le mot de passe
     */
    public String getRandomPassword() {
        String dictionnaire = ALPHA + ALPHA_CAPS + NUMERIC;
        for (int i = 0; i < longueurmdp; i++) {
            int index = random.nextInt(dictionnaire.length());
            password += dictionnaire.charAt(index);
        }
        return password;
    }
}
