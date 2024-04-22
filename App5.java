import java.util.Scanner;
 public class App5 {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //lendo e armazenando o valor é o imposto.
    System.out.println("Qual o valor do produto: ");
    double valorProduto = scanner.nextDouble();

    System.out.println("Taxa de Imposto em porcentagem: ");
    double taxaImposto = scanner.nextDouble();

    //Chamando a função com uma quebra de linha.
    System.out.println();
    somaImposto(valorProduto, taxaImposto);
    scanner.close();
 }

 //Função para calcular o valor final do produto com o imposto.
 public static void somaImposto(double valorProduto, double taxaImposto){

    double calculo = valorProduto * taxaImposto;
    double imposto = valorProduto + calculo;
    System.out.printf("O valor final do produto com o imposto é de: R$ %.2f" , imposto);

 }
}

