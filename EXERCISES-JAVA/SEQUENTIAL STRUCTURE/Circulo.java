import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  double raio, Area;
 

  System.out.print("Digite o valor do raio do circulo: ");
  raio = sc.nextDouble();

  Area = 3.14159 * Math.pow(raio,2);

  System.out.print("AREA = " + String.format("%.3f", Area));
 
  
 sc.close();
 }
}
