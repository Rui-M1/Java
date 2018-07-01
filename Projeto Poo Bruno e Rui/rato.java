import java.util.Random;
public class rato extends Presa
{
    private animal rato;
    private int energia;
    private boolean vivo;
    private boolean fugiu;
    
    
    public rato(){
        setVida(50);
        this.vivo = true;
      
    }         
   
     public boolean toogleDormir(){
        setDormir(true);
        setVida(getVida());  
        return true;
    }
    
    
    public boolean correCao(cao cao){
        setVida(getVida() - 2);
        fugiu = new Random().nextInt(25) == 0;
        if(toogleDormir() == true) fugiu = new Random().nextInt(2) == 0;
        
        if (fugiu)
            {
               setVida(getVida() + 5);
               vivo = true;
            }
        else 
            {
               vivo = false;
               setVida(0);
            }
        return vivo;
    }
        
    public boolean correGato(gato gato){
        setVida(getVida() - 2);
        fugiu = new Random().nextInt(5) == 0;
        if(toogleDormir() == true) fugiu = new Random().nextInt(2) == 0;
        
        if (fugiu)
            {
               setVida(getVida() + 5);
               vivo = true;
            }
        else 
            {
               vivo = false;
               setVida(0);
            }
        return vivo;
    }
    
}
