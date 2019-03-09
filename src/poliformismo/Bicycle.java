
package poliformismo;

/**
 *Clase que representa un objeto bicicleta
 * @author jeison gaona
 */
public class Bicycle extends Vehicle{
    
    /**
     * variable que guarda el tipo de bicicleta
     */
    private String type;

    /**
     * Constructor de la clase
     * @param type tipo de cicla que es
     */
    public Bicycle(String type) {
        this.type = type;
    }
    
  /**
   * funcion que imprime que es una bicicleta
   */
    public void imprimirbicicleta(){
        System.out.print("Soy una bicicleta ");
    }
    
     /**
     * Funcion que imprime que tiene llantas
     */
    @Override
    public void imprimirTengoLLantas() {
        System.out.println(" tengo llantas ");
    }
    
    
    /**
     * funcion que imprime que tipo de cicla que es
     */
    @Override
    public void imprimirVehiculo() {
        System.out.print(this.type);
    }

    /**
     * funcion que devuelve el tipo de bicicleta
     * @return tipo de bicicleta
     */
    public String getType() {
        return type;
    }

    /**
     * funcion que cambia el tipo de bicicleta que es 
     * @param myGearCount 
     */
    public void setType(String myGearCount) {
        this.type = myGearCount;
    } 
    
}
