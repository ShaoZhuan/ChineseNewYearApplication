package res;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Index {
    
    public enum LION {
        LION1("res/img/lion1.png"),
        LION2("res/img/lion2.png");
        
        private final Image lionImage;

        private LION(String lionPath) {
            lionImage = new Image(lionPath);
        }
        
        public Image getLionImage() {
            return lionImage;
        }
    }
    
    public enum PRESET {
        PRESET1(
                "res/img/person1.png",
                "res/img/firecracker_idle.png",
                "res/img/firecracker.gif"
                ),
        PRESET2(
                "res/img/person2.png",
                "res/img/hcny_idle.png",
                "res/img/hcny.gif"
                ),
        PRESET3(
                "res/img/person3.png",
                "res/img/rabbit_idle.png",
                "res/img/rabbit.gif"
                );
        
        private final Image personImage, standImage, walkImage;
        private ArrayList<Image> imageArray = new ArrayList<>();
        private final Color color;
        private PRESET( String personPath, String standPath, 
                String walkPath) {
                
                personImage = new Image(personPath);
                standImage = new Image(standPath);
                walkImage = new Image(walkPath);
                
                imageArray.add(personImage);
                imageArray.add(standImage);
                imageArray.add(walkImage);
                
                this.color = Color.web("#3A5F0B", 0.5);
        }
        
        public Image getImage(int index){
            return imageArray.get(index);
        }
        public Paint getColor(){
            return color;
        }
    }
}
