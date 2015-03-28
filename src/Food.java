public class Food extends Item{
    String Name;
    String Desc;
    int hpa;
    Food(String name, String desc, int hpA){
        super(name,desc);
        Name = name;
        Desc = desc;
        hpa = hpA;
    }
    public int getHPA(){
        return hpa;
    }
    public void setHPA(int x){
        hpa = x;
    }
}