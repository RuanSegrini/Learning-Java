import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);

  String nome1, nome2;
  int idade2, idade1;
  double media;
 
  System.out.print("Dados da primeira pessoa: \n");
  System.out.print("Nome: ");
  nome1 = sc.nextLine(); 
  System.out.print("Idade: ");
  idade1 = sc.nextInt();
  System.out.print("Dados da segunda pessoa: \n");
  System.out.print("Nome: ");
  sc.nextLine(); 
  nome2 = sc.nextLine(); 
  System.out.print("Idade: ");
  idade2 = sc.nextInt();

  media = (idade1 + idade2)/2.0;

  System.out.println("A idade média de " + nome1 + " e " + nome2 + " e de " + String.format("%.1f", media) + " anos");
  
 sc.close();
 }
}
