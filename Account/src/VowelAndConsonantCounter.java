public class VowelAndConsonantCounter {
    private int[] value;

    public void getVowelAndConsonant(String word) {
        int vowel = 0;
        int consonant = 0;
        String lower = word.toLowerCase();

        for(int counter = 0; counter < word.length(); counter++){
            //char check = lower.charAt(counter);
            if(word.charAt(counter) == 'a' || word.charAt(counter) == 'e' || word.charAt(counter) == 'i' || word.charAt(counter) == 'o' || word.charAt(counter) == 'u'){
             vowel++;
            } else {
                consonant++;
            }
        }
        this.value = new int[] {vowel, consonant};
    }

    public int[] count() {
        return value;
    }
}
