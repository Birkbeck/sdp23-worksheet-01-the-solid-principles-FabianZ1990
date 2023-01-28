import java.util.ArrayList;
import java.util.List;

public class Board implements BoardCreation {

    List<String> spots;

    public void Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }

    }


    // Poor code — can you improve this?
    public void display() {
        String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n"
            + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n"
            + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}
