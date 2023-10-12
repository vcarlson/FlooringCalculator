package css3334.flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                Intent resultsActIntent = new Intent(MainActivity.this, ResultsActivity.class);
                startActivity(resultsActIntent);
            }
        });

    }
}