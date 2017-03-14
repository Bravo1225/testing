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
        height = 1;
        age = 1;
    }
    
    public void sound(){
        System.out.println("Meow Meow");
    }
    
    public void attack(){
        System.out.println("The cat attacks");
    }
    
    public void getInfo(){
        System.out.printf("The cat is %d tall and %d years old\n", height,age);
    }
}
