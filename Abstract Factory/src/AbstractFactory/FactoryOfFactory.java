/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author M Umair Malik
 */
public class FactoryOfFactory {
     public Factory getComponent(String str)
    {
        if(str.equalsIgnoreCase("Windows"))
        {
            WindowsFactory b=new WindowsFactory();
            return b;

        }
        else if(str.equalsIgnoreCase("MAC"))
        {
            MacXFactory cl=new MacXFactory();
            return cl;
        }
        return null;
    }
    
}
