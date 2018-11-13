import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		String palavra;
        do {
            System.out.println("\n\nANAGRAMA");
            System.out.println("-----------------------------\n");
            System.out.print("Digite a palavra: ");
            palavra = ler.nextLine();
            System.out.println("\n");
            System.out.println("-----------------------------\n");
            System.out.println("Escolha a op��o: ");
            System.out.println("1 - N�mero total de anagramas da palavra.");
            System.out.println("2 - N�mero de anagramas com letras iguais juntas.");
            System.out.println("3 - N�mero de anagremas com letras iguais separadas.");
            System.out.println("4 - Listar todos anagramas.");
            System.out.println("0 - Sair");
            System.out.print("\nOpcao: ");
            opcao = ler.nextInt();
            
            char[] vetor = new char[palavra.length()];
            Anagrama.quebra_Palavra(palavra, vetor);
            
            switch(opcao) {
                case 1: Anagrama.calcula_Total(); break;
//                case 2:  break;
//                case 3: break;
                case 4: Anagrama.calcula_Anagrama(vetor, 0); break;
                case 0: break;
                default: System.out.println("Op��o Invalida");
            }
            
        } while(opcao!=0);

	}

}
