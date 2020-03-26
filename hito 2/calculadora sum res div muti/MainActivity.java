package com.example.recuerdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1,tvRespuesta;
    private Button btSumar,btResta,btMulti,btDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
    private void initializeVariables(){
        et1=findViewById(R.id.etnumero1);
        et2=findViewById(R.id.etnumero2);

        tv1=findViewById(R.id.tv1);
        tv1.setText("Calculadora Basica");
        tvRespuesta=findViewById(R.id.tv2);

        btSumar=findViewById(R.id.btSumar);
        btResta=findViewById(R.id.btRestar);
        btMulti=findViewById(R.id.btMulti);
        btDiv=findViewById(R.id.btDiv);

        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String n1 =et1.getText().toString();
               String n2=et2.getText().toString();

               int respuesta=Integer.parseInt(n1)+Integer.parseInt(n2);
               tvRespuesta.setText(""+respuesta);
            }
        });

        btResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 =et1.getText().toString();
                String n2=et2.getText().toString();

                int respuesta=Integer.parseInt(n1)-Integer.parseInt(n2);
                tvRespuesta.setText(""+respuesta);
            }
        });

        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 =et1.getText().toString();
                String n2=et2.getText().toString();

                int respuesta=Integer.parseInt(n1)*Integer.parseInt(n2);
                tvRespuesta.setText(""+respuesta);
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 =et1.getText().toString();
                String n2=et2.getText().toString();

                int respuesta=Integer.parseInt(n1)/Integer.parseInt(n2);
                tvRespuesta.setText(""+respuesta);
            }
        });
    }
}
