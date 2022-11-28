package Architecture.modelelements;

import java.util.Collection;

public class Scene {
    public static int counter = 0;
    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    {
        id = ++counter;
    }
    private void GetScena (PoligonalModel models, Flash flashes, Camera cameras){
    }
    private void GetScena (PoligonalModel models, Flash flashes){
    }
}
