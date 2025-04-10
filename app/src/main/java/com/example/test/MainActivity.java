package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText et, et2;
    TextView te;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        et = (EditText)findViewById(R.id.editTextText2);
        et2 = (EditText)findViewById(R.id.editTextText3);
        te = (TextView)findViewById(R.id.textView4);
    }
    public void plus(View view) {
        int num = Integer.parseInt(et.getText().toString()) + Integer.parseInt(et2.getText().toString());;
        te.setText("" + num);
    }
    public void minus(View view) {
        int num = Integer.parseInt(et.getText().toString()) - Integer.parseInt(et2.getText().toString());;
        te.setText("" + num);
    }

    public void multi(View view) {
        int num = Integer.parseInt(et.getText().toString()) * Integer.parseInt(et2.getText().toString());;
        te.setText("" + num);

    }

    public void nanugi(View view) {
        int num = Integer.parseInt(et.getText().toString()) / Integer.parseInt(et2.getText().toString());;
        te.setText("" + num);
    }


}