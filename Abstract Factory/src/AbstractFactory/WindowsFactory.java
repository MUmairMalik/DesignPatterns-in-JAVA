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
public class WindowsFactory implements Factory{

    public WindowsFactory() {
        System.out.println("Windows Factory has been created");
    
    }
    
    
    
    
    public Components getComponent(String str)
    {
        if(str.equalsIgnoreCase("Button"))
        {
            WindowsButtons b=new WindowsButtons();
            return b;

        }
        else if(str.equalsIgnoreCase("ContentLoader"))
        {
            WindowsContentLoader cl=new WindowsContentLoader();
            return cl;
        }
        else if(str.equalsIgnoreCase("ScreenLocks"))
       {
           WindowsScreenLocks sl=new WindowsScreenLocks();
           return sl;
       }
               
        return null;
    }
}
