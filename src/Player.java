import java.util.*;
public class Player {
    String nam;
    int ag;
    double h;
    Room location;
    ArrayList<Item> inv = new ArrayList<>();
    Weapon wAct;
    boolean ali;
    Player(){
        
    }
    Player(String name, int age, double hp, Room loc, Weapon equip, boolean alive){
        nam = name;
        ag = age;
        h = hp;
        location = loc;
        wAct = equip;
        ali = alive;
    }
    public String getName(){
        return nam;
    }
    public int getAge(){
        return ag;
    }
    public double getHp(){
        return h;
    }
    public void setName(String t){
        nam = t;
    }
    public void setAge(int tt){
        ag = tt;
    }
    public void setHp(double xx){
        h = xx;
    }
    public void decHp(double amt){
        h = h - amt;
    }
    public void incHp(double amtt){
        h = h + amtt;
    }
    public void incAge(int amt1){
        ag = ag + amt1;
    }
    public boolean getAlive(){
        return ali;
    }
    public void setLoc(Room a){
        location = a;
    }
    public Room getLoc(){
        return location;
    }
    public void addInv(int slot, Item a){
        if(slot < 6){
            inv.add(slot, a);
        }
    }
    public void addInv(Item a){
        if(inv.size() < 6){
            inv.add(a);
            System.out.println("Added " + a.getName() + " to Inv!");
        }
        else if(inv.size() > 6){
            System.out.println("Oops, looks like your Inv is full!");
        }
    }
    public ArrayList<Item> getInv(){
        return inv;
    }
    public void killPlayer(){
        ali = false;
    }
    public void Eat(Food f, int ss){
        this.incHp(f.getHPA());
        inv.remove(ss);
    }
    public int whereis(String x){
        int inc = 0;
        int slott = -1;
        if(!inv.isEmpty()){
            for(Item xx : this.inv){
                String xa = xx.getName();
                if(xa.equalsIgnoreCase(x)){
                    slott = inc;
                }
                inc++;
                }
            }
        else{
            slott = -1;
        }
        return slott;
    }
    public void printStats(){
        System.out.println("Stats for player: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("HP: " + this.getHp());
        System.out.println("Equipped Weaponry: ");
        boolean hasW = false;
        if(wAct != null){
            System.out.println(wAct.getName());
            hasW = true;
        }
        else{
            System.out.println("None");
        }
    }
    public void equip(int slot){
        if(inv.get(slot) instanceof Weapon){
            Weapon weat = (Weapon) inv.get(slot);
            wAct = weat;
            inv.remove(slot);
            System.out.println("Equipped: " + weat.getName());
        }
        else{
            System.out.println("Sorry, you can't equip that!");
        }
    }
}