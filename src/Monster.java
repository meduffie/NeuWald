public class Monster extends Player{
	boolean nice;
        int str;
	Monster(String name, int age, double hp, Weapon equip, Room loc, boolean alive, boolean passive, int strength){
		super(name,age,hp,loc,equip,alive);
		nice = passive;
                str = strength;
	}
        public int getStrength(){
            return str;
        }
}
