package Factory;

import javafx.scene.image.Image;
import res.Index.*;

public class LionCreator extends NewYearCreator {
    
    @Override
    NewYearProduct createDesign(String lion) {
        switch (lion) {
            case "LION1":
                return new LionOne(LION.LION1);
            case "LION2":
                return new LionTwo(LION.LION2);
            default:
                return null;
        }
    }
}
