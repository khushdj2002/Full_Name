package com.example.fullname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText fName = findViewById(R.id.fName);
        EditText lName = findViewById(R.id.lName);
        Button btn = findViewById(R.id.btn);
        TextView ans = findViewById(R.id.answer);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer =fName.getText().toString();
                String answer1 =lName.getText().toString();

                ans.setText(answer+" "+answer1);
            }
        });
    }
}