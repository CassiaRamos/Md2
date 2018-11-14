import java.util.ArrayList;

public class Anagrama {
	
	static ArrayList<String>lista = new ArrayList<String>(); 
	
	/**
	 * Este metodo imprime o total de anagramas encontrados. 
	 */
	static void mostra_Total() {
		System.out.println("\n");
		System.out.println("O total de anagramas é: " + lista.size());
		System.out.println("\n");
	}
	
	/**
	 * Este metodo imprime todos os anagramas encontrados. 
	 */
	static void imprime_Anagramas() {
		System.out.print(" " + lista); 
	}
	
	/**
	 * Este metodo adiciona os anagramas em uma lista. 
	 */
	private static void add_Lista(char[] vetor) {
		String aux = new String(vetor);
		lista.add(aux);

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