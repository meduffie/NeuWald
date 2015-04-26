import java.util.ArrayList;
public class Room {
    String d;
    String Rn;
    boolean N;
    boolean E;
    boolean S;
    boolean W;
    int xx, yy;
    Room nR;
    Room eR;
    Room sR;
    Room wR;
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Monster> mobs = new ArrayList<>();
    Room(String Rname, String des, boolean N1, Room n1, boolean E1, Room e1, boolean S1, Room s1, boolean W1, Room w1,int x, int y){
        Rn = Rname;
        d = des;
        N = N1;
        E = E1;
        S = S1;
        W = W1;
        xx = x;
        yy = y;
        nR = n1;
        eR = e1;
        sR = s1;
        wR = w1;
    }
    Room(){

    }
    public String getDesc(){
        return d;
    }
    public String getName(){
        return Rn;
    }
    public boolean canN(){ //Is there a North exit?
        return N;
    }
    public boolean canE(){ //Is there a East exit?
        return E;
    }
    public boolean canS(){ //Is there a South exit?
        return S;
    }
    public boolean canW(){ //Is there a West exit?
        return W;
    }
    public Room getN(){ // Returns the North exit
        return nR;
    }
    public Room getS(){ // Returns the South exit
        return sR;
    }
    public Room getE(){ //Returns the East exit
        return eR;
    }
    public Room getW(){ //Returns the West exit
        return wR;
    }
    public void setExitN(Room b){ // Sets the North exit
        nR = b;
    }
    public void setExitS(Room bc){ // Sets the South exit
        sR = bc;
    }
    public void setExitW(Room bc){ // Sets the West exit
        wR = bc;
    }
    public void setExitE(Room bc){ // Sets the East exit
        eR = bc;
    }
    public void addI(Item a){
        items.add(a);
    }
    public void remI(int a){
        items.remove(a);
    }
    public Item getI(int a){
        Item r = items.get(a);
        return r;
    }
    public void printMobs(){
        for(Monster x : mobs){
            System.out.println(x.getName());
        }
    }
    public void printI(){
        if(!items.isEmpty()){
            for(Item a : items){
                System.out.println(a.getName());
            }
        }
        else{
            System.out.println("There seems to be no Items here!");
        }
    }
    public int whereis(String z){ //Returns where object is
        int incc = 0;
        int slot = -1;
        if(!items.isEmpty()){
            for(Item xb : this.items){
                String xa = xb.getName();
                if(xa.equalsIgnoreCase(z)){
                    slot = incc;
                }
                incc++;
                }
            }
        else{
            slot = -1;
        }
        return slot;
    }
    public int whereisMob(String z){ //Returns the index where the mob object is
        int incc = 0;
        int slot = -1;
        if(!mobs.isEmpty()){
            for(Monster xb : this.mobs){
                String xa = xb.getName();
                if(xa.equalsIgnoreCase(z)){
                    slot = incc;
                }
                incc++;
                }
            }
        else{
            slot = -1;
        }
        return slot;
    }
}