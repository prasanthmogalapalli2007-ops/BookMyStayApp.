import java.util.HashMap;
import java.util.Map;

/**
 * =============================================================
 * MAIN CLASS – BookMyStayApp
 * =============================================================
 *
 * Description:
 * This class demonstrates how a guest can view available rooms
 * without modifying the inventory data. The system enforces
 * read-only access while searching room availability.
 */

public class BookMyStayApp {

    /* ===============================
       CENTRALIZED ROOM INVENTORY
       =============================== */
    static class RoomInventory {

        private Map<String, Integer> roomAvailability;

        public RoomInventory() {

            roomAvailability = new HashMap<>();

            roomAvailability.put("Single Room", 5);
            roomAvailability.put("Double Room", 3);
            roomAvailability.put("Suite Room", 2);
        }

        public Map<String, Integer> getRoomAvailability() {
            return roomAvailability;
        }
    }

    /* ===============================
       ROOM SEARCH SERVICE
       =============================== */
    static class RoomSearchService {

        public void searchAvailableRooms(RoomInventory inventory) {

            Map<String, Integer> availability =
                    inventory.getRoomAvailability();

            if (availability.get("Single Room") > 0) {
                System.out.println("Single Room available: "
                        + availability.get("Single Room"));
            }

            if (availability.get("Double Room") > 0) {
                System.out.println("Double Room available: "
                        + availability.get("Double Room"));
            }

            if (availability.get("Suite Room") > 0) {
                System.out.println("Suite Room available: "
                        + availability.get("Suite Room"));
            }
        }
    }

    /* ===============================
       APPLICATION ENTRY POINT
       =============================== */
    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        RoomSearchService searchService = new RoomSearchService();

        System.out.println("Searching available rooms...\n");

        searchService.searchAvailableRooms(inventory);
    }
}