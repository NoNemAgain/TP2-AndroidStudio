package androidStudio.TP2.model;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class SegmentShape implements DrawableShape {


    @Override
    public void drawShape(float left, float top, float right, float bottom, Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.rgb(random(0,255),random(0,255),random(0,255)));
        canvas.drawLine(left,top,right,bottom,paint) ;
    }
    public static int random(int lower, int upper ) {

        return (int) (Math.random() * (upper - lower)) + lower;//test
    }
}

