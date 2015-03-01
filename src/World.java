public class World {
    //False & Null = No exit in that direction, see constructor
    Room Spawn = new Room("Spawn", 1,1,"This is a dark room with one exit, to the north", true, null, false, null, false, null, false, null, 1,0);
    Room Grass = new Room("Grass", 1,1,"Es ist Graasty", false, null, false, null, true, null, false, null, 2,0); 
}
