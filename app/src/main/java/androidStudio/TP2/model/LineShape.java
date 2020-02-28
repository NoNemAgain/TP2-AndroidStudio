package androidStudio.TP2.model;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class LineShape implements DrawableShape {
    private final Vector2 start;
    private final Vector2 end;

    public LineShape(Vector2 start, Vector2 end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void drawShape(ShapeProperties shapeProperties, Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawLine(start.x() + shapeProperties.getX(),start.y() + shapeProperties.getY(), end.x() + shapeProperties.getX(), end.y() + shapeProperties.getY(), paint);
    }
}
