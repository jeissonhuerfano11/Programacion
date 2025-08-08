package Logica;

public class Bulbasor extends Pokemon implements IPlanta{

    public Bulbasor() {
    }

    
    
    //ataques pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasor y este es mi ataque placaje");
        
    }

    @Override
    protected void atacarArianazo() {
        System.out.println("Hola soy Bulbasor y este es mi ataque arañazo");
        
    }
        

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasor y este es mi ataque mordisco");
        
    }
    
    
    //interfaz Plata
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasor y este es mi ataque drenaje");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy bulbasor y este es mi ataque paralizar");
    }
    
}
