
package ComponentFactories;

import ToyProducts.Components.Engine;
import ToyProducts.Components.RotorBlade;
import ToyProducts.Components.Wheel;

public abstract class ComponentFactory {
    
    public abstract Wheel createWheels();
    public abstract Engine createEngine();
    public abstract RotorBlade createRotorBlade();
    
}
