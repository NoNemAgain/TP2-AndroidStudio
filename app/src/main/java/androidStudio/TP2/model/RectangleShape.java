package androidStudio.TP2.model;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class RectangleShape implements DrawableShape {


    @Override
    public void drawShape(float left, float top, float right, float bottom, Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawRect(left,top,right,bottom,paint); ;
    }

}

