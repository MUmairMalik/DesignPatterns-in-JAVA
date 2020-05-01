/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.Pizza.PizzaBuilder;

/**
 *
 * @author M Umair Malik
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PizzaBuilder p= new PizzaBuilder();
        Pizza pizza=p.setType("Chicken Fajita").setCrust("thin").setExtraTopping(true).setExtraSauces(true).build();
        pizza.printPizza();
    }
    
}
