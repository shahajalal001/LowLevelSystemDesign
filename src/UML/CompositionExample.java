package UML;

import java.util.ArrayList;
import java.util.List;

class Room {
    private final String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class House {
    private final List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
        this.rooms.add(new Room("Living Room"));
        this.rooms.add(new Room("Bed Room"));
    }

    public void showRooms(){
        for(Room room: rooms){
            System.out.println(room.getName());
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House();
        house.showRooms();
    }
}
