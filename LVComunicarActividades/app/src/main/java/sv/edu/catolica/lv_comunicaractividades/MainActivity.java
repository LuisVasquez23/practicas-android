package sv.edu.catolica.lv_comunicaractividades;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;
    private EditText nombre;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btn_enviar);
        nombre = findViewById(R.id.etNombre);
        resultado = findViewById(R.id.tvResultado);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(nombre.getText());
            }
        });
    }

    public void ProcesoAcercaDe(View view) {

    }

    public void ProcesoSalir(View view){
        finish();
    }
}