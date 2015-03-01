import java.util.*;
public class Client {
    public static void main(String args[]){
        World aa = new World();
        aa.Spawn.setExitN(aa.Grass); //The only way I could get the first two rooms to behave
        aa.Grass.setExitS(aa.Spawn);
        Input inp = new Input();
        Scanner scan = new Scanner(System.in);
        String version = "0.0.1";
        System.out.println("Welcome to NeuWald " + version);
        Player play = new Player(null,1,100,aa.Spawn,true);
        System.out.print("Whats your name: ");
        play.setName(scan.next());
        System.out.println("Welcome " + play.getName() + '!');
        System.out.print("How old would you like to be: ");
        play.setAge(scan.nextInt());
        while(play.getAlive()){ //This loop runs the whole game, see the cmd method
            inp.cmd(play.location, play);
        }
    }
}