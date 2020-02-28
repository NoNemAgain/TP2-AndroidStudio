package androidStudio.TP2.model;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class RectangleShape implements DrawableShape {
    private final Vector2 start;
    private final Vector2 end;

    public RectangleShape(Vector2 start, Vector2 end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void drawShape(ShapeProperties shapeProperties, Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawRect(start.x() + shapeProperties.getX(),start.y() + shapeProperties.getY(), end.x() + shapeProperties.getX(), end.y() + shapeProperties.getY(), paint);

    }

}

