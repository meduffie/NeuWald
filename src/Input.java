import java.util.*;
public class Input {
    public void cmd(Room a, Player b){
        Scanner p2 = new Scanner(System.in);
        System.out.print("> ");
        String decision = p2.next();
        if(decision.equalsIgnoreCase("look")){
            System.out.println(a.getDesc());
        }
        else if(decision.equalsIgnoreCase("N")){
            if(a.canN()){
                b.setLoc(a.nR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        else if(decision.equalsIgnoreCase("E")){
            if(a.canE()){
                b.setLoc(a.eR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        else if(decision.equalsIgnoreCase("S")){
            if(a.canS()){
                b.setLoc(a.sR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        else if(decision.equalsIgnoreCase("W")){
            if(a.canW()){
                b.setLoc(a.wR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        else if(decision.equalsIgnoreCase("Help")){
            System.out.println("Here are the commands available for you in NeuWald: ");
            System.out.println("1.) N, E, S or W -- Go N, E, S or W\n2.) Look -- Get the room Description!"
            + "\n3.) Exits -- Get a list of exits for this room" + "\n4.) Inv -- Get a printout of your Inventory!" +
            "\n5.) Quit -- Quit the game");
        }
        else if(decision.equalsIgnoreCase("Quit")){
            b.killPlayer();
        }
        else if(decision.equalsIgnoreCase("Exits")){
            System.out.println("Here are your available exits:");
            if(a.canN()){
            System.out.println("North: " + a.getN().getName());
            }
            if(a.canE()){
                System.out.println("East: " + a.getE().getName());
            }
            if(a.canS()){
               System.out.println("South: " + a.getS().getName());
            }
            if(a.canW()){
                System.out.println("West: " + a.getW().getName());
            }
        }
        else if(decision.equalsIgnoreCase("Inv")){
            ArrayList<Item> inva = new ArrayList<Item>();
            inva = b.getInv();
            for(Item aa : inva){
                int sn = 1;
                System.out.println("Slot " + sn + ": " + aa.getName());
            }
        }
        else{
            System.out.println("Incorrect input, type \"Help\" for commands");
        }
    }
}