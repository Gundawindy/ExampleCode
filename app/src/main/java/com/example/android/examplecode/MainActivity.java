package com.example.android.examplecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar_bar);
    }

    public void hasBeenClicked(View view){
        Toast.makeText(this, "The button has been clicked",
                Toast.LENGTH_LONG).show();
    }

}
