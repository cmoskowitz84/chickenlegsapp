package co.chickenlegs.chickenlegs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton logWorkoutBtn = findViewById(R.id.logWorkoutBtn);
        ImageButton logWeightBtn = findViewById(R.id.logWeightBtn);

        // Button Click for workout screen
        logWorkoutBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Workout.class);
                startActivity(myIntent);
            }
        });
        // Button Click for weight screen
        logWeightBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Weight.class);
                startActivity(myIntent);
            }
        });
    }

}
