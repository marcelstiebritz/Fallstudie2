import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Utility Class for decryption and encryption and key creation
 */
public  class Encryption {

    /**
     * The Value for the encryption
     */
    public final static String AES_ENCRYPTION= "AES";
    public static Cipher cipher;
    public static String encrypt(String plainTesxt, SecretKey secretKey) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] plainTextByte = plainTesxt.getBytes();
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[] encryptedByte = cipher.doFinal(plainTextByte);
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(encryptedByte);
        return encryptedText;
    }

    public static String decrypt(String encrptedText, SecretKey secretKey) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encryptedTextByte = decoder.decode(encrptedText);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte [] decryptedByte = cipher.doFinal(encryptedTextByte);
        String decyptedText = new String(decryptedByte);
        return decyptedText;
    }

    /**
     * This Methods sets a new Key but is only neccesary for testing
     * You hardcode the Key that is used all the time
     * @return
     */
    public static String createKey() throws NoSuchAlgorithmException {
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        return encodedKey;
    }

    /**
     * This Method transforms the saved password from String to a secret key
     * Is uses the string saved in the array that is saved on place 0
     * @param args The array that is
     * @return
     */
    public static SecretKey decodeKey(String args[] ){
        byte[] decodedKey = Base64.getDecoder().decode(args[0]);
        SecretKey originalKey = new SecretKeySpec(decodedKey,0,decodedKey.length,"AES");
        return originalKey;
    }
}
