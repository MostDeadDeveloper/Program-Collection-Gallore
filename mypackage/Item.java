
package mypackage;

public class Item {
    protected String name ;
    protected double weight ; 

    public Item(String name, double weight){
        this.name = name;
        this.weight = weight ; 
    }


    public String getName(){
        return this.name ;  
    }

    public double getWeight(){
        return this.weight;
    }


    public void setName(String name ){
        this.name = name ; 
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String toString(){
        return "Name: "+ this.getName() + "\nWeight: " +this.getWeight() + "\n";
    }
    public boolean use(Object Target){
        System.out.println("Not Usable");
        return false;
    }


    
}