package androidStudio.TP2.tp2_androidstudio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import androidStudio.TP2.View.View;
import androidStudio.TP2.model.ShapeContainer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShapeContainer container = new ShapeContainer();

        View v = findViewById(R.id.ViewXML);
        v.setModel(container);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(android.view.View v, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        // enregistrer event.x event.y dans startX et startY
                        return true;
                    case MotionEvent.ACTION_UP:
                        // enregistrer event.x eventY dans endX et endY
                        // créer new Place(startX, startY, endX, endY);
                        // créer new LineShape();
                        // container.add(lineShape, place);
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        // pour le cursif
                        return true;
                }

                return false;            }
        });

    }
}
