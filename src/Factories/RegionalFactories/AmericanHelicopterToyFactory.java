package Factories.RegionalFactories;

import Factories.ToyFactory;
import ToyProducts.Models.AmericanCarToy;
import ToyProducts.Models.AmericanHelicopterToy;
import ToyProducts.Toy;

public class AmericanHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy() {
        return new AmericanHelicopterToy();
    }
    
}
