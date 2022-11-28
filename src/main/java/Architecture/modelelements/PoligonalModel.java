package org.example.modelelements;

/*Полигональная модель состоит из коллекции Полигонов и Текстур, добавлять в модель можно только текстуры - поэтому
сеттер только на текстуры.*/

import java.util.Collection;

public class PoligonalModel {
    private Collection<Poligon> poligons;
    private Collection<Texture> textures;

    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }

    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    /*можно перегрузить метод создания новой модели для использования только полигонов - в схеме указано, что текстур
    может не быть: */

    public PoligonalModel(Collection<Poligon> poligons) {
        this.poligons = poligons;
    }

}
