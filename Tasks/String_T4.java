public class String_T4 {

    public static String encrypt(String password, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : password.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                char shiftedChar = (char) ((c - 'a' + key) % 26 + 'a');
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }


    public static void main(String[] args) {
        String pass = "abcdz";
        int key = 4;

        String encryptedPass = encrypt(pass, key);
        System.out.println("Encrypted Password: " + encryptedPass);
    }
}