import java.util.*;
public class Input {
    public void cmd(Room a, Player b){
        Scanner p2 = new Scanner(System.in);
        System.out.print("> ");
        String decision = p2.next();
        if(decision.equalsIgnoreCase("look")){
            System.out.println(a.getDesc());
        }
        if(decision.equalsIgnoreCase("N")){
            if(a.canN()){
                b.setLoc(a.nR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        if(decision.equalsIgnoreCase("E")){
            if(a.canE()){
                b.setLoc(a.eR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        if(decision.equalsIgnoreCase("S")){
            if(a.canS()){
                b.setLoc(a.sR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        if(decision.equalsIgnoreCase("W")){
            if(a.canW()){
                b.setLoc(a.wR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
    }
}