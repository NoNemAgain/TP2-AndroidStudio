package androidStudio.TP2.tp2_androidstudio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import androidStudio.TP2.View.View;
import androidStudio.TP2.model.LineShape;
import androidStudio.TP2.model.Place;
import androidStudio.TP2.model.ShapeContainer;

public class MainActivity extends AppCompatActivity {
    private float startX ;
    private float startY;
    private float endX;
    private float endY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ShapeContainer container = new ShapeContainer();

        View v = findViewById(R.id.ViewXML);
        v.setModel(container);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(android.view.View v, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        // enregistrer event.x event.y dans startX et startY
                        startX = event.getX();
                        startY = event.getY();
                        return true;
                    case MotionEvent.ACTION_UP:
                        // enregistrer event.x eventY dans endX et endY
                        endX = event.getX();
                        endY = event.getY();
                        // créer new Place(startX, startY, endX, endY);
                        Place p1 = new Place(startX,startY,endX,endY);
                        // créer new LineShape();
                        LineShape ls1 = new LineShape();
                        // container.add(lineShape, place);
                        container.add(ls1,p1);


                        return true;
                    case MotionEvent.ACTION_MOVE:
                        // pour le cursif

                        return true;
                }

                return false ;
            }
        });

    }
}
