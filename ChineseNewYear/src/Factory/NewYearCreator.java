
package Factory;
import javafx.scene.image.ImageView;
public abstract class NewYearCreator {
    abstract NewYearProduct createDesign(String item);
    
    public NewYearProduct orderDesign(String type){
        NewYearProduct factory = createDesign(type);
        
        return factory;
    }
}
