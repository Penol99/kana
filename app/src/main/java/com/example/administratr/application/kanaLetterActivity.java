package com.example.administratr.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class kanaLetterActivity extends AppCompatActivity {


    int amountOfWords = 46;
    Random rand = new Random();
    ArrayList<String> hiraganaLetters = new ArrayList<String>();
    ArrayList<String> katakanaLetters = new ArrayList<String>();
    ArrayList<String> romajiLetters = new ArrayList<String>();
    ArrayList<String> currentRomaji = new ArrayList<String>();
    ArrayList<String> currentKana = new ArrayList<String>();

    public void HiraganaLetters() {
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
    public void KatakanaLetters() {
        katakanaLetters.add("ア");
        katakanaLetters.add("イ");
        katakanaLetters.add("ウ");
        katakanaLetters.add("エ");
        katakanaLetters.add("オ");
        katakanaLetters.add("カ");
        katakanaLetters.add("キ");
        katakanaLetters.add("ク");
        katakanaLetters.add("ケ");
        katakanaLetters.add("コ");
        katakanaLetters.add("サ");
        katakanaLetters.add("シ");
        katakanaLetters.add("ス");
        katakanaLetters.add("セ");
        katakanaLetters.add("ソ");
        katakanaLetters.add("タ");
        katakanaLetters.add("チ");
        katakanaLetters.add("ツ");
        katakanaLetters.add("テ");
        katakanaLetters.add("ト");
        katakanaLetters.add("ナ");
        katakanaLetters.add("ニ");
        katakanaLetters.add("ヌ");
        katakanaLetters.add("ネ");
        katakanaLetters.add("ノ");
        katakanaLetters.add("ハ");
        katakanaLetters.add("ヒ");
        katakanaLetters.add("フ");
        katakanaLetters.add("ヘ");
        katakanaLetters.add("ホ");
        katakanaLetters.add("マ");
        katakanaLetters.add("ミ");
        katakanaLetters.add("ム");
        katakanaLetters.add("メ");
        katakanaLetters.add("モ");
        katakanaLetters.add("ヤ");
        katakanaLetters.add("ユ");
        katakanaLetters.add("ヨ");
        katakanaLetters.add("ラ");
        katakanaLetters.add("リ");
        katakanaLetters.add("ル");
        katakanaLetters.add("レ");
        katakanaLetters.add("ロ");
        katakanaLetters.add("ワ");
        katakanaLetters.add("ヲ");
        katakanaLetters.add("ン");
    }
    public void RomajiLetters() {
        romajiLetters.add("a");
        romajiLetters.add("i");
        romajiLetters.add("u");
        romajiLetters.add("e");
        romajiLetters.add("o");
        romajiLetters.add("ka");
        romajiLetters.add("ki");
        romajiLetters.add("ku");
        romajiLetters.add("ke");
        romajiLetters.add("ko");
        romajiLetters.add("sa");
        romajiLetters.add("shi");
        romajiLetters.add("su");
        romajiLetters.add("se");
        romajiLetters.add("so");
        romajiLetters.add("ta");
        romajiLetters.add("chi");
        romajiLetters.add("tsu");
        romajiLetters.add("te");
        romajiLetters.add("to");
        romajiLetters.add("na");
        romajiLetters.add("ni");
        romajiLetters.add("nu");
        romajiLetters.add("ne");
        romajiLetters.add("no");
        romajiLetters.add("ha");
        romajiLetters.add("hi");
        romajiLetters.add("fu");
        romajiLetters.add("he");
        romajiLetters.add("ho");
        romajiLetters.add("ma");
        romajiLetters.add("mi");
        romajiLetters.add("mu");
        romajiLetters.add("me");
        romajiLetters.add("mo");
        romajiLetters.add("ya");
        romajiLetters.add("yu");
        romajiLetters.add("yo");
        romajiLetters.add("ra");
        romajiLetters.add("ri");
        romajiLetters.add("ru");
        romajiLetters.add("re");
        romajiLetters.add("ro");
        romajiLetters.add("wa");
        romajiLetters.add("wo");
        romajiLetters.add("n");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kana_letter_activity);
        buttonText();
    }

    public void buttonText() {
        amountOfWords = 46;
        int count;
        hiraganaLetters.clear();
        katakanaLetters.clear();
        currentKana.clear();
        currentRomaji.clear();
        romajiLetters.clear();
        HiraganaLetters();
        KatakanaLetters();
        RomajiLetters();
        Button button1 = (Button) findViewById(R.id.answer_buton_1);
        Button button2 = (Button) findViewById(R.id.answer_buton_2);
        Button button3 = (Button) findViewById(R.id.answer_buton_3);
        Button button4 = (Button) findViewById(R.id.answer_buton_4);
        TextView romajiText = (TextView) findViewById(R.id.romaji_text_view);

        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        button1.setText(hiraganaLetters.get(count));
        currentKana.add(String.valueOf(button1.getText()));
        romajiLetters.remove(count);
        hiraganaLetters.remove(count);
        amountOfWords -= 1;

        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        button2.setText(hiraganaLetters.get(count));
        currentKana.add(String.valueOf(button2.getText()));
        romajiLetters.remove(count);
        hiraganaLetters.remove(count);
        amountOfWords -= 1;

        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        button3.setText(hiraganaLetters.get(count));
        currentKana.add(String.valueOf(button3.getText()));
        romajiLetters.remove(count);
        hiraganaLetters.remove(count);
        amountOfWords -= 1;

        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        button4.setText(hiraganaLetters.get(count));
        currentKana.add(String.valueOf(button4.getText()));

        final int count2 = rand.nextInt(2);
        final String current_kana = currentKana.get(count2);
        romajiText.setText(currentRomaji.get(count2));

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                if (current_kana == currentKana.get(0)) {
                    buttonText();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                if (current_kana == currentKana.get(1)) {
                    buttonText();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                if (current_kana == currentKana.get(2)) {
                    buttonText();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                if (current_kana == currentKana.get(3)) {
                    buttonText();
                }
            }
        });


    }
}
