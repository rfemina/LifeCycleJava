package com.projetosrafaelfemina.ciclodevida;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.projetosrafaelfemina.ciclodevida.Ui.SecondScreen;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "lifecycle";
    private Button bt_screen2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.i(TAG,getLocalClassName() + " .onCreate()");
        bt_screen2 = findViewById(R.id.btScreen2);

        bt_screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegandoParaSegundaTela = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(navegandoParaSegundaTela);

            }
        });

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