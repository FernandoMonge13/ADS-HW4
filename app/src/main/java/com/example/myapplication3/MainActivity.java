package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto1;
    Button bt1;
    int contador = 0;

    XORLinkedList list = new XORLinkedList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto1 = findViewById(R.id.texto1);
        bt1 = findViewById(R.id.bt1);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

                list.generation();
                //contador++;
                list.traverseInForward();
                texto1.setText((CharSequence)( XORLinkedList.fullSRT));
                XORLinkedList.fullSRT = "null <->";
                //String hp = texto1.getText().toString();
            }
        });

    }
}