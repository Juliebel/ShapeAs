package main;

import model.contract.IShape2D;
import model.factory.ShapeFactory;

//MAin class final
public final class main {
    public static void main(String[]args){
        IShape2D rec1 = ShapeFactory.INSTANCE.createRectangle(3.5,2.3d);
        System.out.println(rec1);
    }
}
