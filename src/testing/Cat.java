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
public class Cat extends Animal{
    Cat(int height, int age){
        super(height,age);
    }
    Cat(){
        super();
    }
    
    public void sound(){
        System.out.println("Bark barkb");
    }
    
    public void attack(){
        System.out.println("The dog attacksb");
    }
    
    public void getInfo(){
        System.out.printf("The dog is %d tall and %d years oldb", height,age);
    }
}
