package androidStudio.TP2.View;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import androidStudio.TP2.model.ShapeContainer;
import androidStudio.TP2.tp2_androidstudio.ShapeContainerChangeListener;

public class View extends android.view.View {

    private ShapeContainer model;
    private OnTouchListener otl;

    private ShapeContainerChangeListener listener = () -> {this.invalidate();};

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
        if (this.model != null) {
            this.model.removeChangeListener(listener);
        }

        this.model = shapeContainer;
       this.model.addChangeListener(listener);
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
