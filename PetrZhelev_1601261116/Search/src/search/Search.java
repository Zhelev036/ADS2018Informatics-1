/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Arrays;

/**
 *
 * @author Admin
 */

public class Search {
    public static void main(String[] args) {
 
        MyText t = new MyText(4);
        t.add(new String("Symbolic"));
        t.add(new String("string"));
        t.add(new String("with"));
        t.add(new String("words"));
        
        
        
        System.out.println("All string: "+Arrays.toString(t.getMyTexts())+"\n");
        
        String ourWord = t.find("with");
        System.out.println(ourWord);        // returns word that we search
        
        String notOurWord = t.find("words ");
        System.out.println(notOurWord);     // returns null if word doesn't exist
        
    }
}
    
    
class MyText {
 
    private String[] myTexts;
    private String word;
    private int size = 0;
 
    public MyText(String word) {
        this.word = word;
    }
 
    public MyText(int size) {
        this.size = size;
        this.size = 0;
        this.myTexts = new String[size];
    }
 
    public void add(String text) {
        myTexts[size] = text;
        size++;
    }
 
    public String find(String word) {
        for (int i = 0; i < myTexts.length; i++) {
            if (myTexts[i].equals(word)) {
                return myTexts[i];          // return word that we found
            }
        }
       return null;                         // return null if we don't find the word
    }
    
    public String[] getMyTexts() {
        return myTexts;
    }
 
    public void setMyTexts(String[] myTexts) {
        this.myTexts = myTexts;
    }
 
    public String getWord() {
        return word;
    }
 
    public void setWord(String word) {
        this.word = word;
    }
 
    public int getSize() {
        return size;
    }
 
    public void setSize(int size) {
        this.size = size;
    }
}
    
