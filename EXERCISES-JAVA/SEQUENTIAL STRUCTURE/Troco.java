import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  double preco, recebido, Troco;
  int quantidade;

  System.out.print("Preco unitario do produto: ");
  preco = sc.nextDouble();
  System.out.print("Quantidade comprada: ");
  quantidade = sc.nextInt();
  System.out.print("Dinheiro recebido: ");
  recebido = sc.nextDouble();

  Troco = recebido - (preco * quantidade);

  System.out.println("TROCO = " + String.format("%.2f", Troco));
  
 sc.close();
 }
}
