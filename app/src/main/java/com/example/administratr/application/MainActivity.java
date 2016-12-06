package com.example.administratr.application;

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

    int count = 0;
    int randLimit = 9;
    Random rand = new Random();
    ArrayList<String> hiraganaWords = new ArrayList<String>();
    ArrayList<String> hiraganaAnswers = new ArrayList<String>();

    public void HiraganaAnswers(){
        hiraganaAnswers.add("konbanwa");
        hiraganaAnswers.add("niku");
        hiraganaAnswers.add("ohayo");
        hiraganaAnswers.add("oyasumi");
        hiraganaAnswers.add("okaasan");
        hiraganaAnswers.add("zenbu");
        hiraganaAnswers.add("yakusoku");
        hiraganaAnswers.add("gochisousama");
        hiraganaAnswers.add("tabete io");
    }
    public void HiraganaWords() {
        hiraganaWords.add("こんばんは");
        hiraganaWords.add("にく");
        hiraganaWords.add("おはよ");
        hiraganaWords.add("おやすみ");
        hiraganaWords.add("おかあさん");
        hiraganaWords.add("ぜんぶ");
        hiraganaWords.add("やくそく");
        hiraganaWords.add("ごちそうさま");
        hiraganaWords.add("たべていお");

    }

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

        setContentView(R.layout.hiragana_layout);
        hiraganaQuiz();
    }

    public void katakanaButtonClick(View view)  {

        setContentView(R.layout.katakana_layout);
    }


    // Quiz methods
    private void hiraganaQuiz() {
        HiraganaWords();
        HiraganaAnswers();
        final EditText hiraganaTextInput = (EditText) findViewById(R.id.hiragana_text_input);
        final TextView hiraganaText = (TextView) findViewById(R.id.hiragana_text);
        hiraganaText.setText(hiraganaWords.get(count));
        // Check if the input of the EditText is the same as the hiragana from the TextView
        findViewById(R.id.hiragana_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String hiragana = hiraganaTextInput.getText().toString();
                if (hiragana.equals(hiraganaAnswers.get(count))) {
                    //count = rand.nextInt(randLimit);
                    hiraganaTextInput.setText("");
                    hiraganaWords.remove(count);
                    hiraganaAnswers.remove(count);
                    randLimit -= 1;
                    count = rand.nextInt(randLimit);
                    hiraganaText.setText(hiraganaWords.get(count));

                }
            }
        });
    }

}
