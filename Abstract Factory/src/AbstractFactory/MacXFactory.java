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
public class MacXFactory implements Factory {
  
    public MacXFactory() {
        System.out.println("MAC factory has been ccreated");
    }
 
    public Components getComponent(String str)
    {
        if(str.equalsIgnoreCase("Button"))
        {
            MacXButtons b=new MacXButtons();
            return b;

        }
        else if(str.equalsIgnoreCase("ContentLoader"))
        {
            MacXContentLoader cl=new MacXContentLoader();
            return cl;
        }
        else if(str.equalsIgnoreCase("ScreenLocks"))
       {
           MacXScreenLocks sl=new MacXScreenLocks();
           return sl;
       }
               
        return null;
    }

    
}
