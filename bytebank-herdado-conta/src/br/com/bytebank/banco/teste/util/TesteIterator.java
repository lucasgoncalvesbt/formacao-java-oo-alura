package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
	}

}
