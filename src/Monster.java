public class Monster extends Player{
	String nam;
	int ag;
	double hpp;
	Weapon equipp;
	Room locc;
	boolean live;
	boolean nice;
	Monster(String name, int age, double hp, Weapon equip, Room loc, boolean alive, boolean passive){
		super(name,age,hp,loc,equip,alive);
		nam = name;
		ag = age;
		hpp = hp;
		equipp = equip;
		locc = loc;
		live = alive;
		nice = passive;
	}
}
