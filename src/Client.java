import java.util.*;
public class Client {
    public static void main(String args[]){
        World aa = new World();
        aa.setWorld(); //This basically sets up everything in the world, relationships, items, etc
        Input inp = new Input();
        Scanner scan = new Scanner(System.in);
        String version = "0.0.1";
        System.out.println("Welcome to NeuWald " + version);
        Player play = new Player(null,1,100,aa.Spawn,null,true);
        play.addInv(0,aa.frozDinner);
        play.addInv(1,aa.sword);
        play.addInv(2,aa.tofu);
        play.addInv(3,aa.chocBar);
        System.out.print("What's your name: ");
        play.setName(scan.next());
        System.out.println("Welcome " + play.getName() + '!');
        System.out.print("How old would you like to be: ");
        play.setAge(scan.nextInt());
        System.out.println("\nOkay, " + play.getName() + "! You're all set, welcome to the New World!");
        System.out.println("Type \"Help\" for available commands! (New players should do this!)");
        System.out.println("\n" + aa.Spawn.getDesc());
        while(play.getAlive()){ //This loop runs the whole game, see the cmd method
            inp.cmd(play.location, play);
        }
        System.out.println("\nGoodbye! Thanks for playing New Worlds!");
    }
}