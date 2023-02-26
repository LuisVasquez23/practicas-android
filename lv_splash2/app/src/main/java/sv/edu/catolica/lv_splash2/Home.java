package sv.edu.catolica.lv_splash2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Home extends AppCompatActivity {

    boolean buttonPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);

        Handler manjeador = new Handler();

        manjeador.postDelayed(new Runnable() {
            @Override
            public void run() {

                if(!buttonPressed){
                    finish();
                    Intent openWindow = new Intent(Home.this , MainActivity.class);
                    startActivity(openWindow);
                }


            }
        } , 3000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        buttonPressed=true;
    }
}