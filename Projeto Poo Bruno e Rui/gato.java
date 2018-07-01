    import java.util.Random;
public class gato extends Predador
{
    private animal gato;
    private boolean preso;
    
   
    
    public gato(String nome){
        super(nome);
        setVida(500);
    }
    
    public boolean toogleDormir(){
        setDormir(true);
        setVida(getVida()); 
        return true;
    }
    
    public String getNome(){
        return getNome();
    }
    
    public boolean atacaRato(rato rato){
        setVida(getVida() - 25); 
        preso = new Random().nextInt(5) == 0;
        if (preso)
        {
            setVida(getVida() + 50);
            return true;
        }
        else return false;
    }
    
    public boolean atacaPassaro(passaro passaro){
        setVida(getVida() - 25);
        preso = new Random().nextInt(10) == 0;
        if (preso)
        {
            setVida(getVida() + 20);
            return true;
        }
        else return false;
    }
       
}
