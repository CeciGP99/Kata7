package ComponentFactories.RegionalComponentFactories;

import ComponentFactories.ComponentFactory;
import ToyProducts.Components.American.AmericanEngine;
import ToyProducts.Components.American.AmericanRotorBlade;
import ToyProducts.Components.American.AmericanWheel;
import ToyProducts.Components.Engine;
import ToyProducts.Components.RotorBlade;
import ToyProducts.Components.Wheel;

public class AmericanComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheels() {
        Wheel wheel = new AmericanWheel();
        return wheel;
    }

    @Override
    public Engine createEngine() {
        Engine engine = new AmericanEngine();
        return engine;
    }

    @Override
    public RotorBlade createRotorBlade() {
        RotorBlade rotorBlade = new AmericanRotorBlade();
        return rotorBlade;
    }
    
}
