package com.haribdncc.luasprismasegi4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //kamus
    EditText panjang, lebar, tinggiprisma;
    Button hitung;
    int luaspris=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = (EditText)findViewById(R.id.input_panjang);
        lebar = (EditText)findViewById(R.id.input_lebar);
        tinggiprisma = (EditText)findViewById(R.id.input_tinggi);
        hitung = (Button)findViewById(R.id.hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(panjang.length() == 0 || lebar.length() == 0 || tinggiprisma.length() == 0){
                    Toast.makeText(MainActivity.this, "Isi Yang Lengkap!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent hitungluas = new Intent(getApplicationContext(), HitungActivity.class);

                    hitungluas.putExtra("input_panjang", panjang.getText().toString());
                    hitungluas.putExtra("input_lebar", lebar.getText().toString());
                    hitungluas.putExtra("input_tinggi", tinggiprisma.getText().toString());


                    startActivity(hitungluas);
                }

            }
        });
    }
}
