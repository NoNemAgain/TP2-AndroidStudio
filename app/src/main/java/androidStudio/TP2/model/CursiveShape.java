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
    List<Coordinnates> points = new ArrayList<Coordinnates>();
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    public void drawShape(ShapeProperties shapeProperties, Canvas canvas) {
        Path path = new Path();

        boolean first = true;
        for(Coordinnates point : points){
            if(first){
                first = false;
                path.moveTo(point.getX(), point.getY());
            }
            else{
                path.lineTo(point.getX(), point.getY());
            }
        }
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawPath(path, paint);

    }
    public void addPoint(float X, float Y ){
        points.add(new Coordinnates(X,Y));
    }

}