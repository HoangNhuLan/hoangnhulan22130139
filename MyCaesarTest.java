package Lab1_OneDimensionalArrays;

public class MyCaesarTest {
	public static void main(String[] args) {
        // Tạo một đối tượng MyCaesar với số bước dịch là 3
        MyCaesar caesar = new MyCaesar(3);

        // Ví dụ mã hóa và giải mã ký tự
        char originalChar = 'A';
        char encryptedChar = caesar.encryptChar(originalChar);
        char decryptedChar = caesar.decryptChar(encryptedChar);

        System.out.println("Original Char: " + originalChar);
        System.out.println("Encrypted Char: " + encryptedChar);
        System.out.println("Decrypted Char: " + decryptedChar);
        System.out.println();

        // Ví dụ mã hóa và giải mã chuỗi
        String originalString = "HELLO";
        String encryptedString = caesar.encrypt(originalString);
        String decryptedString = caesar.decrypt(encryptedString);

        System.out.println("Original String: " + originalString);
        System.out.println("Encrypted String: " + encryptedString);
        System.out.println("Decrypted String: " + decryptedString);
        System.out.println();

        // Kiểm tra mã hóa và giải mã tệp tin (cần triển khai)
        String srcFile = "plaintext.txt";
        String encryptedFile = "encrypted.txt";
        String decryptedFile = "decrypted.txt";

        caesar.encrypt(srcFile, encryptedFile);
        caesar.decrypt(encryptedFile, decryptedFile);

        System.out.println("File encryption and decryption completed.");
    }
}

