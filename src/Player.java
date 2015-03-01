public class Player {
    String nam;
    int ag;
    double h;
    Room location;
    boolean ali;
    Player(){
        
    }
    Player(String name, int age, double hp, Room loc, boolean alive){
        nam = name;
        ag = age;
        h = hp;
        location = loc;
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
}