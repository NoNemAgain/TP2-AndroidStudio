package androidStudio.TP2.model;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

public class CursiveShape implements DrawableShape {
    private final Vector2 start;
    private final Vector2 end;
    private List<Vector2> points;
    public CursiveShape(Vector2 start, Vector2 end,List<Vector2> points) {
        this.start = start;
        this.end = end;
        this.points= points;
    }

    public void drawShape(ShapeProperties shapeProperties, Canvas canvas) {
        Path path = new Path();

        boolean first = true;
        for(Vector2 point : points){
            if(first){
                first = false;
                path.moveTo(point.x(), point.y());
            }
            else{
                path.lineTo(point.x(), point.y());
            }
        }
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawPath(path, paint);

    }
}

