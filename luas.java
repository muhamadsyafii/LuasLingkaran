package com.example.upil.luaslingkaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas extends AppCompatActivity {

    EditText jari2;
    TextView txt_hasil;
    Button hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        jari2 = (EditText) findViewById(R.id.jari_jari);
        hasil = (Button) findViewById(R.id.btn_hasil);
        txt_hasil = (TextView) findViewById(R.id.txt_hasil);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double jari = Double.parseDouble(String.valueOf(jari2.getText()));
                Double luas_lingkaran = (3.14 * jari * jari);
                txt_hasil.setText(String.valueOf(luas_lingkaran));
            }
        });
    }
}
