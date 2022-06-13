package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnCreate1",Toast.LENGTH_SHORT).show();

        TextView tv1= (findViewById(R.id.tv1));
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }


    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"OnStart1",Toast.LENGTH_SHORT).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"OnResume1",Toast.LENGTH_SHORT).show();
    }

    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this,"OnPause1",Toast.LENGTH_SHORT).show();
    }
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"OnStop1",Toast.LENGTH_SHORT).show();
    }
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"OnRestart1",Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy1",Toast.LENGTH_SHORT).show();
    }

}