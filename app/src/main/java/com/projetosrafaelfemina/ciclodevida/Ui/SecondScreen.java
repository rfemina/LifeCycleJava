package com.projetosrafaelfemina.ciclodevida.Ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.projetosrafaelfemina.ciclodevida.R;

public class SecondScreen extends AppCompatActivity {

    private final String TAG = "lifecycle";
    private Button bt_screen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_screen);

        Log.i(TAG,getLocalClassName() + " .onCreate()");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,getLocalClassName() + " .onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,getLocalClassName() + " .onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,getLocalClassName() + " .onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,getLocalClassName() + " .onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,getLocalClassName() + " .onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,getLocalClassName() + " .onDestroy()");
    }

}