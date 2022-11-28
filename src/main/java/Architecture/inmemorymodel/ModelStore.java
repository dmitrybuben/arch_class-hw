package org.example.inmemorymodel;


import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements IModelChanger{

    //TODO: доработать

    private Collection<IModelChangedObserver> changedObservers = new ArrayList<>();

    @Override
    public void RegisterIModelChanger(IModelChangedObserver o) {

    }

    @Override
    public void RemoveIModelChanger(IModelChangedObserver o) {

    }

    @Override
    public void NotifyChange() {

    }
}
