package ToyProducts.Models;

import ComponentFactories.ComponentFactory;
import ComponentFactories.RegionalComponentFactories.AmericanComponentFactory;
import Factories.SerialNumberGenerator;
import ToyProducts.Components.Engine;
import ToyProducts.Components.RotorBlade;
import ToyProducts.Components.Wheel;
import ToyProducts.Toy;

public class AmericanHelicopterToy implements Toy{
    
    private Engine engine;
    private RotorBlade rotorBlade;
    private final Integer serialNumber;
    private final String type = "Helicopter";
    private final ComponentFactory componentFactory;
    
    public AmericanHelicopterToy() {
        this.serialNumber = SerialNumberGenerator.getInstance().next();
        this.componentFactory = new AmericanComponentFactory();
    }
    
    public void pack(){
        System.out.println("El " + type + " con número de serie: " + serialNumber.toString() + " está empaquetado.\n");
    }
    
    public void label(){
        System.out.println("El " + type + " con número de serie: " + serialNumber.toString() + " está etiquetado.\n");
    }

    @Override
    public void prepare() {
        this.rotorBlade = componentFactory.createRotorBlade();
        this.engine = componentFactory.createEngine();
        System.out.println("El " + type +  " con número de serie: " + serialNumber.toString() + " está preparado.\n");
    }
}