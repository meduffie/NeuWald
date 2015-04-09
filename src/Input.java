import java.util.*;
public class Input {
    boolean playing = true;
    public void cmd(Room a, Player b){
        Scanner p2 = new Scanner(System.in);
        System.out.print("> ");
        String decision = p2.nextLine();
        if(decision.equalsIgnoreCase("look")){
            System.out.println(a.getDesc());
            if(!a.mobs.isEmpty()){
                System.out.println("Mobs: ");
                a.printMobs();
            }
        }
        else if(decision.equalsIgnoreCase("N") || decision.equalsIgnoreCase("North")){
            if(a.canN()){
                b.setLoc(a.nR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        else if(decision.equalsIgnoreCase("E") || decision.equalsIgnoreCase("East")){
            if(a.canE()){
                b.setLoc(a.eR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        else if(decision.equalsIgnoreCase("S") || decision.equalsIgnoreCase("South")){
            if(a.canS()){
                b.setLoc(a.sR); //Sets new Location
                a = b.getLoc(); //Puts location into the loop memory
                System.out.println(a.getDesc()); //Prints new Location
            }
            else{
                System.out.println("Can't go this way!");
            }
        }
        else if(decision.equalsIgnoreCase("W") || decision.equalsIgnoreCase("West")){
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
            System.out.println("N, E, S or W -- Go N, E, S or W\nLook -- Get the room Description!"
            + "\nExits -- Get a list of exits for this room" + "\nInv -- Get a printout of your Inventory!" +
            "\nEat <Item> -- Eat an item in your Inventory (Make sure you enter the item name!)" + 
            "\nStats -- Lists your current player stats" + "\nQuit -- Quit the game\n(More commands in \"Help 2\")");
        }
        else if(decision.equalsIgnoreCase("Help 2")){
            System.out.println("Help Page 2: ");
            System.out.println("Room items -- Prints out all the Items in your current room");
            System.out.println("Pickup <Item> -- Picks up specified Item");
            System.out.println("Equip <Weapon in Inv> -- Equips weapon, places it in Equipped slot, out of Inv");
            System.out.println("Unequip <Weapon that IS equipped> -- Unqeuips weapon, places it Inv");
        }
        else if(decision.equalsIgnoreCase("Quit")){
            playing = false;
        }
        else if(decision.equalsIgnoreCase("Exits")){
            System.out.println("Here are your available exits:");
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
            ArrayList<Item> inva = new ArrayList<>();
            inva = b.getInv();
            int sn = 1;
            for(Item aa : inva){
                System.out.println("Slot " + sn + ": " + aa.getName());
                sn++;
            }
            if(inva.isEmpty()){
                System.out.println("You don't have anything in here!");
            }
        }
        else if(decision.length()> 3 && decision.substring(0,3).equalsIgnoreCase("Eat")){
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
        else if(decision.equalsIgnoreCase("Stats")){
            b.printStats();
        }
        else if(decision.equalsIgnoreCase("Room Items")){
            a.printI();
        }
        else if(decision.length() > 6 && decision.substring(0,5).equalsIgnoreCase("Equip")){
            String wea = decision.substring(6);
            int sl = b.whereis(wea);
            if(sl == -1){
                System.out.println("You don't have that!");
            }
            else if(sl != -1){
                b.equip(sl);
            }
        }
        else if(decision.length() > 8 && decision.substring(0,7).equalsIgnoreCase("Unequip")){
            String wuq = decision.substring(8);
            if(b.wAct != null && b.wAct.getName().equalsIgnoreCase(wuq)){
                if(b.inv.size() < 6){
                    Item putback = b.wAct;
                    b.wAct = null;
                    b.addInv(putback);
                    System.out.println("Unequipped " + putback.getName());
                }
                else{
                    System.out.println("Can't unequip! You're inv is full!");
                }
            }
            else if(b.wAct != null && !b.wAct.getName().equalsIgnoreCase(wuq)){
                System.out.println("That weapon isn't equipped!");
            }
            else{
                System.out.println("You don't have anything equipped!");
            }
        }
        else if(decision.length() > 7 && decision.substring(0,6).equalsIgnoreCase("Pickup")){
            String pik = decision.substring(7);
            int pikl = a.whereis(pik);
            if(pikl == -1){
                System.out.println("That doesn't exist here");
            }
            else if(pikl != -1){
                b.addInv(a.getI(pikl));
                a.remI(pikl);
            }
        }
        else if(decision.length() > 6 && decision.substring(0,7).equalsIgnoreCase("Fight")){
            String mobb = decision.substring(6);
        }
        else{
            System.out.println("Incorrect input, type \"Help\" for commands");
        }
    }
}