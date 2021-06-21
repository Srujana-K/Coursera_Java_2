package WordPlayAssignment;

public class WordPlay {
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
            return true;
        }
        return false;
    }

    public void testIsVowel() {
        char ch = 'f';
        System.out.println(ch + " is a vowel = " + isVowel(ch));
        ch = 'a';
        System.out.println(ch + " is a vowel = " + isVowel(ch));
    }

    public String replaceVowels(String phrase, char ch) {
        StringBuilder newPhrase = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char curr= phrase.charAt(i);
            if (isVowel(curr)) {
                newPhrase.append(ch);
            } else {
                newPhrase.append(curr);
            }
        }
        return newPhrase.toString();
    }

    public void testReplaceVowels() {
        String phrase = "Hello World";
        char ch = '*';
        System.out.println(phrase + " -> " + replaceVowels(phrase, ch));
    }

    public String emphasize(String phrase, char ch) {
        StringBuilder newPhrase = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char curr = phrase.charAt(i);
            if (Character.toLowerCase(curr) == Character.toLowerCase(ch)) {
                if (i % 2 == 0) {
                    newPhrase.append('*');
                } else {
                    newPhrase.append('+');
                }
            }
            else {
                newPhrase.append(curr);
            }
        }
        return newPhrase.toString();
    }

    public void testEmphasize() {
        String phrase = "dna ctgaaactga";
        char ch = 'a';
        System.out.println(phrase + " with " + ch + " replaced become = " + emphasize(phrase, ch));
        phrase = "Mary Bella Abracadabra";
        ch = 'a';
        System.out.println(phrase + " with " + ch + " replaced become = " + emphasize(phrase, ch));
    }
}
