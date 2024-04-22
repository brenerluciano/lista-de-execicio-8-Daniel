import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //lendo é armazenando n.
    System.out.println("Insira o número: ");
    int n = scanner.nextInt();

    //Chamando a função Caractere.
    System.out.println();
    Caractere(n);

    scanner.close();
}

//Função caractere.
public static void  Caractere(int n){
    //Condição, para validar se n e positivo ou não.
    if(n > 0 && n > 1){
        System.out.println("P");
    }else{
        System.out.println("N");
    }
}
    
}
