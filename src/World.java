public class World {

    Food chocBar = new Food("Chocolate Bar", "Mmm this is a tasty chocolate bar!", 10);
    Food tofu = new Food("Tofu", "Wow! A warm block of TSP!", 20);
    Food bread = new Food("Bread", "Cool! A piece of whole grain bread!", 10);
    Food frozDinner = new Food("Frozen Dinner", "Yum! A Vegan mexican dish!", 25);
    
    Weapon wSword = new Weapon("Wooden Sword", "A sturdy Wooden Sword!", 10, 25);
    
    //False & Null = No exit in that direction, see constructor
    //True & Null = Waiting for relationship (Method setRelations), called in Client
    Room Spawn = new Room("Spawn", "This is a dark room with one exit.",
    true, null, false, null, false, null, false, null, 0,0);
    
    String gd = "Welcome to the New World, this is a grassy plain. The sun shines brightly in the summer sky, and you feel a great warmth cascade over you.";
    Room Grass = new Room("Grass", gd , true, null, false, null, true, null, true, null, 0,1); 
    
    Room Forrest = new Room("Forrest", "The smell of fresh Oak fills the air, this seems to be a forrest of some sort",
    false, null, true, null, false, null, false, null, 1,1);
    
    Room Prarie = new Room("Prarie", "The wheat leaves rumble in the air, and there seems to be nothing but prarie grass for miles",
    false, null, false, null, true, null, false, null, 0,2);
    
    public void setWorld(){
        Spawn.setExitN(Grass);
        Grass.setExitS(Spawn);
        Grass.setExitW(Forrest);
        Grass.setExitN(Prarie);
        Prarie.setExitS(Grass);
        Forrest.setExitE(Grass);
        Forrest.addI(bread);
        Forrest.addI(wSword);
    }
}