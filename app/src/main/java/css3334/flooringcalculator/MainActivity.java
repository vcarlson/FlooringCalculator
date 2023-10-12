package css3334.flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextWidth, editTextLength;
    Button buttonShowResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);

        setupButton();
    }

    private void setupButton() {
        buttonShowResults = findViewById(R.id.buttonShowResults);
        buttonShowResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent resultsActIntent = new Intent(MainActivity.this, ResultsActivity.class);
                //startActivity(resultsActIntent);
                calculateArea();
            }
        });

        }
    private void calculateArea() {
        double length = Double.parseDouble(editTextLength.getText().toString());
        double width = Double.parseDouble((editTextWidth.getText().toString()));
        double area = length * width;

        Log.i("3334","area = "+area);
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("length", length);
        intent.putExtra("width", width);
        intent.putExtra("area", area);

        startActivity(intent);
   }
}