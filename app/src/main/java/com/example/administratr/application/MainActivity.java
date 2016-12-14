package com.example.administratr.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Button presses
    public void kanaButtonClick(View view)  {

        setContentView(R.layout.kana_layout);
    }

    public void hiraganaButtonClick(View view)  {
        startActivity(new Intent(MainActivity.this, HiraganaActivity.class));
        kanaActivity.hir = true;
        kanaActivity.kat = false;

    }

    public void katakanaButtonClick(View view)  {
        startActivity(new Intent(MainActivity.this, HiraganaActivity.class));
        kanaActivity.hir = false;
        kanaActivity.kat = true;
    }


}
