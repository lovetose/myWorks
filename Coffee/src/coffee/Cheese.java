/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author Student Lab
 */
public class Cheese extends CondimentDecorator {
    Beverage beverage;

    public Cheese(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 100+beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ",CHEESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSe";
    }
    
    
    
}
