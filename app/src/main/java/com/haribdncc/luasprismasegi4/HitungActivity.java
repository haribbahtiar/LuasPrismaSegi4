package com.haribdncc.luasprismasegi4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HitungActivity extends AppCompatActivity {

    //kamus
    TextView panjang, lebar, tinggi, luas;
    Button kembali;
    int p=1;
    int l=1;
    int t=1;
    int luaspris=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);

        panjang = (TextView)findViewById(R.id.taruh_panjang);
        lebar = (TextView)findViewById(R.id.taruh_lebar);
        tinggi = (TextView)findViewById(R.id.taruh_tinggi);
        luas = (TextView)findViewById(R.id.taruh_luas);
        kembali = (Button)findViewById(R.id.btnkembali);

        Intent i = getIntent();
        String input_panjang = i.getStringExtra("input_panjang");
        String input_lebar = i.getStringExtra("input_lebar");
        String input_tinggi = i.getStringExtra("input_tinggi");

        double p = Double.parseDouble(input_panjang);
        double l = Double.parseDouble(input_lebar);
        double t = Double.parseDouble(input_tinggi);
        double luaspris = 2*p*l+2*(p+l)*t;

        panjang.setText(input_panjang);
        lebar.setText(input_lebar);
        tinggi.setText(input_tinggi);
        luas.setText("2 x " + input_panjang + " x " + input_lebar  + "+ 2 x ( " + input_panjang + " + " + input_lebar + " ) x " + input_tinggi + " = " + luaspris );

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HitungActivity.this, MainActivity.class));
                finish();
            }
        });


    }

}
