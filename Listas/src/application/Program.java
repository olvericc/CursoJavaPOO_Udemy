package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");  //0
		list.add("Alex");	//1
		list.add("Bob");	//2
		list.add("Anna");	//3
		
		// adicionando "Marco" na posicao 2 da lista sem prejudica-la
		list.add(2, "Marco");
		
		// qual tamanho da lista?
		System.out.println("Tamanho: " + list.size());
		
		// mostrando lista no console
		for (String x : list) {
			System.out.println(x);
		}
		
		// remover elemento "Anna" na lista
		//list.remove("Anna");
		
		// remover elemento da posicao 1
		//list.remove(1);
		
		System.out.println("---------------");
		// removendo elemento da lista com base em uma predicado
		list.removeIf(x -> x.charAt(0) == 'M'); // predicado
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		
		// encontrar a posicao de um element na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// o elemento marco nao esta contido na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		// filtrar na lista apenas quem possui a inicial do nome com a letra 'A'
		System.out.println("---------------");
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------");
		// encontrar o primeiro elemento da lista com inicial do nome com a letra 'A'
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		// encontrar o primeiro elemento da lista com inicial do nome com a letra 'J'
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Nome com inicial J: " + name2);
	}

}
