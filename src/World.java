public class World {
    //False & Null = No exit in that direction, see constructor
    Room Spawn = new Room("Spawn", 1,1,"This is a dark room with one exit, to the north", true, null, false, null, false, null, false, null, 1,0);
    String gd = "Welcome to the New World, this is a grassy plain, the sun shines brightly in the summer sky, and you feel a great warmth cascade over you";
    Room Grass = new Room("Grass", 1,1, gd , false, null, false, null, true, null, false, null, 2,0); 
}
