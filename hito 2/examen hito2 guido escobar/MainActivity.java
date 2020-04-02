package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText etco1,etco2,etco11,etco22,etco111,etco222,ediconfir,edisos,edipais,edibusq;
    public Button btset,btcalcu;
    public String confir,sospe,paiis,ver,cont1,cont2,cont3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
    private void initializeVariables(){
        etco1=findViewById(R.id.etco1);
        etco2=findViewById(R.id.etco2);
        etco11=findViewById(R.id.etco11);
        etco22=findViewById(R.id.etco22);
        etco111=findViewById(R.id.etco111);
        etco222=findViewById(R.id.etco222);
        ediconfir=findViewById(R.id.ediconfir);
        edisos=findViewById(R.id.edisos);
        edipais=findViewById(R.id.edipais);
        edibusq=findViewById(R.id.edibusq);
        btset=findViewById(R.id.btset);
        btcalcu=findViewById(R.id.btcalcu);

        btset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edipais.equals(""))
                {

                    Toast.makeText(getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();

                }
                else if(ediconfir.equals(""))
                {
                    Toast.makeText(getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();

                }
                else if(edisos.equals(""))
                {
                    Toast.makeText(getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();

                }
                else {
                    if (edipais.getText().toString().equals("ORURO") || edipais.getText().toString().equals("oruro")) {

                        etco11.setText(ediconfir.getText());
                        etco22.setText(edisos.getText());


                    }

                    else if (edipais.getText().toString().equals("SANTA CRUZ") || edipais.getText().toString().equals("santa cruz")) {

                        etco111.setText(ediconfir.getText());
                        etco222.setText(edisos.getText());



                    }
                    else if (edipais.getText().toString().equals("COCHABAMBA") || edipais.getText().toString().equals("cochabamba")) {

                        etco1.setText(ediconfir.getText());
                        etco2.setText(edisos.getText());


                    }
                    else{

                        Toast.makeText(getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();
                    }

                }
            }
        });
    }
}
