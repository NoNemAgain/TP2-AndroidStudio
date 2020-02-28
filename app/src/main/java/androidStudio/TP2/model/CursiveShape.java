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
    private List<Vector2> lineDraw ;
    private final ShapeContainer container ;
    private ShapesBuilder sb = new ShapesBuilder();
    public CursiveShape(Vector2 start, Vector2 end,List<Vector2> points, ShapeContainer container) {
        this.start = start;
        this.end = end;
        this.points= points;
        lineDraw=new ArrayList<Vector2>();
        this.container=container;

    }

    public void drawShape(ShapeProperties shapeProperties, Canvas canvas) {


        Path path = new Path();


        boolean first = true;
        for(Vector2 point : points){

            if(first){
                first = false;

                path.moveTo(point.x()+shapeProperties.getX(), point.y()+shapeProperties.getY());
            }
            else{

                path.lineTo(point.x()+shapeProperties.getX(), point.y()+shapeProperties.getY());
            }
        }
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, paint);

    }
}

