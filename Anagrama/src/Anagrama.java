

public class Anagrama {
	
	static int total;
	
	
	static void calcula_Total() {
		total++;
		System.out.println("O total de anagramas da palavra é: " + total);
	}
	
	
	/**
	 * Este metodo mostra a palavra. 
	 */
	private static void mostra(char[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}// for
		System.out.println("");
	}
	
	
	/**
	 * Este metodo recebe o vetor contendo a palavra e mostra para o usuario
	 * todas as possibilidades de anagrama com esta palavra.
	 * 
	 */
	static void calcula_Anagrama(char vetor[], int k) {
		int i;
		if (k == vetor.length - 1)
			mostra(vetor);
		else {
			calcula_Anagrama(vetor, k + 1);
			i = k + 1;
			while (i < vetor.length) {
				troca_Posicao(vetor, k, i);
				calcula_Anagrama(vetor, k + 1);
				troca_Posicao(vetor, k, i);
				i = i + 1;
				total ++;
			}
		}
	}
	
	/**
	 * Este metodo efetua a troca das posições desejadas
	 * 
	 */
	
	private static void troca_Posicao(char[] vetor, int k, int i) {
		char aux;
		aux = vetor[i];
		vetor[i] = vetor[k];
		vetor[k] = aux;
	}// fim metodo Troca_Posicao()
	/**
	 
	 
	 * Este metodo recebe a palavra e retorna o vetor contendo
	 * a palavra
	 */
	static void quebra_Palavra(String palavra, char[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = palavra.charAt(i);
		}
	}
}