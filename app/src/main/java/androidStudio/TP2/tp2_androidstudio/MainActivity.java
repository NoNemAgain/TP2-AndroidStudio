package androidStudio.TP2.tp2_androidstudio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import androidStudio.TP2.View.View;
import androidStudio.TP2.model.CursiveShape;
import androidStudio.TP2.model.Place;
import androidStudio.TP2.model.RectangleShape;
import androidStudio.TP2.model.ShapeContainer;
import androidStudio.TP2.model.ShapeKind;
import androidStudio.TP2.model.ShapesBuilder;
import androidStudio.TP2.model.Vector2;

public class MainActivity extends AppCompatActivity {
    private List<Vector2> points;
    private ShapeKind selectedShapeKind;
    private ShapesBuilder shapesBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ShapeContainer container = new ShapeContainer();
         ShapesBuilder shapesBuilder = new ShapesBuilder();
        ListView lv = (ListView)findViewById(R.id.shapeList);
        lv.setAdapter(new ArrayAdapter<ShapeKind>(this, android.R.layout.simple_list_item_1, ShapeKind.values()));
        points = new ArrayList<Vector2>();
        View v = findViewById(R.id.ViewXML);
        v.setModel(container);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(android.view.View v, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        // enregistrer event.x event.y dans startX et startY
                        points.clear();
                        addPoint(event.getX(),event.getY());

                        return true;
                    case MotionEvent.ACTION_UP:
                        // enregistrer event.x eventY dans endX et endY
                        addPoint(event.getX(),event.getY());
                        // créer new Place(startX, startY, endX, endY);
                        // TODO : trouver la shape properties
                        shapesBuilder.setShapeKind(ShapeKind.RECTANGLE);
                        // créer new LineShape();
                        List<Vector2> copy = new ArrayList<>();
                        copy.addAll(points);
                        shapesBuilder.createShape(copy, container);
                        // container.add(lineShape, place);
                        // TODO : donner la shapeProperties à la place de la Place

                        return true;
                    case MotionEvent.ACTION_MOVE:
                        // pour le cursif
                        /*CursiveShape cs = new CursiveShape();*/
                        addPoint(event.getX(),event.getY());
                        return true;
                }

                return false ;
            }
        });

    }
    public void addPoint(float X , float Y) {
        points.add(new Vector2(X,Y));

    }
}
