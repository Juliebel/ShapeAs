package model.factory;

import model.contract.IShape;
import model.contract.IShape2D;
import model.implementation.Rectangle;

import java.awt.*;

//Class final, on ne peut pas la dériver
public final class ShapeFactory {
    //Quand ca charge Shape Factory, ca créer a constante avant d'initialiser
    //Factory = Singleton = une seule instance de la classe

    public static final ShapeFactory INSTANCE = new ShapeFactory();

    //Il doit être privé pour que les gens ne puissent pas instancier
    private ShapeFactory(){

    }

    public IShape2D createRectangle (double length, double width){
        return new Rectangle(length, width);
    }
}
