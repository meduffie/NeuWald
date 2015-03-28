public class World {
    //False & Null = No exit in that direction, see constructor
    //True & Null = Waiting for relationship (Method setRelations), called in Client
    Food chocBar = new Food("Chocolate Bar", "Mmm this is a tasty chocolate bar!", 10);
    
    Room Spawn = new Room("Spawn", "This is a dark room with one exit.",
    true, null, false, null, false, null, false, null, 1,0);
    
    String gd = "Welcome to the New World, this is a grassy plain. The sun shines brightly in the summer sky, and you feel a great warmth cascade over you.";
    Room Grass = new Room("Grass", gd , false, null, false, null, true, null, true, null, 2,0); 
    
    Room Forrest = new Room("Forrest", "The smell of fresh Oak fills the air, this seems to be a forrest of some sort",
    false, null, true, null, false, null, false, null, 2,1);
    
    public void setWorld(){
        Spawn.setExitN(Grass);
        Grass.setExitS(Spawn);
        Grass.setExitW(Forrest);
        Forrest.setExitE(Grass);
    }
}