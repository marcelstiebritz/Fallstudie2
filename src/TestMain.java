

import javax.crypto.Cipher;
import javax.crypto.SecretKey;


public class TestMain {
    public static void main(String[] args) throws Exception {
        SecretKey originalKey = EncryptionUtility.decodeKey(args);
        EncryptionUtility.cipher = Cipher.getInstance(EncryptionUtility.AES_ENCRYPTION);
        // Passwort
        String plainText = "Hallo Was geht ";
        // Verschlüssel des Passworts
        String encryptedText = EncryptionUtility.encrypt(plainText, originalKey);
        // Entschlüseln des Passworts
        String decryptedText = EncryptionUtility.decrypt(encryptedText,originalKey);
        // Ausgabe des Entschlüsselten Passworts zu testzwecken
        System.out.println(decryptedText);
    }
}
