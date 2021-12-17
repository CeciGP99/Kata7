package Factories;

import ToyProducts.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy(){
        Toy toy = createToy();
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy();
    
}
