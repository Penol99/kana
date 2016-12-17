package com.example.administratr.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class kanaLetterActivity extends AppCompatActivity {


    ArrayList<String> hiraganaLetters = new ArrayList<String>();
    ArrayList<String> katakanaLetters = new ArrayList<String>();
    ArrayList<String> romajiLetters = new ArrayList<String>();

    public void HiraganaLetter() {
        hiraganaLetters.add("あ");
        hiraganaLetters.add("い");
        hiraganaLetters.add("う");
        hiraganaLetters.add("え");
        hiraganaLetters.add("お");
        hiraganaLetters.add("か");
        hiraganaLetters.add("き");
        hiraganaLetters.add("く");
        hiraganaLetters.add("け");
        hiraganaLetters.add("こ");
        hiraganaLetters.add("さ");
        hiraganaLetters.add("し");
        hiraganaLetters.add("す");
        hiraganaLetters.add("せ");
        hiraganaLetters.add("そ");
        hiraganaLetters.add("た");
        hiraganaLetters.add("ち");
        hiraganaLetters.add("つ");
        hiraganaLetters.add("て");
        hiraganaLetters.add("と");
        hiraganaLetters.add("な");
        hiraganaLetters.add("に");
        hiraganaLetters.add("ぬ");
        hiraganaLetters.add("ね");
        hiraganaLetters.add("の");
        hiraganaLetters.add("は");
        hiraganaLetters.add("ひ");
        hiraganaLetters.add("ふ");
        hiraganaLetters.add("へ");
        hiraganaLetters.add("ほ");
        hiraganaLetters.add("ま");
        hiraganaLetters.add("み");
        hiraganaLetters.add("む");
        hiraganaLetters.add("め");
        hiraganaLetters.add("も");
        hiraganaLetters.add("や");
        hiraganaLetters.add("ゆ");
        hiraganaLetters.add("よ");
        hiraganaLetters.add("ら");
        hiraganaLetters.add("り");
        hiraganaLetters.add("る");
        hiraganaLetters.add("れ");
        hiraganaLetters.add("ろ");
        hiraganaLetters.add("わ");
        hiraganaLetters.add("を");
        hiraganaLetters.add("ん");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kana_letter_activity);
    }


}
