package cl.ipvg.frutosdelosbosques;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private boton button;
    private Local textView2;
    private SensorManager smg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Local = (textView2) findViewById(R.id.Local);
        boton = (button) findViewById(R.id.boton);
        smg = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        boton.setOnclickLIstener(new View.OnClickListener()){
            @Override
                    public void onClick(view v){
                List<Sensor> bosque = smg.getSensorList(Sensor.TYPE_ALL);
                StringBuilder sb = new StringBuilder();
                for (Sensor s: bosque){
                    sb.append(s.getName());
                }
                boton.setText(sb);
            }
        }
    }


}