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


    int  wordCount = 0;
    static int uniWordCount = HiraganaActivity.randLimit-1;
    static int uniWordCount2 = 0;
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
        HiraganaActivity.hir = true;
        HiraganaActivity.kat = false;

    }

    public void katakanaButtonClick(View view)  {

        startActivity(new Intent(MainActivity.this, HiraganaActivity.class));
        HiraganaActivity.hir = false;
        HiraganaActivity.kat = true;
    }


    public void moreWords(View viewwww) {

        TextView wordCountView = (TextView) findViewById(R.id.amount_of_words_view);
        wordCount += 1;
        wordCountView.setText(String.valueOf(wordCount));
        if (wordCount >= HiraganaActivity.randLimit-1) {
            wordCount = HiraganaActivity.randLimit-2;
        }
        uniWordCount2 = wordCount;
    }
    public void lessWords(View viewwwww) {
        if (wordCount <= 0) {
            wordCount = 1;
        }
        TextView wordCountView = (TextView) findViewById(R.id.amount_of_words_view);
        wordCount -= 1;
        wordCountView.setText(String.valueOf(wordCount));

        uniWordCount2 = wordCount;
    }



}
