package ToyProducts.Models;

import ComponentFactories.ComponentFactory;
import ComponentFactories.RegionalComponentFactories.AsianComponentFactory;
import Factories.SerialNumberGenerator;
import ToyProducts.Components.Engine;
import ToyProducts.Components.Wheel;
import ToyProducts.Toy;
import java.lang.reflect.Array;

public class AsianCarToy implements Toy{
    
    private Engine engine;
    private final Wheel wheels[] = new Wheel[4];
    private final Integer serialNumber;
    private final String type = "Car";
    private final ComponentFactory componentFactory;
    

    public AsianCarToy() {
        this.serialNumber = SerialNumberGenerator.getInstance().next();
        this.componentFactory = new AsianComponentFactory();
    }
    
    public void pack(){
        System.out.println("El " + type +  " con número de serie: " + serialNumber.toString() + " está empaquetado.\n");
    }
    
    public void label(){
        System.out.println("El " + type +  " con número de serie: " + serialNumber.toString() + " está etiquetado.\n");
    }

    @Override
    public void prepare() {
        for (Wheel wheel : wheels) {
            wheel = componentFactory.createWheels();
        }
        this.engine = componentFactory.createEngine();
        System.out.println("El " + type +  " con número de serie: " + serialNumber.toString() + " está preparado.\n");
    }
}
