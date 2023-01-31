package Factory;

import javafx.scene.image.Image;
import res.Index.TREE;

public class Setter {
    private static TREE tree = TREE.TREE1;
    private static String id = "bg1";

    public static void setTree(TREE tree) {
        Setter.tree = tree;
    }

    public static void setId(String id) {
        Setter.id = id;
    }

    public static TREE getTree() {
        return tree;
    }

    public static String getId() {
        return id;
    }
}
