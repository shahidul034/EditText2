package com.shakibcsekuet.edittext2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText simpleEditText = (EditText) findViewById(R.id.simpleEditText);//get the id for edit text
        Button displayText = (Button) findViewById(R.id.displayText);//get the id for button
        displayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (simpleEditText.getText().toString() != null)//check whether the entered text is not null
                {
                    Toast.makeText(getApplicationContext(), simpleEditText.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
                }
            }
        });
    }


}