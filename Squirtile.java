package Logica;

public class Squirtile extends Pokemon implements IAgua{

    public Squirtile() {
    }

    
    
    
    //ataques pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtile y este es mi ataque placaje");
    }

    @Override
    protected void atacarArianazo() {
        System.out.println("Hola soy Squirtile y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squistile y este es mi ataque mordisco");
    }
    
    
    //interfaz agua

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirtile y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtile y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolAgua() {
        System.out.println("Hola soy Squirtile y este es mi ataque pistola de agua");
    }
    
    
}
