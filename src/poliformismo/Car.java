
package poliformismo;

/**
 *Clase que representa un objeto carro
 * @author jeison gaona
 */
public class Car extends PoweredVehicle {
    
    /**
     * variable que guarda el tamaño del motor del auto
     */
    private String myEngineSize;

    /**
     * constructor de la clase 
     * @param myEngineSize tamaño del motor
     */
    public Car(String myEngineSize) {
        this.myEngineSize = myEngineSize;
    }
    
    /**
     *Funcion que imprime el tamaño del motor del carro 
     */
    public void imprimirCarro(){
        System.out.print("Soy un carro "+this.getMyBrand()+" el tamaño de mi motor es "+this.myEngineSize);
    }

    
    /**
     * funcion que imprime que tiene llantas
     */
    @Override
    public void imprimirTengoLLantas() {
        System.out.println(" tengo llantas ");
    }
    
    /**
     * funcion que devuelve el tamaño del motor del carro
     * @return tamaño motor del carro
     */
    public String getMyEngineSize() {
        return myEngineSize;
    }

    /**
     * funcion que cambia el tamaño del motor en el carro
     * @param myEngineSize 
     */
    public void setMyEngineSize(String myEngineSize) {
        this.myEngineSize = myEngineSize;
    }
}
