
package Factory;
import javafx.scene.image.ImageView;
public abstract class NewYearCreator {
    abstract ChristmasProduct createDesign(String item);
    
    public ChristmasProduct orderDesign(String type){
        ChristmasProduct factory = createDesign(type);
        
        return factory;
    }
}
