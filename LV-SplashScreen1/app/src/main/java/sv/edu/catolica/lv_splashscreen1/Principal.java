package sv.edu.catolica.lv_splashscreen1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Principal extends Activity {

    private Button btnEntrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.principal);

        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CambiarVentana();
            }
        });
    }

    public void CambiarVentana(){
        Intent objVentana = new Intent(Principal.this , secundario.class );
        startActivity(objVentana);
    }


}
