public abstract class Predador extends animal
    {
    private String nome;
    
    public Predador(String nome){
    this.nome=nome;
    }
    
    public String getNome(){
    return nome;
    }
    
    public void setNome(String nome){
    this.nome=nome;
    }

  
}
