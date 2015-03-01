import java.util.*;
public class Input {
    public char dir(){
        Scanner p = new Scanner(System.in);
        System.out.print("Direction (N/E/S/W): ");
        String sch = p.next();
        String schh = sch.toUpperCase();
        char ch = schh.charAt(0);
        return ch;
    }
    public char dir2(){
        Scanner p2 = new Scanner(System.in);
        System.out.print("Direction (F/L/R/B): ");
        String sch2 = p2.next();
        String schh2 = sch2.toUpperCase();
        char ch2 = schh2.charAt(0);
        return ch2;
    }
    public void cmd(Room a, Player b){
        Scanner p2 = new Scanner(System.in);
        System.out.print("> ");
        String decision = p2.next();
        if(decision.equalsIgnoreCase("look")){
            System.out.println(a.getDesc());
        }
        if(decision.equalsIgnoreCase("N")){
            if(a.canN()){
                //System.out.println(a);
                b.setLoc(a.nR);
                a = b.getLoc();
                System.out.println(a.getDesc());
                //System.out.println(a);
                //p2.reset();
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        if(decision.equalsIgnoreCase("S")){
            if(a.canS()){
                //System.out.println(a);
                b.setLoc(a.sR);
                a = b.getLoc();
                System.out.println(a.getDesc());
                //System.out.println(a);
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
    }
}
