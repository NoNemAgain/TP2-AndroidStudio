package androidStudio.TP2.model;

import java.util.List;

public class ShapesBuilder {
    private ShapeKind shapeKind = ShapeKind.SEGMENT;

    public void setShapeKind(ShapeKind shapeKind) {
        this.shapeKind = shapeKind;
    }

    public void createShape(List<Vector2> points, ShapeContainer container) {
        float minX = points.get(0).x();
        float minY = points.get(0).y();
        for (Vector2 point : points) {
            if (point.x() < minX) minX = point.x();
            if (point.y() < minY) minY = point.y();
        }
        ShapeProperties sp = new ShapeProperties(new Vector2(minX, minY));

        for (Vector2 point : points) {
            point.x(point.x() - sp.getX());
            point.y(point.y() - sp.getY());
        }

        switch (shapeKind) {
            case SEGMENT:
                DrawableShape shape = new LineShape(points.get(0), points.get(points.size() - 1));
                container.add(shape, sp);
                break;
            case RECTANGLE:
                DrawableShape shape1 = new RectangleShape(points.get(0), points.get(points.size() - 1));
                container.add(shape1, sp);
                break;
            case CURSIVE:
                DrawableShape shape2 = new CursiveShape(points.get(0), points.get(points.size() - 1),points);
                container.add(shape2, sp);
                break;
        }

    }
}
