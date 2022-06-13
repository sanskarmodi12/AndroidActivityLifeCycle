package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(this,"OnCreate2",Toast.LENGTH_SHORT).show();
    }
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"OnStart12",Toast.LENGTH_SHORT).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"OnResume2",Toast.LENGTH_SHORT).show();
    }

    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this,"OnPause2",Toast.LENGTH_SHORT).show();
    }
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"OnStop2",Toast.LENGTH_SHORT).show();
    }
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"OnRestart2",Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy2",Toast.LENGTH_SHORT).show();
    }
}