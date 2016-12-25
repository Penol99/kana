package com.example.administratr.kana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class kanaActivity extends AppCompatActivity {

    int count = 0;
    int randLimit = 4;
    int kanWords = randLimit;
    int amountOfMistakes = 0;
    int amountOfKanaWords = kanWords -1;
    int amountOfCorrects = 0;
    static boolean hir = false;
    static boolean kat = false;
    Random rand = new Random();
    ArrayList<String> kanaWords = new ArrayList<String>();
    ArrayList<String> kanaAnswers = new ArrayList<String>();
    ArrayList<String> kanaTranslation = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kana_layout);
        kanaQuiz();
    }



    private void changeKana() {
        randLimit = kanaAnswers.size();
        kanWords = randLimit;
        amountOfKanaWords = kanaAnswers.size()-1;
    }

    public void KanaAnswers(){
        if (hir == true) {
            kanaAnswers.clear();
            kanaAnswers.add("konbanwa");
            kanaAnswers.add("niku");
            kanaAnswers.add("ohayo");
            kanaAnswers.add("oyasumi");
            kanaAnswers.add("okaasan");
            kanaAnswers.add("zenbu");
            kanaAnswers.add("yakusoku");
            kanaAnswers.add("gochisousama");
            kanaAnswers.add("tabete io");
            kanaAnswers.add("iie");
            kanaAnswers.add("gomennasai");
            kanaAnswers.add("wakarimasen");
            kanaAnswers.add("yoku wakarimasu");
            kanaAnswers.add("ogenki desu ka");
            changeKana();
        } else if (kat == true) {
            kanaAnswers.clear();
            kanaAnswers.add("furaidopoteto");
            kanaAnswers.add("mafura");
            kanaAnswers.add("depato");
            kanaAnswers.add("fuaito");
            kanaAnswers.add("gemu");
            changeKana();
        }
    }
    public void KanaWords() {
        if (hir == true) {
            kanaWords.clear();
            kanaWords.add("こんばんは");
            kanaWords.add("にく");
            kanaWords.add("おはよ");
            kanaWords.add("おやすみ");
            kanaWords.add("おかあさん");
            kanaWords.add("ぜんぶ");
            kanaWords.add("やくそく");
            kanaWords.add("ごちそうさま");
            kanaWords.add("たべていお");
            kanaWords.add("いいえ");
            kanaWords.add("ごめんなさい");
            kanaWords.add("わかりません");
            kanaWords.add("よくわかります");
            kanaWords.add("おげんきですか");
        } else if (kat == true) {
            kanaWords.clear();
            kanaWords.add("フライドポテト");
            kanaWords.add("マフラ");
            kanaWords.add("デパート");
            kanaWords.add("ファイト");
            kanaWords.add("ゲーム");
        }
    }
    public void KanaTranslation() {
        if (hir == true) {
            kanaTranslation.clear();
            kanaTranslation.add("Good evening");
            kanaTranslation.add("Meat");
            kanaTranslation.add("Good morning");
            kanaTranslation.add("Good night");
            kanaTranslation.add("Mother");
            kanaTranslation.add("Everything/All");
            kanaTranslation.add("Promise");
            kanaTranslation.add("Thanks for the meal");
            kanaTranslation.add("You can eat it");
            kanaTranslation.add("No");
            kanaTranslation.add("I'm Sorry");
            kanaTranslation.add("I don't understand");
            kanaTranslation.add("I understand you perfectly");
            kanaTranslation.add("How are you");
        } else if (kat == true) {
            kanaTranslation.clear();
            kanaTranslation.add("French fries");
            kanaTranslation.add("Scarf");
            kanaTranslation.add("Department Store");
            kanaTranslation.add("Go for it!");
            kanaTranslation.add("Game");
        }
    }


    public void results() {
        TextView correct = (TextView) findViewById(R.id.correct_view);
        TextView mistakes = (TextView) findViewById(R.id.mistakes_view);
        correct.setText("Correct: " + amountOfCorrects);
        mistakes.setText("Mistakes: " + amountOfMistakes);
        if (amountOfMistakes == 0 ) {
            correct.setText("You completed them all!");
        }
        if (amountOfCorrects <= 0) {
            correct.setText("You made to many mistakes!");
        }
    }

    private void kanaQuiz() {
        KanaWords();
        KanaAnswers();
        KanaTranslation();
        final EditText kanaTextInput = (EditText) findViewById(R.id.kana_text_input);
        final TextView kanaText = (TextView) findViewById(R.id.kana_text);
        final TextView kanaTranslationText = (TextView) findViewById(R.id.english_translation);
        kanaText.setText(kanaWords.get(count));
        kanaTranslationText.setText(kanaTranslation.get(count));

        // Check if the input of the EditText is the same as the hiragana from the TextView
        findViewById(R.id.kana_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String kana = kanaTextInput.getText().toString();
                if (kana.replace(" ", "").equalsIgnoreCase(kanaAnswers.get(count).replace(" ", ""))) {
                    amountOfCorrects += 1;
                    amountOfKanaWords -= 1;
                    if (amountOfKanaWords == 0){
                        setContentView(R.layout.result_layout);
                        results();
                        // Check for button presses on the Menu button or reset button in the result menu
                        findViewById(R.id.return_to_menu).setOnClickListener(new View.OnClickListener() {
                            public void onClick(View vieww) {
                                startActivity(new Intent(kanaActivity.this,MainActivity.class));
                                finish();
                            }
                        });
                        findViewById(R.id.restart_game).setOnClickListener(new View.OnClickListener() {
                            public void onClick(View viewww) {
                                startActivity(new Intent(kanaActivity.this,kanaActivity.class));
                                finish();
                            }
                        });

                    }
                    kanaTextInput.setText("");
                    // Removes the word that already has been shown from the array when answered to correctly
                    kanaWords.remove(count);
                    kanaAnswers.remove(count);
                    kanaTranslation.remove(count);
                    randLimit -= 1;
                    count = rand.nextInt(randLimit);
                    // Change the current word of the translation and the kana
                    kanaText.setText(kanaWords.get(count));
                    kanaTranslationText.setText(kanaTranslation.get(count));

                } else if (!kana.equals(kanaAnswers.get(count))){
                    amountOfMistakes += 1;
                    amountOfCorrects -= 1;
                }
            }
        });
    }


}
