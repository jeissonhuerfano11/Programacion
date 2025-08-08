package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    
    

    
    
    //ataques pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarArianazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }
    
    
    
    //interfaz electrico

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy pikachu y este es mi ataque impacto trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque puño de trueno");
    }
    
}
