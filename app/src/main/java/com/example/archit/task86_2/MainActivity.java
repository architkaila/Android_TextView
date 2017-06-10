package com.example.archit.task86_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String toast = "Toast Class is used to broadcast any msg on any specific event. It uses a static method makeText() with 3 parameters ie Context,Message,duration. ";
    String evtHandle = "EVENT HANDLING can be done in 2 ways \n" +
                        "1.Xml \n" + "2.Java";
    String history = "Android is a mobile operating system developed by Google, based on the Linux kernel. It was initially made by Android Inc";
    String lifecycle = "OnCreate() -> OnStart() -> OnResume() -> OnPause() -> OnStop() -> OnDestroy()";
    String orientation = "Orientation can be Portrait or LandScape\n" + "Changing the Orientation Restarts the Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_toast = (Button) findViewById(R.id.btn_toast);
        Button btn_eventhandl = (Button) findViewById(R.id.btn_eventhandl);
        Button btn_history = (Button)  findViewById(R.id.btn_history);
        Button btn_lifecycle = (Button) findViewById(R.id.btn_lifecycle);
        Button btn_orientation = (Button) findViewById(R.id.btn_orientation);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_text = (TextView) findViewById(R.id.tv_text);
                tv_text.setText(toast);
            }
        });

        btn_eventhandl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_text = (TextView) findViewById(R.id.tv_text);
                tv_text.setText(evtHandle);
            }
        });

        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_text = (TextView) findViewById(R.id.tv_text);
                tv_text.setText(history);
            }
        });

        btn_lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_text = (TextView) findViewById(R.id.tv_text);
                tv_text.setText(lifecycle);
            }
        });

        btn_orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_text = (TextView) findViewById(R.id.tv_text);
                tv_text.setText(orientation);
            }
        });
    }
}
