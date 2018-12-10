/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

//Adriano Nannini 12/8/18

//step 1
public class Square {

    private double side;
    
    //step 2.  Sets side if given value is above 0.0
    public double setSide(double side){
        if(side > 0.0) return this.side = side;
        else return this.side = 1.0;
    }
    
    //step 3.  Retrieves value of side
    private double getSide(){
        return this.side;
    }
    
    //step 4.  Takes 1 argument, uses setSide method
    public double uselessMethod(double s){
        return this.side = setSide(s);
    }
    
    //step 5. find area of square
    private double computeArea(double side){
        return side * side;
    }
    
    //step 6. create toString method to return String containing result
    @Override
    public String toString(){
        return String.format("A square with a side of %.2f has an area of %.2f",getSide(), computeArea(side));
    }
}
