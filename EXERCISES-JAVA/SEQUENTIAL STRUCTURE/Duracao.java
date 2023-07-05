import java.util.Locale;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
  
  int duracao, segundos, minutos, horas;
  
  System.out.print("Digite a duracao em segundos: ");
  duracao = sc.nextInt();

  segundos = duracao % 60;
  minutos = (duracao / 60) % 60;
  horas = (duracao / 60) / 60  ;
  

   System.out.println( horas +":" + minutos + ":" + segundos );
   
 sc.close();
 }
}
