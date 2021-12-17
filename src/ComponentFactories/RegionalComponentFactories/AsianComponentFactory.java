package ComponentFactories.RegionalComponentFactories;

import ComponentFactories.ComponentFactory;
import ToyProducts.Components.Asian.AsianEngine;
import ToyProducts.Components.Asian.AsianRotorBlade;
import ToyProducts.Components.Asian.AsianWheel;
import ToyProducts.Components.Engine;
import ToyProducts.Components.RotorBlade;
import ToyProducts.Components.Wheel;

public class AsianComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheels() {
        Wheel wheel = new AsianWheel();
        return wheel;
    }

    @Override
    public Engine createEngine() {
        Engine engine = new AsianEngine();
        return engine;
    }

    @Override
    public RotorBlade createRotorBlade() {
        RotorBlade rotorBlade = new AsianRotorBlade();
        return rotorBlade;
    }
    
}
