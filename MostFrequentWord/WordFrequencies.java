package MostFrequentWord;

import edu.duke.*;
import java.util.*;

public class WordFrequencies {
    ArrayList<String> myWords;
    ArrayList<Integer> myFreqs;
    public WordFrequencies() {
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }
    public void findUnique() {
        myWords.clear();
        myFreqs.clear();
        FileResource fr = new FileResource();
        for(String word : fr.words()) {
            int index = myWords.indexOf(word.toLowerCase());
            if (index == -1) {
                myWords.add(word.toLowerCase());
                myFreqs.add(1);
            } else {
                int currentFreq = myFreqs.get(index);
                myFreqs.set(index,  currentFreq + 1);
            }
        }
    }
    public int findIndexOfMax() {
        int maxIndex = -1;
        int maxFreq = Integer.MIN_VALUE;

        for (int i = 0; i < myFreqs.size(); i++) {
            int currentFreq = myFreqs.get(i);

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public void tester() {
        findUnique();

        System.out.println("Number of unique words: " + myWords.size());

        for (int i = 0; i < myWords.size(); i++) {
            System.out.println(myFreqs.get(i) + " " + myWords.get(i));
        }

        int maxIndex = findIndexOfMax();
        System.out.println("The word that occurs most often and its count are: " + myWords.get(maxIndex) + " " + myFreqs.get(maxIndex));
    }
    public static void main(String args[]){
        WordFrequencies wf = new WordFrequencies();
        wf.tester();
    }
}
