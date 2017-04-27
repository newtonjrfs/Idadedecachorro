package com.newton.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText idadeDoCachorro;
    private Button botaoCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeDoCachorro = (EditText) findViewById(R.id.idadeCachorro);
        botaoCalcular = (Button) findViewById(R.id.botaoCalcular);
        resultado = (TextView) findViewById(R.id.resultado);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String numeroDigitado = idadeDoCachorro.getText().toString();

                if (numeroDigitado.isEmpty()){

                    resultado.setText(R.string.erro_idade_cachorro);
                    //Toast.makeText(MainActivity.this,R.string.erro_idade_cachorro,Toast.LENGTH_SHORT).show();

                }else{

                    int valorDigitado = Integer.parseInt(numeroDigitado);
                    int resultadoFinal = valorDigitado * 7 ;

                    resultado.setText("A idade do seu cachorro em anos humanos e de " + resultadoFinal + " anos");

                }

            }
        });

    }
}
