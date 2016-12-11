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

public class HiraganaActivity extends AppCompatActivity {



    int count = 0;
    static int randLimit = 13;
    int hirWords = MainActivity.uniWordCount2;
    int amountOfMistakes = 0;
    int amountOfHiraganaWords = hirWords;
    int amountOfCorrects = 0;

    Random rand = new Random();
    ArrayList<String> hiraganaWords = new ArrayList<String>();
    ArrayList<String> hiraganaAnswers = new ArrayList<String>();
    ArrayList<String> hiraganaTranslation = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana_layout);
        hiraganaQuiz();
    }
    // Amount of words now = 13

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
        hiraganaAnswers.add("iie");
        hiraganaAnswers.add("gomenasai");
        hiraganaAnswers.add("wakarimasen");
        hiraganaAnswers.add("yoku wakarimasu");
        hiraganaAnswers.add("ogenki desu ka");
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
        hiraganaWords.add("いいえ");
        hiraganaWords.add("ごめんなさい");
        hiraganaWords.add("わかりません");
        hiraganaWords.add("よくわかります");
        hiraganaWords.add("おげんきですか");

    }

    public void HiraganaTranslation() {
        hiraganaTranslation.add("Good evening");
        hiraganaTranslation.add("Meat");
        hiraganaTranslation.add("Good morning");
        hiraganaTranslation.add("Good night");
        hiraganaTranslation.add("Mother");
        hiraganaTranslation.add("Everything/All");
        hiraganaTranslation.add("Promise");
        hiraganaTranslation.add("Thanks for the meal");
        hiraganaTranslation.add("You can eat it");
        hiraganaTranslation.add("No");
        hiraganaTranslation.add("I'm Sorry");
        hiraganaTranslation.add("I don't understand");
        hiraganaTranslation.add("I understand you perfectly");
        hiraganaTranslation.add("How are youå");

    }


    public void results() {
        TextView correct = (TextView) findViewById(R.id.correct_view);
        TextView mistakes = (TextView) findViewById(R.id.mistakes_view);
        correct.setText("Correct: " + amountOfCorrects);
        mistakes.setText("Mistakes: " + amountOfMistakes);
    }

    private void hiraganaQuiz() {

        HiraganaWords();
        HiraganaAnswers();
        HiraganaTranslation();
        final EditText hiraganaTextInput = (EditText) findViewById(R.id.hiragana_text_input);
        final TextView hiraganaText = (TextView) findViewById(R.id.hiragana_text);
        final TextView hiraganaTranslationText = (TextView) findViewById(R.id.english_translation);
        hiraganaText.setText(hiraganaWords.get(count));
        hiraganaTranslationText.setText(hiraganaTranslation.get(count));
        //hiraganaTranslationText.setText(hiraganaTranslation.get(count));
        // Check if the input of the EditText is the same as the hiragana from the TextView
        findViewById(R.id.hiragana_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String hiragana = hiraganaTextInput.getText().toString();
                if (hiragana.equals(hiraganaAnswers.get(count))) {
                    amountOfCorrects += 1;
                    amountOfHiraganaWords -= 1;
                    if (amountOfHiraganaWords == 0){
                        setContentView(R.layout.result_layout);
                        results();
                        // Check for button presses on the Menu button or reset button in the result menu
                        findViewById(R.id.return_to_menu).setOnClickListener(new View.OnClickListener() {
                            public void onClick(View vieww) {
                                startActivity(new Intent(HiraganaActivity.this,MainActivity.class));
                                finish();
                            }
                        });
                        findViewById(R.id.restart_game).setOnClickListener(new View.OnClickListener() {
                            public void onClick(View viewww) {
                                startActivity(new Intent(HiraganaActivity.this,HiraganaActivity.class));
                                finish();
                            }
                        });

                    }
                    hiraganaTextInput.setText("");
                    // Removes the word that already has been shown from the array when answered to correctly
                    hiraganaWords.remove(count);
                    hiraganaAnswers.remove(count);
                    hiraganaTranslation.remove(count);
                    randLimit -= 1;
                    count = rand.nextInt(randLimit);
                    // Change the current word of the translation and the hiragana
                    hiraganaText.setText(hiraganaWords.get(count));
                    hiraganaTranslationText.setText(hiraganaTranslation.get(count));

                } else if (!hiragana.equals(hiraganaAnswers.get(count))){
                    amountOfMistakes += 1;
                }
            }
        });
    }


}
