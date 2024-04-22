import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Inserindo é lendo o número do usuário.
        System.out.println("Digite o valor de n: ");
        int n = scanner.nextInt();

        //chamando a função imprimir.
        imprimir(n);
        scanner.close();
    }

        public static void imprimir(int n){
            //Estrutura de repetição imprimindo o j.
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
                //quebra de linha para separar os números em forma de escadinha.
                System.out.println();
            }
        }
}