import java.util.Random;
public class cao extends Predador
{
    private animal cao;
    private boolean preso;
       
    
   public cao(String nome){
        super(nome);
        setVida(10000);        
   }
   
   public boolean toogleDormir(){
        setDormir(true);
        setVida(getVida());  
        return true;
    }
    
    public String nome(){
        return getNome();
    }
    
    public boolean atacaRato(rato rato){
        setVida(getVida() - 50); 
        preso = new Random().nextInt(25) == 0;
        if (preso)
        {
            setVida(getVida() + 50);
            return true;
        }
        return false;
    }
    
    public void atacaGato(gato gato){
        setVida(cao.getVida() - 100);          
        setVida(gato.getVida() - 25);
    }
    
    
}
