package org.example.modelelements;

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
    //TODO доработать
}
