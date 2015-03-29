public class Weapon extends Item{
    String nam;
    String d;
    int hip;
    int str;
    public Weapon(String name, String desc, int hitP, int strength){
        super(name, desc);
        nam = name;
        d = desc;
        hip = hitP;
        str = strength;
    }
    public int getHit(){
        return hip;
    }
    public int getStr(){
        return str;
    }
    public void decStr(int de){
        str = str - de;
    }
    public void decStr(){
        str--;
    }
}