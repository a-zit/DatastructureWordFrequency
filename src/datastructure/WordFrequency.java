/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author INT303
 */
public class WordFrequency implements Comparable<WordFrequency>{
    private String word;
    private int count;

    public void increment(){
        count++;
    }

    public WordFrequency(String word) {
        this.count = 1;
        this.word = word;
    }
    
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "WordFrequency{" + "word=" + word + ", count=" + count + '}';
    }

    @Override
    public int compareTo(WordFrequency o) {
        return this.word.compareTo(o.word);
    }
    
}
