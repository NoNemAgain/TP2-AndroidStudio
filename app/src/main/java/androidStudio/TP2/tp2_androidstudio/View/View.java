package androidStudio.TP2.tp2_androidstudio.View;

import android.content.Context;
import android.graphics.Canvas;

import androidStudio.TP2.model.ShapeContainer;

public class View extends android.view.View {

    private ShapeContainer model;

    public View(Context context) {
        super(context);
    }
    public void setModel(ShapeContainer shapeContainer)
    {
        this.model = shapeContainer;
        this.invalidate();
    }
    public void onDraw(Canvas canvas)
    {
        if (model != null)
            model.draw(canvas); //...
    }
}
