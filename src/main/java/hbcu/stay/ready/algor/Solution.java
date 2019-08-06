package hbcu.stay.ready.algor;

import java.util.Hashtable;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText){

        String Message = " ";
        String MagazineText = " ";

        Hashtable<String, Integer> magazineHash = new Hashtable<String, Integer>();
        boolean isValid = true;

        for(String word: magazineText.split(" ")) {
            Integer count = magazineHash.get(word);
            if(count != null) {
                magazineHash.put(word, count +1) ;
            } else {
                magazineHash.put(word, 1) ;
            }
        }

        for(String word: message.split(" ")) {
            Integer count = magazineHash.get(word);

            if(count == null || count == 0) {


        return isValid;
    }
