package Strategy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import res.Index.*;

public class NewYearScroll extends Avatar {
    
    public NewYearScroll(ImageView iv) {
        this.iv = iv;
        
    }
    
    @Override
    public void setImg(){
        if(moveBehavior instanceof NoWalk){
            this.img = PRESET.PRESET2.getImage(1);
        }
        else{
            this.img = PRESET.PRESET2.getImage(3);            
        }
    }
        
}
