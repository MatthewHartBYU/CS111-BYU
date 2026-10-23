public class VowelCount {
    public static void main(String[] args){
        System.out.println(numVowels("Programming")); // Output: 3
    }
    public static int numVowels(String word){
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (current == vowels[j]) {
                    count++;
                    break; // No need to check the other vowels
                }
            }
        }
        return count;
    }
}
