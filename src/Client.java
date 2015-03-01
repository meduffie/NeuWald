import java.util.*;
public class Client {
    public static void main(String args[]){
        World aa = new World();
        aa.Spawn.setExitN(aa.Grass);
        aa.Grass.setExitS(aa.Spawn);
        Input inp = new Input();
        Scanner scan = new Scanner(System.in);
        String version = "0.0.1";
        System.out.println("Welcome to NeuWald " + version);
        Player play = new Player(null,1,100,aa.Spawn,true); //Default Constructor
        System.out.print("Whats your name: ");
        play.setName(scan.next());
        System.out.println("Welcome " + play.getName() + '!');
        System.out.print("How old would you like to be: ");
        play.setAge(scan.nextInt());
        while(play.getAlive()){
            inp.cmd(play.location, play);
        }
    }
}
