package JavaCodingPuzzles;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz("fabre"));
    }
    public static String fizzBuzz(String word){
        System.out.println("Word: " + word);
        if(word.startsWith("f")){
            return "Fizz";
        }
        if(word.endsWith("b")){
            return "Bizz";
        }
        if(word.startsWith("f") && word.endsWith("b")){
            return "FizzBuzz";
        }
        return word;
    }
}
