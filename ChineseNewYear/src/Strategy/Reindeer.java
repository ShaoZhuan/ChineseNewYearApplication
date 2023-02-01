package Strategy;

import javafx.scene.image.ImageView;
import res.Index.*;

public class Reindeer extends Avatar {
    
    public Reindeer(ImageView iv) {
        this.iv = iv;
    }
    
    
    @Override
    public void setImg(){
        if(moveBehavior instanceof NoWalk){
            this.img = PRESET.PRESET1.getImage(1);
        }
        else{
            this.img = PRESET.PRESET1.getImage(3);            
        }
    }

}
