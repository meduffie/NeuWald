import java.util.*;
public class Client {
    public static void main(String args[]){
        World aa = new World();
        aa.setWorld(); //This basically sets up everything in the world, relationships, items, etc
        Input inp = new Input();
        Scanner scan = new Scanner(System.in);
        String version = "0.0.1";
        String icon = "#############\n#           #\n#  NeuWald  #\n#           #\n#############";        
        System.out.println("\n" + icon + "\nVersion: " + version + "\n");
        Player play = new Player(null,1,100,aa.Spawn,null,true,0,1);
        play.addInv(0,aa.chocBar);
        System.out.print("What's your name: ");
        play.setName(scan.next());
        System.out.println("Welcome " + play.getName() + '!');
        System.out.print("How old would you like to be: ");
        play.setAge(scan.nextInt());
        System.out.println("\nOkay, " + play.getName() + "! You're all set, welcome to NeuWald!");
        System.out.println("Type \"Help\" for available commands! (New players should do this!)");
        System.out.println("\n" + aa.Spawn.getDesc());
        while(inp.playing){ //This loop runs the whole game, see the cmd method
            inp.cmd(play.location, play);
        }
        System.out.println("\nGoodbye! Thanks for playing New Worlds!");
    }
}