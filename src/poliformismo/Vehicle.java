
package poliformismo;

/**
 * Clase que representa un vehiculo
 * @author jeison gaona
 */
public abstract class Vehicle implements Comportamiento {
    
    /**
     * Variable que guarda la marca del vehiculo
     */
    private String myBrand;
    
    /**
     * Variable que guarda el modelo del vehiculo
     */
    private String myModel;

    /**
     * Funcion que imprime soy un vehiculo
     */
    public void imprimirVehiculo(){
        System.out.println("Soy un vehiculo");
    }

    /**
     * Funcion que cambia la marca del vehiculo
     * @param myBrand 
     */
    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    /**
     * Funcion que cambia el modelo del vehiculo
     * @param myModel 
     */
    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }

    /**
     * Funcion que devuelve la marca del vehiculo
     * @return 
     */
    public String getMyBrand() {
        return myBrand;
    }

    /**
     * Funcion que devuelve el modelo del vehiculo
     * @return 
     */
    public String getMyModel() {
        return myModel;
    }
}
