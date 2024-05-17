package com.example;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */


public class TASK2 {
    public static void main(String[] args) {
		ArrayList<String> objeto = new ArrayList();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 5 objetos: ");
		int meioLista;
		
		for(int i = 0; i<5; i++){
			objeto.add(input.next());
		}
		meioLista = objeto.size()/2;
		
		objeto.remove(meioLista);
		
		System.out.println(objeto);
	}
}
