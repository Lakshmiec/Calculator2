package com.example.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText t1;
     EditText t2;
     Button  bu;
     TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= findViewById(R.id.editText1);
        t2= findViewById(R.id.editText2);
        bu =findViewById(R.id.button);
        text=findViewById(R.id.textView);
    }

    public void ADD(View view) {
        int a = Integer.parseInt(t1.getText().toString());
        int b = Integer.parseInt(t2.getText().toString());
        int  sum= a+ b;
        text.setText( String.valueOf(sum));
    }
}
