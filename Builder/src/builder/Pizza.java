/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author M Umair Malik
 */
public class Pizza {
    private String type;
    private String crust;
    private boolean extraTopping;
    private boolean extraSauces;
    private boolean drink;

    private Pizza(PizzaBuilder pb) {
        this.type = pb.type;
        this.crust = pb.crust;
        this.extraTopping = pb.extraTopping;
        this.extraSauces = pb.extraSauces;
        this.drink = pb.drink;
    }
    
    public void printPizza()
    {
        System.out.print(type+" Pizza with "+crust+ " crust");
        if(extraTopping)
        {
            System.out.print(" with extra topping");
        }
        if(extraSauces)
        {
            System.out.print(", with extra sauces");
        }
        if(drink)
        {
            System.out.print("and with a drink");
        }
        System.out.println("");
        
    }
    
    public static class PizzaBuilder
    {
        private String type;
        private String crust;
        private boolean extraTopping;
        private boolean extraSauces;
        private boolean drink;

        public PizzaBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder setExtraTopping(boolean extraTopping) {
            this.extraTopping = extraTopping;
            return this;
        }

        public PizzaBuilder setExtraSauces(boolean extraSauces) {
            this.extraSauces = extraSauces;
            return this;
        }

        public PizzaBuilder setDrink(boolean drink) {
            this.drink = drink;
            return this;
        }
        public Pizza build()
        {
            return new Pizza(this);
        }
        

    }
    
    
}
