package Factory;

import res.Index.*;

public class BackgroundCreator extends NewYearCreator {

    @Override
    NewYearProduct createDesign(String id){
        NewYearProduct pr;
        switch (id) {
            case "bg1":
                return new BackgroundOne(id);
            case "bg2":
                return new BackgroundTwo(id);
            case "bg3":
                return new BackgroundThree(id);
            default:
                return null;
        }
    }
}
