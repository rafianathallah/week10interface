import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        ArrayList<Object> vehiclelist = new ArrayList<>();

        PoliceCar pc = new PoliceCar(4, "Police car", 5, 168, 2);
        vehiclelist.add(pc);

        Jeep j = new Jeep(4, "Jeep", 6, 140);
        vehiclelist.add(j);

        Hovercraft h = new Hovercraft(4, "Hovercraft", 300, 4, 141);
        vehiclelist.add(h);

        Frigate f = new Frigate(250, "Frigate", 100, 60);
        vehiclelist.add(f);

    }
}