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
abstract public class Animal {
    
    int height,age;
    
    Animal(int height, int age){
        this.height = height;
        this.age = age;
    }
    Animal(){
        height = 0;
        age = 0;
    }
    
    abstract public void sound();
    abstract public void attack();
    
    
}

