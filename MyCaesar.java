package Lab1_OneDimensionalArrays;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;// shift steps (right shift)

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	// Encrypt a character according to the given shif steps.
	// Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET
	// array
	public char encryptChar(char c) {
		if (Character.isLetter(c)) {
            int index = (Character.toUpperCase(c) - 'A' + n) % 26;
            if (index < 0) {
                index += 26; 
            }
            char encryptedChar = ALPHABET[index];
            return Character.isLowerCase(c) ? Character.toLowerCase(encryptedChar) : encryptedChar;
        }
        return c;
	}

	// Encrypt a text using the above function for encrypting a charater.
	public String encrypt(String input) {
		 StringBuilder encryptedText = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            encryptedText.append(encryptChar(c));
	        }
	        return encryptedText.toString();
	}

	// Decrypt a character according to the given shif steps.
	// Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in the ALPHABET
	// array
	public char decryptChar(char c) {
		if (Character.isLetter(c)) {
            int index = (Character.toUpperCase(c) - 'A' - n) % 26;
            if (index < 0) {
                index += 26; // Xử lý trường hợp chỉ số âm
            }
            char decryptedChar = ALPHABET[index];
            return Character.isLowerCase(c) ? Character.toLowerCase(decryptedChar) : decryptedChar;
        }
        return c;
	}

	// Decrypt a encrypted text using the above function for decrypting a charater.
	public String decrypt(String input) {
		StringBuilder decryptedText = new StringBuilder();
        for (char c : input.toCharArray()) {
            decryptedText.append(decryptChar(c));
        }
        return decryptedText.toString();
	}

	// Encrypt a encrypted the text content in the srcfile and save it into desFile.
	public void encrypt(String srcFile, String desFile) {
		// TODO
	}

	// Decrypt a encrypted the text content in the srcfile and save it into desFile.
	public void decrypt(String srcFile, String desFile) {
		// TODO
	}
}

