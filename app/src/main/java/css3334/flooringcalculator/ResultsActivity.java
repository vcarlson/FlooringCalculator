package css3334.flooringcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {

    private TextView textViewArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        textViewArea = findViewById(R.id.textViewArea);

       double area = getIntent().getDoubleExtra("area",0);
        Log.i("3334","area in Results = "+area);



        textViewArea.setText("The area is:" + area);
    }
}
