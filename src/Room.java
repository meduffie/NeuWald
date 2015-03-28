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
        this.nR = b;
    }
    public void setExitS(Room bc){ // Sets the South exit
        this.sR = bc;
    }
    public void setExitW(Room bc){ // Sets the West exit
        this.wR = bc;
    }
    public void setExitE(Room bc){ // Sets the East exit
        this.eR = bc;
    }
}