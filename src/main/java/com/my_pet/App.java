import java.util.Scanner;

public class App{
 
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);   
 
          Vacina vacina = new Vacina();
 
          vacina.nomeVacina= sc.nextLine();
 
 
 
         sc.close();
 
     

    }
}