import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  int resto, numero1, numero2;
  
  System.out.print("Digite dois numeros: ");
  numero1 = sc.nextInt();
  numero2 = sc.nextInt();

  resto = numero1 % numero2;
if(numero1 > numero2){
   if(resto == 0){
    System.out.println("Sao multiplos");
}
else{
    System.out.println("Nao sao multiplos");
}
}

if(numero2 > numero1){

  resto = numero2 % numero1;

if(resto == 0){
   System.out.println("Sao multiplos");
}
else{
    System.out.println("Nao sao multiplos");
}
}
if(numero1 == numero2 ){
   System.out.println("Sao Multiplos"); 
}
 
 sc.close();
 }
}
