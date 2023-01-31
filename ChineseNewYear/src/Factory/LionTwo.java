package Factory;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import res.Index.*;

public class LionTwo extends NewYearProduct{
    private LION lion;
    public LionTwo(LION lion){
        this.lion = lion;
    }
    
    @Override
    public void setImage(Node pane) {
        ImageView iv = (ImageView) pane;
        iv.setImage(lion.getLionImage());
    }
}
