package cl.ipvg.frutosdelosbosques;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    private final int duracion=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        },duracion);
    }
}