



    public class Pet {
        
        private String nome;
        private int idade;
        private String raca;
        private String fotoPet;
        private String porte;
        private String sexo;

    

        public Pet() {
            
        }
        
        public Pet(String nome, int idade, String raca, String fotoPet, String porte, String sexo){
            this.nome = nome;
            this.idade = idade;
            this.raca = raca;
            this.fotoPet = fotoPet;
            this.porte = porte;
            this.sexo = sexo;
        }
        
        public String getNome(){
            return this.nome;
        }
        
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public int getIdade(){
            return this.idade;
        }
        
        public void setIdade(int idade){
            this.idade = idade;
        }
        
        public String getRaca(){
            return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String getFotoPet(){
        return this.fotoPet;
    }
    
    public void setFotoPet(String fotoPet){
        this.fotoPet = fotoPet;
    }
    
    public String getPorte(){
        return this.porte;
    }
    
    public void setPorte(String porte){
        this.porte = porte;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
}
    
    
    
   