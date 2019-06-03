/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        
        String searchedTitle = searched.toUpperCase().trim();
        String modifiedWord = word.toUpperCase().trim();
        
        if (modifiedWord.contains(searchedTitle)){
            return true;
        }
        
        return false;
    }
    
}
