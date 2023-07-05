import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  double consumoMedio, gasto;
  int Distancia;

  System.out.print("Distancia percorrida: ");
  Distancia = sc.nextInt();
  System.out.print("Combustivel gasto: ");
  gasto = sc.nextDouble();
  
  consumoMedio = Distancia / gasto;

   System.out.println("Consumo medio = " + String.format("%.3f", consumoMedio));
  
 sc.close();
 }
}
