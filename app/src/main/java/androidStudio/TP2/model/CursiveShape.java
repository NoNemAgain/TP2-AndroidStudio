package androidStudio.TP2.model;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class CursiveShape implements DrawableShape {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void drawShape(float left, float top, float right, float bottom, Canvas canvas) {
        Path path = new Path();
        boolean first = true;
        for(Point point : points){
            if(first){
                first = false;
                path.moveTo(point.x, point.y);
            }
            else{
                path.lineTo(point.x, point.y);
            }
        }
        canvas.drawPath(path, paint);

    }

}