
package poliformismo;

/**
 *Clase que representa el objeto skateboard
 * @author jeison gaona
 */
public class Skateboard extends Vehicle {
    
    /**
     * Variable que guarda la longitud de la skateboard
     */
    private int myBoardLength;

    /**
     * Constructor de la clase 
     * @param myBoardLength 
     */
    public Skateboard(int myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
    /**
     * Funcion que imprime soy un skateboard
     */
    public void imprimirSkateboard(){
        System.out.print("Soy un skateboard");
    }
    
    /**
     * Funcion que imprime tengo llantas
     */
     @Override
    public void imprimirTengoLLantas() {
        System.out.print(" tengo llantas ");
    }

    /**
     * Funcion que imprime cuanto mide el skateboard
     */
    @Override
    public void imprimirVehiculo() {
        System.out.println(" y mido "+this.myBoardLength+" cm");
    }

    /**
     * Funcion que devuelve la longitud del skateboard
     * @return 
     */
    public int getMyBoardLength() {
        return myBoardLength;
    }

    /**
     * Funcion que cambia la longitud del skateboard
     * @param myBoardLength 
     */
    public void setMyBoardLength(int myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

   
    
    
}
