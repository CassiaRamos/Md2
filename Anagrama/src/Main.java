import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		String palavra;
		
		System.out.println("\n\nANAGRAMA");
        System.out.println("-----------------------------\n");
        System.out.print("Digite a palavra: ");
        palavra = ler.nextLine();
        System.out.println("\n");
        
        char[] vetor = new char[palavra.length()];
        Anagrama.quebra_Palavra(palavra, vetor);
        Anagrama.calcula_Anagrama(vetor, 0);
        
        do {
            System.out.println("-----------------------------\n");
            System.out.println("Escolha a opção: ");
            System.out.println("1 - Número total de anagramas da palavra.");
            System.out.println("2 - Número de anagramas com letras iguais juntas.");
            System.out.println("3 - Número de anagramas com letras iguais separadas.");
            System.out.println("4 - Listar todos anagramas.");
            System.out.println("0 - Sair");
            System.out.print("\nOpcao: ");
            opcao = ler.nextInt();
 
            switch(opcao) {
                case 1: Anagrama.mostra_Total(); break;
                case 2: Anagrama.imprime_Juntas(); break;
                case 3: Anagrama.imprimeSeparadas(); break;
                case 4: Anagrama.imprime_Anagramas2(); break; 
                case 0: break;
                default: System.out.println("Opção Invalida");
            }
            
        } while(opcao!=0);

	}

}
