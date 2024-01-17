package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String TAG= "MainActvity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // implement fruit selection logic, display in Toast and log to console

        CheckBox apple,banana,orange,pineapple;
        Button btnSelected;


        apple = findViewById(R.id.apple);
        banana = findViewById(R.id.banana);
        orange = findViewById(R.id.orange);
        pineapple = findViewById(R.id.pineapple);
        btnSelected = findViewById(R.id.btnSelected);

        btnSelected.setOnClickListener(view -> {
            StringBuilder selectedFruits = new StringBuilder();
            selectedFruits.append("Selected Items");

            if (apple.isChecked()){
                selectedFruits.append("\n Apple");
            }
            if (banana.isChecked()){
                selectedFruits.append("\n Banana");
            }
            if (orange.isChecked()){
                selectedFruits.append("\n Orange");
            }
            if (pineapple.isChecked()){
                selectedFruits.append("\n Pineapple");
            }

            Toast.makeText(this, selectedFruits.toString(), Toast.LENGTH_SHORT).show();
            Log.d(TAG, selectedFruits.toString());
        }); // end btnSelected click event

    }
}