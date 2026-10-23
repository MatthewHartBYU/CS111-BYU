package JavaCodingPuzzles;

public class PhoneNumberValidator {
    public static void main(String[] args){
        isValid("321-338-5872");
        isValid("911");
        isValid("321-555-887");
    }
    public static void isValid(String phoneNumber){
        boolean isValid = phoneNumber.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        if(phoneNumber.equals("911")){
            System.out.println("Government Numbers are Valid");
            isValid = true;
        }
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Valid Phone Number: " + isValid);
    }
}
