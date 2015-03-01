public class Room {
    int l;
    int w;
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
    Room(String Rname, int length, int width, String des, boolean N1, Room n1, boolean E1, Room e1, boolean S1, Room s1, boolean W1, Room w1, int x, int y){
        Rn = Rname;
        l = length;
        w = width;
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
    public boolean canN(){
        return N;
    }
    public boolean canS(){
        return S;
    }
    public Room getN(){
        return nR;
    }
    public Room getS(){
        return sR;
    }
    public void setExitN(Room b){
        this.nR = b;
    }
    public void setExitS(Room bc){
        this.sR = bc;
    }
}
