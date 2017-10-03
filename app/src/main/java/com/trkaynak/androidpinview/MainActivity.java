package com.trkaynak.androidpinview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

public class MainActivity extends AppCompatActivity {
//pin code
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pinview pinview=(Pinview) findViewById(R.id.pinview);

        pinview.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean b) {
                Toast.makeText(MainActivity.this,""+pinview.getValue(),Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,""+pinview.getValue(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
