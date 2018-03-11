package android_imc.jovennan.com.br.androidimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtPeso;
    private EditText txtAltura;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = (EditText) findViewById(R.id.editTextPeso);
        txtAltura = (EditText) findViewById(R.id.editTextAltura);
        btnCalcular = (Button) findViewById(R.id.buttonCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double peso = Double.parseDouble(txtPeso.getText().toString());
                Double altura = Double.parseDouble(txtAltura.getText().toString());
                Double imc = calcularImc(peso, altura);

                Toast.makeText(MainActivity.this, "IMC: "+String.format("%.2f", imc), Toast.LENGTH_LONG).show();
            }
        });
    }

    private double calcularImc(double peso, double altura) {
        return (10000 * peso / (altura * altura));
    }
}
