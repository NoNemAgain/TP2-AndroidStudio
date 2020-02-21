package androidStudio.TP2.View;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

import androidStudio.TP2.model.ShapeContainer;

public class View extends android.view.View {

    private ShapeContainer model;
    private OnTouchListener otl;


    public View(Context context) {
        super(context);
    }
    public void setModel(ShapeContainer shapeContainer)
    {
        this.model = shapeContainer;
        this.invalidate();
    }
    public void onDraw(Canvas canvas) {
        if (model != null)
            model.draw(canvas); //...
    }

    /*public void onTouch(View v,Event event){

    }*/
    /*public void setOnTouchListener(){
        otl.onTouch(this, MotionEvent.ACTION_DOWN)
    }*/
    /* event.actionMasket == MotionEvent.
    event.x
    event.y
     */



}