package com.example;
import java.util.Scanner;
/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Digite uma palavra para verificar se ela é um palíndromo: ");
		String palavra = input.next();
		
		String palavraInvertida = "";
		
		for(int i = (palavra.length()-1); i>=0; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		if(palavraInvertida.equals(palavra)) {
			System.out.println("A palavra '"+ palavra + "' é um palíndromo");
		} else {
			System.out.println("A palavra '"+ palavra +"' não é um palíndromo");
		}
     }
}
