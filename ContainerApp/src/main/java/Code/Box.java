/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author kenethravindu
 */
public class Box {
    
    private String boxCode;
    private double weight;
    
    // Constructor

    public Box(String boxCode, double weight) {
        this.boxCode = boxCode;
        this.weight = weight;
    }
    
    //Getter

    public String getBoxCode() {
        return boxCode;
    }

    public double getWeight() {
        return weight;
    }
       
}
