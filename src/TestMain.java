import javax.crypto.Cipher;
import javax.crypto.SecretKey;


public class TestMain {
    public static void main(String[] args) throws Exception {
        SecretKey originalKey = Encryption.decodeKey(args);
        Encryption.cipher = Cipher.getInstance(Encryption.AES_ENCRYPTION);
        // Passwort
        String plainText = "Hallo Was geht ";
        // Verschlüssel des Passworts
        String encryptedText = Encryption.encrypt(plainText, originalKey);
        // Entschlüseln des Passworts
        String decryptedText = Encryption.decrypt(encryptedText,originalKey);
        // Ausgabe des Entschlüsselten Passworts zu testzwecken
        System.out.println(decryptedText);
    }
}
