package dagger2example;

import javax.inject.Inject;

public class CoffeeBean {

    public CoffeeBean(){
        //System.out.println("CoffeeBean("+this.toString()+") created");
    }

    public void name(){
        System.out.println("normal bean");
    }
}
