package model.contract;

import java.awt.geom.Point2D;

public interface IPoint2D extends IPoint {
    void translate(double x, double y);
    void distance(Point2D other);
}
