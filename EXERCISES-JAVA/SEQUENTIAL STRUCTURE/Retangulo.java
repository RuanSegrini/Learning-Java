import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);

 double Base, Altura, Area, Perimetro, Diagonal;
 
  System.out.print("Base do retangulo: ");
  Base = sc.nextDouble();
  System.out.print("Altura do retangulo: ");
  Altura = sc.nextDouble();
  


  Area = Altura * Base;
  Perimetro = 2 * (Base + Altura);
  Diagonal = Math.sqrt(((Altura * Altura) + (Base * Base)));


  System.out.println("AREA = " + String.format("%.4f", Area)); 
  System.out.println("PERIMETRO = " + String.format("%.4f", Perimetro)); 
  System.out.println("DIAGONAL= " + String.format("%.4f", Diagonal)); 
 
 sc.close();
 }
} 
