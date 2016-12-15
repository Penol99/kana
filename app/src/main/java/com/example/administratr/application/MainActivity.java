package com.example.administratr.application;

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

    //Button presses
    public void kanaButtonClick(View view)  {
        
    }

    public void hiraganaButtonClick(View view)  {
        startActivity(new Intent(MainActivity.this, kanaActivity.class));
        kanaActivity.hir = true;
        kanaActivity.kat = false;

    }

    public void katakanaButtonClick(View view)  {
        startActivity(new Intent(MainActivity.this, kanaActivity.class));
        kanaActivity.hir = false;
        kanaActivity.kat = true;
    }


}
