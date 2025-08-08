package Logica;

public class EjercicioIntegrador {
    
    public static void main(String[] args) {
        
        Squirtile squirtile = new Squirtile ();
        Charmander charmander = new Charmander ();
        Bulbasor bulbasor = new Bulbasor ();
        Pikachu pikachu = new Pikachu ();
        
        
        //ataques
        squirtile.atacarArianazo();
        squirtile.atacarHidroBomba();
        charmander.atacarArianazo();
        charmander.atacarLanzallamas();
        bulbasor.atacarArianazo();
        bulbasor.atacarParalizar();
        pikachu.atacarArianazo();
        pikachu.atacarPunioTrueno();
        
   
    
  }
}
