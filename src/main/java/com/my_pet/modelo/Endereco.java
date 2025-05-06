package main.java.com.my_pet.modelo;

public class Endereco { 
    private String rua;
    private String num;
    private String bairro;

    //--------------------------------------- construtor ----------------------------------------------//

    public Endereco() {
    }

    public Endereco(String rua, String num, String bairro) {
        this.rua = rua;
        this.num = num;
        this.bairro = bairro;
    }

//---------------------------------------Encapsulamento rua ----------------------------------------------//
public void setRua(String rua) {
    this.rua = rua;
}

public String getRua() {
    return this.rua;
}

//---------------------------------------Encapsulamento num ----------------------------------------------//
public void setNum(String num) {
    this.num = num;
}

public String getNum() {
    return this.num;
}

//---------------------------------------Encapsulamento bairro ----------------------------------------------//
public void setBairro(String bairro) {
    this.bairro = bairro;
}

public String getBairro() {
    return this.bairro;
}
}
