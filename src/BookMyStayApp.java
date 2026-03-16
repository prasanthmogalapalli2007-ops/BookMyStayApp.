import java.util.HashMap;
import java.util.Map;

public class BookMyStayApp {

    // RoomInventory class inside the same file
    static class RoomInventory {

        private Map<String, Integer> roomAvailability;

        // initialize inventory
        public RoomInventory() {

            roomAvailability = new HashMap<>();

            roomAvailability.put("Single Room", 5);
            roomAvailability.put("Double Room", 3);
            roomAvailability.put("Suite Room", 2);
        }

        // return room availability
        public Map<String, Integer> getRoomAvailability() {
            return roomAvailability;
        }

        // update availability
        public void updateAvailability(String roomType, int count) {
            roomAvailability.put(roomType, count);
        }
    }

    // main method
    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("Room Inventory:\n");

        for (Map.Entry<String, Integer> entry :
                inventory.getRoomAvailability().entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nUpdating Single Room availability...\n");

        inventory.updateAvailability("Single Room", 4);

        for (Map.Entry<String, Integer> entry :
                inventory.getRoomAvailability().entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}