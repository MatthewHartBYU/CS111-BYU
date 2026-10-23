package JavaCodingPuzzles;

public class PasswordHasher {
    public static void main(String[] args) {
        System.out.println(hashPassword("Aloha"));
    }
    public static String hashPassword(String password){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*();'.,?";
        String hashedPassword = "";
        for(int i = 0; i<password.length(); i++){
            int index = (int)(Math.random() * characters.length());
            hashedPassword += characters.charAt(index);
        }
        return hashedPassword;
    }
}
