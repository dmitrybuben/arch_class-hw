package org.example.inmemorymodel;

public interface IModelChanger {
    void RegisterIModelChanger(IModelChangedObserver o);
    void RemoveIModelChanger(IModelChangedObserver o);
    void NotifyChange();
}
