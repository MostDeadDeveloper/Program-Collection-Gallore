
package mypackage;

public class Person{
    private String name ; 
    private int health; 
    public Person(String name){
        this.name = name; 
        this.health = 100;
    }

    public String getName(){
        return this.name; 
    }

    public int getHealth(){
        return this.health;
    }

    public String toString(){
        return "Name: "+this.getName()+"\n"+"Health: "+this.getHealth()+"\n";
    }

    public boolean isAlive(){
        return  this.health != 0;
    }

    public boolean heal(int boost){
        int current_health = this.health;

        if (current_health != 0){
            if ((current_health + boost) >= 100 ){
                this.health = 100;
            }
            else{
                this.health += boost;
            }
        }

        return this.isAlive();
    }

    public boolean defends(int damage){
        if((this.health - damage) <= 0 ){
            this.health = 0 ;
        }
        else{
            this.health -= damage; 
        }
        return this.isAlive();
    }
}