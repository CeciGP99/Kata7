package Business;

import Factories.ToyFactory;
import ToyProducts.Toy;
import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    
    private Map<String,ToyFactory> toyFactories = new HashMap<>();

    public ToyBusiness() {}
    
    public void add (String name, ToyFactory f){
        toyFactories.put(name,f);
    }
    
    public Toy produceToy(String name){
        return toyFactories.get(name).produceToy();
    }
}
