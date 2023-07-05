import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  String nome;
  double valor, trabalhadas;
  int horas;

  
 

  System.out.print("Nome: ");
  nome = sc.nextLine();
  System.out.print("Valor por hora: ");
  valor = sc.nextDouble();
  System.out.print("Horas trabalhadas: ");
  horas = sc.nextInt();

  trabalhadas = horas * valor;

   System.out.println("O pagamento para " + nome + " deve ser "+ String.format("%.2f", trabalhadas));
 
  
 sc.close();
 }
}
