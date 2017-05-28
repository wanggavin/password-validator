package com.example.passwordvalidator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the validate button */
    public void sendMessage(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        TextView textView = (TextView) findViewById(R.id.textview);
        mainFunc pwdV = new mainFunc();

        if(pwdV.isStrong(message) == true)
            textView.setText("strong");
        else
            textView.setText("not strong");

    }
}
