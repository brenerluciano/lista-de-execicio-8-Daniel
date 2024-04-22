import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar;
        do {
            System.out.println("Digite a hora (em formato de 24 horas): ");
            int hora = scanner.nextInt();
            System.out.println("Digite os minutos: ");
            int minutos = scanner.nextInt();
            
            // Chamando a função para converter e exibir a hora
            exibirHora(convertTo12HourFormat(hora, minutos));
            
            // Perguntar ao usuário se deseja continuar
            System.out.println("Deseja converter outra hora? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        
        scanner.close();
    }
    
    // Função para converter a hora para o formato de 12 horas
    public static String convertTo12HourFormat(int hour, int minutes) {
        String periodo;
        if (hour < 12) {
            periodo = "A.M.";
            if (hour == 0) {
                hour = 12;
            }
        } else {
            periodo = "P.M.";
            if (hour != 12) {
                hour -= 12;
            }
        }
        return String.format("%d:%02d %s", hour, minutes, periodo);
    }
    
    // Função para exibir a hora convertida
    public static void exibirHora(String hora) {
        System.out.println("Hora convertida: " + hora);
    }
}