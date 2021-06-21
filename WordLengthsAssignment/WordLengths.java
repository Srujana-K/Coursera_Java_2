package WordLengthsAssignment;

import edu.duke.*;

public class WordLengths {
    public void countWordLengths(FileResource resource, int[] counts) {
        for (String word : resource.words()) {
            int nonLetterCount = 0;
            if (!Character.isLetter(word.charAt(0))) {
                nonLetterCount++;
            }
            if (!Character.isLetter(word.charAt(word.length() - 1))) {
                nonLetterCount++;
            }
            int wordLength = word.length() - nonLetterCount;
            counts[wordLength]++;
        }
    }

    public int indexOfMax(int values[]) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public void testCountWordLengths() {
        FileResource fr = new FileResource();
        int[] counts = new int[31];
        countWordLengths(fr, counts);

        for (int i = 0; i < counts.length; i++) {
            System.out.println("Length " + i + " = " + counts[i] + " words");
        }

        System.out.println("Most common length = " + indexOfMax(counts));
    }
    public static void main(String[] args) {
        // write your code here
        WordLengths wl = new WordLengths();
        wl.testCountWordLengths();
    }
}
