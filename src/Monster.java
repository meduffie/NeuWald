public class Monster extends Player{
	boolean nice;
        double str;
	Monster(String name, int age, double hp, Weapon equip, Room loc, boolean alive, boolean passive, double strength){
		super(name,age,hp,loc,equip,alive,0,0);
		nice = passive;
                str = strength;
	}
        public double getStrength(){
            return str;
        }
        public int getAtkMa(){
            double ma = str/10;
            if(ma < 1){
                double dif = 1-ma;
                ma += dif;
            }
            int maa = (int) ma;
            return maa;
        }
        public int getAtkMi(){
            double mi = str/100;
            if(mi < 1){
                double dif = 1-mi;
                mi += dif;
            }
            int mii = (int) mi;
            return mii;
        }
}
