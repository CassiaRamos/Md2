import java.util.ArrayList;
import java.util.Iterator;

public class Anagrama {
	
	static ArrayList<String>lista = new ArrayList<String>(); 
	static int juntas = 0, separadas;
	
	/**
	 * Este metodo imprime o total de anagramas encontrados. 
	 */
	static void mostra_Total() {
		System.out.println("\n");
		System.out.println("O total de anagramas é: " + lista.size());
		System.out.println("\n");
	}
	
	/**
	 * Este metodo imprime a quantidade de anagramas com letras juntas. 
	 */
	static void imprime_Juntas() {
		System.out.println("\nQuantidade de anagramas com letras repetidas juntas: " + juntas + "\n");
	}
	
	/**
	 * Este metodo imprime todos os anagramas encontrados. 
	 */
	static void imprime_Anagramas() {
		System.out.println(" " + lista); 
	}
	
	/**
	 * Este metodo verifica se ja existe o anagrama e
	 * adiciona os anagramas em uma lista.
	 * e chama metodos para procurar letras repetidas juntas e separadas. 
	 */
	private static void add_Lista(char[] vetor) {
		String aux = new String(vetor);
		if (!lista.contains(aux)) {
			letras_repetidas(aux);
			lista.add(aux); 
		}

	}
	
	/**
	 * Este metodo calcula a quantidade de anagramas
	 * com letras juntas. 
	 */
	static void letras_repetidas(String p) {
		int i, j;
		for (j = 0; j < p.length(); j++) {
			if (j < p.length() - 1)
				if (p.charAt(j) == p.charAt(j+1)) {
					juntas++;
					break;
				}
		}
	}
	
	/**
	 * Este metodo recebe o vetor contendo a palavra e calcula 
	 * todas as possibilidades de anagrama com esta palavra.
	 * chama o metodo addLista para coloca-las em uma lista.
	 */
	static void calcula_Anagrama(char vetor[], int k) {
		int i;
		if (k == vetor.length - 1) 
			add_Lista(vetor);
		else {
			calcula_Anagrama(vetor, k + 1);
			i = k + 1;
			while (i < vetor.length) {
				troca_Posicao(vetor, k, i);
				calcula_Anagrama(vetor, k + 1);
				troca_Posicao(vetor, k, i);
				i = i + 1;
			}
		}
	}
	
	/**
	 * Este metodo efetua a troca das posições desejadas
	 */
	private static void troca_Posicao(char[] vetor, int k, int i) {
		char aux;
		aux = vetor[i];
		vetor[i] = vetor[k];
		vetor[k] = aux;
	}
	
	/**
	 * Este metodo recebe a palavra e a coloca em um vetor de char
	 */
	static void quebra_Palavra(String palavra, char[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = palavra.charAt(i);
		}
	}
}