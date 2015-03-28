public class Item {
    String Name;
    String Desc;
    Item(String name, String desc){
        Name = name;
        Desc = desc;
    }
    public String getName(){
        return Name;
    }
    public boolean amiFood(Item xx){
        boolean x = false;
        if(xx instanceof Food){
            x = true;
        }
        return x;
    }
}
