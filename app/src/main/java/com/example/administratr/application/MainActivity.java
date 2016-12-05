package com.example.administratr.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void kanaButtonClick(View view)  {
        setContentView(R.layout.kana_layout);
    }

    public void hiraganaButtonClick(View view)  {
        setContentView(R.layout.hiragana_layout);
    }

    public void katakanaButtonClick(View view)  {
        setContentView(R.layout.katakana_layout);
    }
}
