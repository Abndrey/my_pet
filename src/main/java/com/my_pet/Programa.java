import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      Pet Pet = new Pet(
        "Jujuba", 
        45, 
        "Put Bull:", 
        "Foto:", 
        "Grande:", 
        "Femea:"
      );
      
      
      Scanner ScPet = new Scanner(System.in);


      System.out.println("/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");


      Responsavel Responsavel = new Responsavel("Digite o seu nome:", "Digite o seu email", "Digite o seu telefone"); // declarando o objeto responsavel
      
      Scanner Scresponsavel = new Scanner(System.in); 
      
      
      Scresponsavel.close(); 
       
              
      System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");
      
      Agenda agenda = new Agenda("Coloque o tipo de tosa","Coloque o banho", "Coloque o checkUp", "Faça sua consulta");
      Scanner ScAgenda = new Scanner(System.in);
      

System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");

Endereco endereco = new Endereco("Digite o seu endereço", "Digite o seu número", "Digite o seu bairro");
Scanner ScEndereco = new Scanner(System.in);
        System.out.println("Digite o seu endereço:");
     

System.out.println("/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");



        Vacina vacina = new Vacina("Digite o nome da vacina:");
        Scanner ScVacina = new Scanner(System.in);

    
System.out.println("/////////////////////////////////");

PetShop petShop = new PetShop("Digite o nome do petShop:", "Digite o email do PetShop", "Digite o seu telefone", "Digite o seu CNPJ");


System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");

Historico historico = new Historico("Carrapato", "Raiva");

        sc.close();


    }
}

//Ythalo Andrey n°10