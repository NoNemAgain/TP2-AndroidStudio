package androidStudio.TP2.model;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import androidStudio.TP2.tp2_androidstudio.ShapeContainerChangeListener;

public class ShapeContainer {
    List<ShapeContainerChangeListener> ListShapeContainerlister;
    HashMap <DrawableShape ,ShapeProperties> canevas;

    public ShapeContainer(){
        canevas = new HashMap<DrawableShape,ShapeProperties>();
        ListShapeContainerlister = new ArrayList<ShapeContainerChangeListener>();
    }

    public void draw(Canvas canvas){
        for (DrawableShape ds : canevas.keySet()) {
                ShapeProperties shapeProperties = canevas.get(ds);
                // TODO : passer la shapeProperties au drawShape
                ds.drawShape(shapeProperties,canvas);

        }

    }
    public boolean add(DrawableShape shape, ShapeProperties shapeProperties){
        ShapeProperties p=canevas.put(shape,shapeProperties);
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
