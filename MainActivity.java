package com.example.upil.luaslingkaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewUtils;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnPindahActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPindahActivity = (Button) findViewById(R.id.btn_pindah_activity);
        btnPindahActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pindah_activity:
                Intent pindahIntent = new Intent(MainActivity.this,luas.class);
                startActivity(pindahIntent);
                break;

        }

    }
}
