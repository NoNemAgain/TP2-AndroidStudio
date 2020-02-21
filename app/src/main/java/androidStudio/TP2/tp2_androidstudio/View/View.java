package androidStudio.TP2.tp2_androidstudio.View;

import android.content.Context;
import android.graphics.Canvas;

import androidStudio.TP2.tp2_androidstudio.ShapeContainerChangeListener;

public class View extends android.view.View {

    public View(Context context) {
        super(context);
    }
    public void setModel(ShapeContainer shapeContainer)
    {
        this.model = shapeContainer;
        this.invalidate();

        ShapeContainerChangeListener listener = () -> { this.invalidate(); }; // this is the view
        model.addChangeListener(listener);
    }
    public void onDraw(Canvas canvas)
    {
        if (model != null)
            model.draw(canvas);
    }
}
