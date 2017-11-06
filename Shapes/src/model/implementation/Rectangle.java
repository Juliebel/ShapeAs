package model.implementation;

import static model.implementation.Shape.NL;
import static model.implementation.Shape.TAB;

public class Rectangle extends Shape2D{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter(){
        return 2*(this.length+this.width);
    }

    @Override
    public double surface(){
        return this.length*this.width;
    }

    @Override
    public String toString(){
        StringBuilder sh = new StringBuilder();
        sh.append("Shape type : "+this.getClass().getName()).append(NL)
                .append(TAB).append("Longeur : "+this.length).append(NL)
                .append(TAB).append("Largeur : "+this.width).append(NL)
                .append(TAB).append("Surface : "+this.surface()).append(NL)
                .append(TAB).append("Perimètre : "+this.perimeter()).append(NL);

        return sh.toString();
    }
}
