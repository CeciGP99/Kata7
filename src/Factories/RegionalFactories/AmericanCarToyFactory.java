package Factories.RegionalFactories;

import Factories.ToyFactory;
import ToyProducts.Models.AmericanCarToy;
import ToyProducts.Toy;

public class AmericanCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy() {
        return new AmericanCarToy();
    }
    
}
