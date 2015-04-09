public class Food extends Item{
    int hpa;
    Food(String name, String desc, int hpA){
        super(name,desc);
        hpa = hpA;
    }
    public int getHPA(){
        return hpa;
    }
    public void setHPA(int x){
        hpa = x;
    }
}