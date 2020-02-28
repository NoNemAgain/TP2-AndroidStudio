package androidStudio.TP2.model;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import androidStudio.TP2.tp2_androidstudio.ShapeContainerChangeListener;

public class ShapeContainer {
    List<ShapeContainerChangeListener> ListShapeContainerlister;
    HashMap <DrawableShape , Place> canevas;

    public ShapeContainer(){
        canevas = new HashMap<DrawableShape,Place>();
        ListShapeContainerlister = new ArrayList<ShapeContainerChangeListener>();
    }

    public void draw(Canvas canvas){
        for (DrawableShape ds : canevas.keySet()) {
                Place place = canevas.get(ds);
                // TODO : passer la shapeProperties au drawShape
                ds.drawShape(shape,canvas);

        }

    }
    public boolean add(DrawableShape shape, Place place){

            Place p=canevas.put(shape,place);
        fireListeners();
        return p==null;
    }
    public void fireListeners()
    {
        for (ShapeContainerChangeListener listener: ListShapeContainerlister)
            listener.onShapeContainerChange();
    }
    public void addChangeListener(ShapeContainerChangeListener listener){
        ListShapeContainerlister.add(listener);
    }
    public void removeChangeListener(ShapeContainerChangeListener listener){
        ListShapeContainerlister.remove(listener);
    }

}
