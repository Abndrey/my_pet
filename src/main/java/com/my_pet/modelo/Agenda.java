package main.java.com.my_pet.modelo;

public class Agenda{

    private String tosa;
    private String banho;
    private String checkUp;
    private String consultaMarcada;

    //--------------------------------------- construtor ----------------------------------------------//
    public Agenda(){

    }

    public Agenda( String tosa, String banho, String checkUp, String consultaMarcada ){
        this.tosa = tosa;
        this.banho = banho;
        this.checkUp = checkUp;
        this.consultaMarcada = consultaMarcada;
    }

    //---------------------------------------Encapsulamento gostosa ----------------------------------------------//
    public String getTosa(){
        return this.tosa;
    }

    public void setTosa( String tosa ){
        this.tosa = tosa;
    }

    //---------------------------------------Encapsulamento banho ----------------------------------------------//

    public String getBanho(){
        return this.banho;
    }

    public void setBanho( String banho ){
        this.banho = banho;
    }

    //---------------------------------------Encapsulamento checkup ----------------------------------------------//
    public String getCheckUp(){
        return this.checkUp;
    }

    public void setCheckUp( String checkUp ){
        this.checkUp = checkUp;
    }

    //---------------------------------------Encapsulamento Consulta  ----------------------------------------------//
    public String getConsultaMarcada(){
        return this.consultaMarcada;
    }

    public void setConsultaMarcada( String consultaMarcada ){
        this.consultaMarcada = consultaMarcada;
    }

}

//Fernanda de Fátima Magalhães
