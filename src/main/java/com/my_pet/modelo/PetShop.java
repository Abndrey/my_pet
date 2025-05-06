

public class PetShop{

    private String nome;
    private String email;
    private String telefone;
    private String cnpj;

        //--------------------------------------- construtor ----------------------------------------------//

    public PetShop(){
    }

    public PetShop( String nome, String email, String telefone, String cnpj ){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }
    
    //---------------------------------------Encapsulamento nome ----------------------------------------------//
    public String getNome(){
        return this.nome;
    }

    public void setNome( String nome ){
        this.nome = nome;
    }

    //---------------------------------------Encapsulamento email ----------------------------------------------//
    public String getEmail(){
        return this.email;
    }

    public void setEmail( String email ){
        this.email = email;
    }

    //---------------------------------------Encapsulamento Telefone ----------------------------------------------//
    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone( String telefone ){
        this.telefone = telefone;
    }

    //---------------------------------------Encapsulamento Cnpj ----------------------------------------------//
     public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj( String cnpj ){
        this.cnpj = cnpj;
    }

} //Fernanda de Fátima Magalhães
