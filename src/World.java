public class World {
    //False & Null = No exit in that direction, see constructor
    //True & Null = Waiting for relationship (Method setRelations), called in Client
    Room Spawn = new Room("Spawn", "This is a dark room with one exit, to the north", true, null, false, null, false, null, false, null, 1,0);
    String gd = "Welcome to the New World, this is a grassy plain, the sun shines brightly in the summer sky, and you feel a great warmth cascade over you";
    Room Grass = new Room("Grass", gd , false, null, false, null, true, null, true, null, 2,0); 
    Room Forrest = new Room("Forrest", "The smell of fresh Oak fills the air, welcome to the Forrest", false, null, true, null, false, null, false, null, 2,1);
    public void setRelations(){
        Spawn.setExitN(Grass);
        Grass.setExitS(Spawn);
        Grass.setExitW(Forrest);
        Forrest.setExitE(Grass);
    }
}
