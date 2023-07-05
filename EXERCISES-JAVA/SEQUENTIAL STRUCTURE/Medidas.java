import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  double A, B, C, areaQuadrado, areaTrapezio, areaTriangulo;
  

  System.out.print("Digite a medida A: ");
  A = sc.nextDouble();
  System.out.print("Digite a medida B: ");
  B = sc.nextDouble();
  System.out.print("Digite a medida C: ");
  C = sc.nextDouble();
  
  areaQuadrado = Math.pow(A,2);
  areaTriangulo = (A * B) / 2;
  areaTrapezio = (A + B) * C / 2;

   System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQuadrado));
   System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTriangulo));
   System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTrapezio));
  
 sc.close();
 }
}
