import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);

 double largura, comprimento, metroQuadrado, Preco, Area;
 
  System.out.print("Digite a largura do terreno: ");
  largura = sc.nextDouble();
  System.out.print("Digite o comprimento do terreno: ");
  comprimento = sc.nextDouble();
  System.out.print("Digite o valor do metro quadrado: ");
  metroQuadrado = sc.nextDouble();


  Area = largura * comprimento;
  Preco = Area * metroQuadrado;

  System.out.println("Area do terreno = " + String.format("%.2f", Area)); 
  System.out.println("Preco do terreno = " + String.format("%.2f", Preco)); 

 
 sc.close();
 }
} 
