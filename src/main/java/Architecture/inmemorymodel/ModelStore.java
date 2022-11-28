package Architecture.inmemorymodel;


import Architecture.modelelements.Camera;
import Architecture.modelelements.Flash;
import Architecture.modelelements.PoligonalModel;
import Architecture.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements IModelChanger{

    private Collection<IModelChangedObserver> changeObservers = new ArrayList<>();

    @Override
    public void RegisterIModelChanger(IModelChangedObserver o) {

    }

    @Override
    public void RemoveIModelChanger(IModelChangedObserver o) {

    }

    @Override
    public void NotifyChange() {

    }
    private Collection<PoligonalModel> models;
    private Collection<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public Collection<Scene> getScenes() {
        return scenes;
    }
}
