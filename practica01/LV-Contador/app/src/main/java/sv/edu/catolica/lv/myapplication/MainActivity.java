package sv.edu.catolica.lv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Obtener las variables
    private TextView mensaje;
    private Button btnClick;

    private int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignar variables
        mensaje = findViewById(R.id.mensaje);
        btnClick = findViewById(R.id.btn_click);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                mensaje.setText("Click numero" + contador);
            }
        });
    }


}