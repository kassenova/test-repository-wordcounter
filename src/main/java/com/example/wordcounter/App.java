package com.example.wordcounter;

import java.util.List;

import org.apache.commons.text.StrMatcher;
import org.apache.commons.text.StrTokenizer;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
    	StrMatcher delim = StrMatcher.charSetMatcher(" ()\n\r\t/!,:;._-");
		List<String> tokens = new StrTokenizer(s, delim).getTokenList();
		return tokens.size();
    }
}
