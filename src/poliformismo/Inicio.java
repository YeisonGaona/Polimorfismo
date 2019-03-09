
package poliformismo;

import java.util.ArrayList;
import java.util.List;

/**
 *Clase que representa el inicio del programa
 * @author jeison gaona
 */
public class Inicio {
    /**
     * lista que guarda todos los vehiculos que se añaden
     */
    List<Vehicle> listaVehiculos=new ArrayList();
    
    /**
     * funcion que añade datos a la lista
     */
    public void anadirDatos(){
        Bicycle a=new Bicycle("semi");
        Bicycle b=new Bicycle("montaña");
        Bicycle c=new Bicycle("estandar");
        
        listaVehiculos.add(a);
        listaVehiculos.add(b);
        listaVehiculos.add(c);

        Car d=new Car("300");
        d.setMyBrand("Renault");
        Car e=new Car("200");
        e.setMyBrand("Mazda");
        Car f=new Car("150");
        f.setMyBrand("BMW");
        
        listaVehiculos.add(d);
        listaVehiculos.add(e);
        listaVehiculos.add(f);

        Jet g=new Jet("1000");
        g.setMyModel("2008");
        Jet h=new Jet("2100");
        h.setMyModel("2012");
        Jet i=new Jet("1800");
        i.setMyModel("2000");

        listaVehiculos.add(g);
        listaVehiculos.add(h);
        listaVehiculos.add(i);

        Skateboard j=new Skateboard(80);
        Skateboard k=new Skateboard(100);
        Skateboard l=new Skateboard(90);
        
        listaVehiculos.add(j);
        listaVehiculos.add(k);
        listaVehiculos.add(l);
    }
    
    /**
     * Funcion que imprime los datos existentes en la lista
     */
    public void imprimirDatos(){
        for(Vehicle vehiculoTemporal:listaVehiculos){
            if(vehiculoTemporal instanceof Bicycle){
                Bicycle b=(Bicycle)vehiculoTemporal;
                b.imprimirbicicleta();
                b.imprimirVehiculo();
                b.imprimirTengoLLantas();
            }
            
            if(vehiculoTemporal instanceof Car){
                Car b=(Car)vehiculoTemporal;
                b.imprimirCarro();
                b.imprimirTengoLLantas();
            }
            
            if(vehiculoTemporal instanceof Jet){
                Jet b=(Jet)vehiculoTemporal;
                b.imprimirJet();
                b.imprimirTengoLLantas();
                b.imprimirVehiculoMotorizado();
                
            }
            
            if(vehiculoTemporal instanceof Skateboard){
                Skateboard b=(Skateboard)vehiculoTemporal;
                b.imprimirSkateboard();
                b.imprimirTengoLLantas();
                b.imprimirVehiculo();
            }
        }
    }
    
}
