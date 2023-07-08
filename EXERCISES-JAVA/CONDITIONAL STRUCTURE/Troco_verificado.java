import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  int Quantidade;
  double Recebido, Preco, troco, faltam;
  
  System.out.print("Preco unitario do produto: ");
  Preco = sc.nextDouble();
  System.out.print("Quantidade comprada: ");
  Quantidade = sc.nextInt();
  System.out.print("Dinheiro recebido: ");
  Recebido = sc.nextDouble();
  
  troco = Recebido - (Quantidade * Preco);

  if(troco < 0){
    faltam = (Quantidade * Preco) - Recebido;
    System.out.println("DINHEIRO INSUFICIENTE.FALTAM " + String.format("%.1f ", faltam) + "REAIS");
  }
  else{
    System.out.println("TROCO = " + String.format("%.1f", troco));
  }
 
 sc.close();
 }
}
