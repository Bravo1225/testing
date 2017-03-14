/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author lordv
 */
public class Dog extends Animal{
    
    Dog(int height, int age){
        super(height,age);
    }
    Dog(){
        super();
    }
    
    public void sound(){
        System.out.println("Bark bark");
    }
    
    public void attack(){
        System.out.println("The dog attacks");
    }
    
    public void getInfo(){
        System.out.printf("The dog is %d tall and %d years old\n", height,age);
    }
	public void yell() {
		System.out.println("BARK BARK");
		
	}
    
}
