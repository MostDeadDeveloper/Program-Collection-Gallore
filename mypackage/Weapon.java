package mypackage;

public class Weapon extends Item {
    private int damage; 

    public Weapon(String name, double weight, int damage){
        super(name, weight);
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    @Override
    public String toString(){
        return "Name: "+ this.getName() + "\nWeight: "
        + this.getWeight() + "\nDamage: "+ this.getDamage() +"\n";
    }


    @Override
    public boolean use(Object target){
        if ((!(target instanceof Person))){
            return false;
        }
        Person p = (Person) target;

        String message = "Attack " + p.getName() 
        + " with " + this.getName() + " for " + this.getDamage()
        + " damage!" ; 

        System.out.println(message);

        if(p.defends(this.getDamage())){
            System.out.println(p.getName() + " lives!");
        }
        else{
            System.out.println(p.getName() + " is dead!");
        }
        return true;
    }
    
}