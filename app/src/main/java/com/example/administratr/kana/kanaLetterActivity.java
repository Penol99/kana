package com.example.administratr.kana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class kanaLetterActivity extends AppCompatActivity {

    boolean doneSelect = false;
    static int realLimit = 10;
    static int amountOfWords = realLimit;
    int count;
    int limit = amountOfWords;
    int amountOfTurns = 0;
    int amountOfMistakes = 0;
    int amountOfCorrects = 0;
    Random rand = new Random();
    static boolean hir = false;
    static boolean kat = false;
    static ArrayList<String> hiraganaLetters = new ArrayList<String>();
    static ArrayList<String> katakanaLetters = new ArrayList<String>();
    ArrayList<String> romajiLetters = new ArrayList<String>();
    ArrayList<String> currentRomaji = new ArrayList<String>();
    ArrayList<String> currentKana = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.kana_letter_activity);
        ButtonAndTextHandling();
        if (selectKanaActivity.kana_amount <= 0) {
            realLimit = 71;
        } else {
            realLimit = selectKanaActivity.kana_amount - 1;
        }
        amountOfTurns = 0;
        amountOfWords = realLimit;
        limit = amountOfWords;
        amountOfMistakes = 0;
        amountOfCorrects = 0;


    }


    public static void HiraganaLetters() {
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
        hiraganaLetters.add("が");
        hiraganaLetters.add("ぎ");
        hiraganaLetters.add("ぐ");
        hiraganaLetters.add("げ");
        hiraganaLetters.add("ご");
        hiraganaLetters.add("ざ");
        hiraganaLetters.add("じ");
        hiraganaLetters.add("ず");
        hiraganaLetters.add("ぜ");
        hiraganaLetters.add("ぞ");
        hiraganaLetters.add("だ");
        hiraganaLetters.add("ぢ");
        hiraganaLetters.add("づ");
        hiraganaLetters.add("で");
        hiraganaLetters.add("ど");
        hiraganaLetters.add("ば");
        hiraganaLetters.add("び");
        hiraganaLetters.add("ぶ");
        hiraganaLetters.add("べ");
        hiraganaLetters.add("ぼ");
        hiraganaLetters.add("ぱ");
        hiraganaLetters.add("ぴ");
        hiraganaLetters.add("ぷ");
        hiraganaLetters.add("ぺ");
        hiraganaLetters.add("ぽ");

    }
    public static void KatakanaLetters() {
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
        katakanaLetters.add("ガ");
        katakanaLetters.add("ギ");
        katakanaLetters.add("グ");
        katakanaLetters.add("ゲ");
        katakanaLetters.add("ゴ");
        katakanaLetters.add("ザ");
        katakanaLetters.add("ジ");
        katakanaLetters.add("ズ");
        katakanaLetters.add("ゼ");
        katakanaLetters.add("ゾ");
        katakanaLetters.add("ダ");
        katakanaLetters.add("ジ");
        katakanaLetters.add("ズ");
        katakanaLetters.add("デ");
        katakanaLetters.add("ド");
        katakanaLetters.add("バ");
        katakanaLetters.add("ビ");
        katakanaLetters.add("ブ");
        katakanaLetters.add("ベ");
        katakanaLetters.add("ボ");
        katakanaLetters.add("パ");
        katakanaLetters.add("ピ");
        katakanaLetters.add("プ");
        katakanaLetters.add("ペ");
        katakanaLetters.add("ポ");

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
        romajiLetters.add("ga");
        romajiLetters.add("gi");
        romajiLetters.add("gu");
        romajiLetters.add("ge");
        romajiLetters.add("go");
        romajiLetters.add("za");
        romajiLetters.add("ji");
        romajiLetters.add("zu");
        romajiLetters.add("ze");
        romajiLetters.add("zo");
        romajiLetters.add("da");
        romajiLetters.add("ji");
        romajiLetters.add("zu");
        romajiLetters.add("de");
        romajiLetters.add("do");
        romajiLetters.add("ba");
        romajiLetters.add("bi");
        romajiLetters.add("bu");
        romajiLetters.add("be");
        romajiLetters.add("bo");
        romajiLetters.add("pa");
        romajiLetters.add("pi");
        romajiLetters.add("pu");
        romajiLetters.add("pe");
        romajiLetters.add("po");
    }



    public void results2() {
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
        findViewById(R.id.return_to_menu).setOnClickListener(new View.OnClickListener() {
            public void onClick(View vieww) {
                startActivity(new Intent(kanaLetterActivity.this,MainActivity.class));
                finish();
            }
        });
        findViewById(R.id.restart_game).setOnClickListener(new View.OnClickListener() {
            public void onClick(View vieww) {
                startActivity(new Intent(kanaLetterActivity.this,kanaLetterActivity.class));
                finish();
            }
        });

    }


    public void ButtonAndTextHandling() {

        amountOfTurns += 1;
        hiraganaLetters.clear();
        katakanaLetters.clear();
        currentKana.clear();
        currentRomaji.clear();
        romajiLetters.clear();
        HiraganaLetters();
        KatakanaLetters();
        RomajiLetters();
        if (selectKanaActivity.kanaToRemove.size() > 0) {

            for (int i = 0; i < selectKanaActivity.kanaToRemove.size(); i++) {
                hiraganaLetters.set(selectKanaActivity.kanaToRemove.get(i), "Junk");
                katakanaLetters.set(selectKanaActivity.kanaToRemove.get(i), "Junk");
                romajiLetters.set(selectKanaActivity.kanaToRemove.get(i), "Junk");
            }
            for (int i = 0; i < selectKanaActivity.kanaToRemove.size(); i++) {
                hiraganaLetters.remove("Junk");
                katakanaLetters.remove("Junk");
                romajiLetters.remove("Junk");
            }
        }
        amountOfWords = hiraganaLetters.size();
        Button button1 = (Button) findViewById(R.id.answer_buton_1);
        Button button2 = (Button) findViewById(R.id.answer_buton_2);
        Button button3 = (Button) findViewById(R.id.answer_buton_3);
        Button button4 = (Button) findViewById(R.id.answer_buton_4);
        TextView romajiText = (TextView) findViewById(R.id.romaji_text_view);
        //Change kana on the words and randomize the place of the array it will pick from
        // and then remove that place so that the next button wont accidentally get the same
        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        if (hir) {
            button1.setText(hiraganaLetters.get(count));
        } else if (kat) {
            button1.setText(katakanaLetters.get(count));
        }
        romajiLetters.remove(count);
        hiraganaLetters.remove(count);
        katakanaLetters.remove(count);
        amountOfWords -= 1;

        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        if (hir) {
            button2.setText(hiraganaLetters.get(count));
        } else if (kat) {
            button2.setText(katakanaLetters.get(count));
        }
        romajiLetters.remove(count);
        hiraganaLetters.remove(count);
        katakanaLetters.remove(count);
        amountOfWords -= 1;

        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        if (hir) {
            button3.setText(hiraganaLetters.get(count));
        } else if (kat) {
            button3.setText(katakanaLetters.get(count));
        }
        romajiLetters.remove(count);
        hiraganaLetters.remove(count);
        katakanaLetters.remove(count);
        amountOfWords -= 1;

        count = rand.nextInt(amountOfWords);
        currentRomaji.add(romajiLetters.get(count));
        if (hir) {
            button4.setText(hiraganaLetters.get(count));
        } else if (kat) {
            button4.setText(katakanaLetters.get(count));
        }

        final int count2 = rand.nextInt(4);
        romajiText.setText(currentRomaji.get(count2));
        if (amountOfTurns > limit) {
            setContentView(R.layout.result_layout);
            results2();
        } else {
            button1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View V) {
                    if (count2 == 0) {
                        ButtonAndTextHandling();
                        amountOfCorrects++;
                    } else {
                        amountOfCorrects--;
                        amountOfMistakes++;
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View V) {
                    if (count2 == 1) {
                        ButtonAndTextHandling();
                        amountOfCorrects++;
                    } else {
                        amountOfCorrects--;
                        amountOfMistakes++;
                    }
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View V) {
                    if (count2 == 2) {
                        ButtonAndTextHandling();
                        amountOfCorrects++;
                    } else {
                       amountOfCorrects--;
                       amountOfMistakes++;
                    }
                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View V) {
                    if (count2 == 3) {
                        ButtonAndTextHandling();
                       amountOfCorrects++;
                    } else {
                       amountOfCorrects--;
                       amountOfMistakes++;
                    }
                }
            });
        }

    }
}
