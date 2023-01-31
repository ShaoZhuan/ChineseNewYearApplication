package Strategy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Avatar {
    
    MoveBehaviour moveBehavior; 
    ImageView iv; 
    Image img;        
    
    public void toggle(boolean standing){
        if(standing){
            this.moveBehavior = new NoWalk();
        }else{
            this.moveBehavior = new CanWalk();
        }        
        setImg();
    }
    
    public abstract void setImg();
        
    public void performMove(){
        this.moveBehavior.move(iv, img);
    }
}
