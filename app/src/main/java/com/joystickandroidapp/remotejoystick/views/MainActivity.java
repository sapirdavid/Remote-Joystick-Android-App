package com.joystickandroidapp.remotejoystick.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.joystickandroidapp.remotejoystick.R;
import com.joystickandroidapp.remotejoystick.view_model.ViewModel;

public class MainActivity extends AppCompatActivity {
    public ViewModel vm;
    private TextView rudderData;
    private SeekBar rudderBar;
    private TextView throttleData;
    private SeekBar throttleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rudderData = (TextView) findViewById(R.id.rudderData);
        rudderBar = (SeekBar) findViewById(R.id.rudderBar);

        throttleData = (TextView) findViewById(R.id.throttleData);
        throttleBar = (SeekBar) findViewById(R.id.throttleBar);

        rudderBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                /* the progValue is the progress after convert to the -1 - 1 range*/
                //NewValue = (((OldValue - OldMin) * (NewMax - NewMin)) / (OldMax - OldMin)) + NewMin
                double progValue = (((double) progress * 2) / 100) + -1;
                /* round two digits after point */
                progValue = (int)(Math.round(progValue * 100)) / 100.0;
                rudderData.setText("" + progValue );
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        throttleBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                /* the progValue is the progress after convert to the -1 - 1 range*/
                //NewValue = (((OldValue - OldMin) * (NewMax - NewMin)) / (OldMax - OldMin)) + NewMin
                double progValue = (((double) progress * 2) / 100) + -1;
                /* round two digits after point */
                progValue = (int)(Math.round(progValue * 100)) / 100.0;
                throttleData.setText("" + progValue );
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        Button connect = findViewById(R.id.connectButton);
        EditText ip = findViewById(R.id.IPText);
        EditText port = findViewById(R.id.PORTText);
        /* show message when the button is clicked */
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: to do a message of connection starting
//                Toast t = Toast.makeText(getApplicationContext(), "Connection Starting", Toast.LENGTH_SHORT);
//                t.show();
                /* user's input of ip and port*/
                String ipStr = ip.getText().toString();
                String portStr = port.getText().toString();
                /* show message with ip and port */
                Toast t = Toast.makeText(getApplicationContext(), "the ip: " + ipStr + "the port: " + portStr, Toast.LENGTH_SHORT);
                t.show();
            }
        });

    }
}