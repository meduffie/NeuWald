import java.util.*;
public class Input {
    public void cmd(Room a, Player b){
        Scanner p2 = new Scanner(System.in);
        System.out.print("> ");
        String decision = p2.nextLine();
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
            "\n6.) Eat (Item name) -- Eat an item in your Inventory (Make sure you enter the item name!)" + "\n7.) Quit -- Quit the game");
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
            if(inva.size() == 0){
                System.out.println("You don't have anything in here!");
            }
        }
        else if(decision.substring(0,3).equalsIgnoreCase("Eat") && decision.length() > 4){
            String foode = decision.substring(4);
            int s = b.whereis(foode);
            if(s == -1){
                System.out.println("You don't have that!");
            }
            if(s != -1){
                Item tempI = b.inv.get(s);
                if(tempI.amiFood(tempI)){
                    Food tempF = (Food) tempI;
                    b.Eat(tempF, s);
                    System.out.println("Om nom nom! HP: " + b.getHp());
                }
            }
        }
        else{
            System.out.println("Incorrect input, type \"Help\" for commands");
        }
    }
}