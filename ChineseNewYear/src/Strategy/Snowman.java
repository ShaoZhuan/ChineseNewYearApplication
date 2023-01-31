/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import res.Index.*;


public class Snowman extends Avatar{
    
    public Snowman(ImageView iv) {
        this.iv = iv;
    }
    
    @Override
    public void setImg(){
        if(moveBehavior instanceof NoWalk){
            this.img = PRESET.PRESET3.getImage(5);
        }
        else{
            this.img = PRESET.PRESET3.getImage(6);            
        }
    }
        
}
