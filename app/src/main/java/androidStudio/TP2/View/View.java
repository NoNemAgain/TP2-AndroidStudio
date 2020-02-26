package androidStudio.TP2.View;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.Nullable;

import androidStudio.TP2.model.ShapeContainer;

public class View extends android.view.View {

    private ShapeContainer model;
    private OnTouchListener otl;


    public View(Context context) {
        super(context);
    }

    public View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public View(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
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
