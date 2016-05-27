package com.mclr.mini.estilostemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNormalClick(View view) {
        Intent intent = new Intent(this, NormalActivity.class);
        startActivity(intent);
    }

    public void onEstiloClick(View view) {
        Intent intent = new Intent(this, EstiloActivity.class);
        startActivity(intent);
    }

    public void onTemaClick(View view) {
        Intent intent = new Intent(this, TemaActivity.class);
        startActivity(intent);
    }
}
