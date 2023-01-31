package Factory;

import javafx.scene.image.Image;
import res.Index.LION;

public class Setter {
    private static LION lion = LION.LION1;
    private static String id = "bg1";

    public static void setLion(LION lion) {
        Setter.lion = lion;
    }

    public static void setId(String id) {
        Setter.id = id;
    }

    public static LION getLion() {
        return lion;
    }

    public static String getId() {
        return id;
    }
}
