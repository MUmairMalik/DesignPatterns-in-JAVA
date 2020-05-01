/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author fast
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FactoryOfFactory ff=new FactoryOfFactory();
        Factory macF=(Factory) ff.getComponent("MAC");
        Components macBtn=macF.getComponent("Button");
        Components macCntnt=macF.getComponent("ContentLoader");
        Components macScrnLck=macF.getComponent("ScreenLocks");
        
        
        Factory winF=(Factory) ff.getComponent("Windows");
        Components winBtn=winF.getComponent("Button");
        Components winCntnt=winF.getComponent("ContentLoader");
        Components winScrnLck=winF.getComponent("ScreenLocks");
        
        
        
        
        
    }
    
}
