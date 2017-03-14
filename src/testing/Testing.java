
package testing;


public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dog Dog = new Dog(30,14);
        Cat Cat = new Cat();
        
        Dog.attack();
        Cat.attack();
        
        Dog.sound();
        Cat.sound();
        
        Dog.getInfo();
        Cat.getInfo();
        
        Dog.yell();
        Cat.scratch();
    
    }
    
}
