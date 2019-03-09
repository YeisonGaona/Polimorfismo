
package poliformismo;

/**
 *Funcion que representa un vehiculo motorizado
 * @author jeiso
 */
public abstract class PoweredVehicle extends Vehicle {
    
    /**
     * Atributo que guarda el tipo de combustible
     */
    private String myFuelType;

    /**
     * Funcion que imprime soy un vehiculo motorizado
     */
    public void imprimirVehiculoMotorizado(){
        System.out.println("Soy un vehiculo motorizado");
    }

    /**
     * Funcion que devuelve el tipo de combustible
     * @return 
     */
    public String getMyFuelType() {
        return myFuelType;
    }

    /**
     * Funcion que cambia el tipo de combustible
     * @param myFuelType tipo de combustible
     */
    public void setMyFuelType(String myFuelType) {
        this.myFuelType = myFuelType;
    }
    
    
}
