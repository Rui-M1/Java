import java.util.Random;
public class passaro extends Presa
{
    private animal passaro;
    private boolean vivo;
    private boolean fugiu;
    
    
    public passaro(){
        setVida(20);
        this.vivo = true;
    }
    
    public boolean toogleDormir(){
        setDormir(true);
        setVida(getVida());  
        return true;
    }
       
    public boolean correGato(cao gato){
                 setVida(getVida() - 5);
        fugiu = new Random().nextInt(10) == 0;
        if(toogleDormir() == true)fugiu = new Random().nextInt(2) == 0;
        
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
    
    public boolean voa(){
        setVida(getVida() - 2);
     
        fugiu = new Random().nextInt(25) == 0;
        if(toogleDormir() == true)fugiu = new Random().nextInt(2) == 0;
        
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
