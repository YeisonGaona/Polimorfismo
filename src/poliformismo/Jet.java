
package poliformismo;

/**
 *Clase que representa un objeto jet
 * @author jeiso
 */
public class Jet extends PoweredVehicle {
    
    /**
     * Variable que representa la capacidad del motor
     */
    private String myEngineCount;

    /**
     * constructor de la clase
     * @param myEngineCount 
     */
    public Jet(String myEngineCount) {
        this.myEngineCount = myEngineCount;
    }
    
    /**
     * Funcion que imprime soy un jet
     */
    public void imprimirJet(){
        System.out.print("Soy un jet modelo "+this.getMyModel());
    }
    
    
      /**
     * Funcion que imprime tengo llantas
     */
    @Override
    public void imprimirTengoLLantas() {
        System.out.print(" tengo llantas ");
    }


    /**
     * Funcion que imprime la capacidad del motor
     */
    @Override
    public void imprimirVehiculoMotorizado() {
        System.out.println("mi motor tiene capacidad de "+this.myEngineCount);
    }
    
    /**
     * Funcion que devuelve la capacidad del motor
     * @return 
     */
    public String getMyEngineCount() {
        return myEngineCount;
    }

    /**
     * funcion que cambia la capacidad del motor
     * @param myEngineCount 
     */
    public void setMyEngineCount(String myEngineCount) {
        this.myEngineCount = myEngineCount;
    }

  
    
}
