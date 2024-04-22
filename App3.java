import java.util.Scanner;

public class App3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //lendo é armazenando os 3 argumentos.
        System.out.println("Primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Terceiro número: ");
        int n3 = scanner.nextInt();

        //Chamando a função com uma quebra de linha.
        System.out.println();
        Somar(n1, n2, n3);

        scanner.close();
    }

    //Função para somar os 3 argumentos.
    public static void Somar(int n1 , int n2 , int n3){

        int soma = n1 + n2 + n3;
        System.out.println("Soma dos números: " + soma);
    }
}
