package androidStudio.TP2.model;

import android.graphics.Color;

public class ShapeProperties {
    private Vector2 coordinates;
    private Color color;
    private float width;

    public ShapeProperties(Vector2 coordinates){
        this.coordinates = coordinates;
    }

    public void setColor(Color color){
        this.color  = color;
    }

    public float getX() {
        return coordinates.x();
    }

    public float getY() {
        return coordinates.y();
    }

}
