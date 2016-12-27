package com.example.administratr.kana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class selectKanaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_kana_layout);
        setKana();
    }


    public void continueButton(View v) {
        startActivity(new Intent(selectKanaActivity.this, kanaLetterActivity.class));
        finish();
    }


    public void setKana() {
        kanaLetterActivity.HiraganaLetters();
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        CheckBox checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        CheckBox checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        CheckBox checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        CheckBox checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        CheckBox checkBox13 = (CheckBox) findViewById(R.id.checkBox13);
        CheckBox checkBox14 = (CheckBox) findViewById(R.id.checkBox14);
        CheckBox checkBox15 = (CheckBox) findViewById(R.id.checkBox15);
        CheckBox checkBox16 = (CheckBox) findViewById(R.id.checkBox16);
        CheckBox checkBox17 = (CheckBox) findViewById(R.id.checkBox17);
        CheckBox checkBox18 = (CheckBox) findViewById(R.id.checkBox18);
        CheckBox checkBox19 = (CheckBox) findViewById(R.id.checkBox19);
        CheckBox checkBox20 = (CheckBox) findViewById(R.id.checkBox20);
        CheckBox checkBox21 = (CheckBox) findViewById(R.id.checkBox21);
        CheckBox checkBox22 = (CheckBox) findViewById(R.id.checkBox22);
        CheckBox checkBox23 = (CheckBox) findViewById(R.id.checkBox23);
        CheckBox checkBox24 = (CheckBox) findViewById(R.id.checkBox24);
        CheckBox checkBox25 = (CheckBox) findViewById(R.id.checkBox25);
        CheckBox checkBox26 = (CheckBox) findViewById(R.id.checkBox26);
        CheckBox checkBox27 = (CheckBox) findViewById(R.id.checkBox27);
        CheckBox checkBox28 = (CheckBox) findViewById(R.id.checkBox28);
        CheckBox checkBox29 = (CheckBox) findViewById(R.id.checkBox29);
        CheckBox checkBox30 = (CheckBox) findViewById(R.id.checkBox30);
        CheckBox checkBox31 = (CheckBox) findViewById(R.id.checkBox31);
        CheckBox checkBox32 = (CheckBox) findViewById(R.id.checkBox32);
        CheckBox checkBox33 = (CheckBox) findViewById(R.id.checkBox33);
        CheckBox checkBox34 = (CheckBox) findViewById(R.id.checkBox34);
        CheckBox checkBox35 = (CheckBox) findViewById(R.id.checkBox35);
        CheckBox checkBox36 = (CheckBox) findViewById(R.id.checkBox36);
        CheckBox checkBox37 = (CheckBox) findViewById(R.id.checkBox37);
        CheckBox checkBox38 = (CheckBox) findViewById(R.id.checkBox38);
        CheckBox checkBox39 = (CheckBox) findViewById(R.id.checkBox39);
        CheckBox checkBox40 = (CheckBox) findViewById(R.id.checkBox40);
        CheckBox checkBox41 = (CheckBox) findViewById(R.id.checkBox41);
        CheckBox checkBox42 = (CheckBox) findViewById(R.id.checkBox42);
        CheckBox checkBox43 = (CheckBox) findViewById(R.id.checkBox43);
        CheckBox checkBox44 = (CheckBox) findViewById(R.id.checkBox44);
        CheckBox checkBox45 = (CheckBox) findViewById(R.id.checkBox45);
        CheckBox checkBox46 = (CheckBox) findViewById(R.id.checkBox46);


        if (kanaLetterActivity.hir = true) {
            checkBox1.setText(kanaLetterActivity.hiraganaLetters.get(0));
            checkBox2.setText(kanaLetterActivity.hiraganaLetters.get(1));
            checkBox3.setText(kanaLetterActivity.hiraganaLetters.get(2));
            checkBox4.setText(kanaLetterActivity.hiraganaLetters.get(3));
            checkBox5.setText(kanaLetterActivity.hiraganaLetters.get(4));
            checkBox6.setText(kanaLetterActivity.hiraganaLetters.get(5));
            checkBox7.setText(kanaLetterActivity.hiraganaLetters.get(6));
            checkBox8.setText(kanaLetterActivity.hiraganaLetters.get(7));
            checkBox9.setText(kanaLetterActivity.hiraganaLetters.get(8));

            checkBox10.setText(kanaLetterActivity.hiraganaLetters.get(9));
            checkBox11.setText(kanaLetterActivity.hiraganaLetters.get(10));
            checkBox12.setText(kanaLetterActivity.hiraganaLetters.get(11));
            checkBox13.setText(kanaLetterActivity.hiraganaLetters.get(12));
            checkBox14.setText(kanaLetterActivity.hiraganaLetters.get(13));
            checkBox15.setText(kanaLetterActivity.hiraganaLetters.get(14));
            checkBox16.setText(kanaLetterActivity.hiraganaLetters.get(15));
            checkBox17.setText(kanaLetterActivity.hiraganaLetters.get(16));
            checkBox18.setText(kanaLetterActivity.hiraganaLetters.get(17));
            checkBox19.setText(kanaLetterActivity.hiraganaLetters.get(18));

            checkBox20.setText(kanaLetterActivity.hiraganaLetters.get(19));
            checkBox21.setText(kanaLetterActivity.hiraganaLetters.get(20));
            checkBox22.setText(kanaLetterActivity.hiraganaLetters.get(21));
            checkBox23.setText(kanaLetterActivity.hiraganaLetters.get(22));
            checkBox24.setText(kanaLetterActivity.hiraganaLetters.get(23));
            checkBox25.setText(kanaLetterActivity.hiraganaLetters.get(24));
            checkBox26.setText(kanaLetterActivity.hiraganaLetters.get(25));
            checkBox27.setText(kanaLetterActivity.hiraganaLetters.get(26));
            checkBox28.setText(kanaLetterActivity.hiraganaLetters.get(27));
            checkBox29.setText(kanaLetterActivity.hiraganaLetters.get(28));

            checkBox30.setText(kanaLetterActivity.hiraganaLetters.get(29));
            checkBox31.setText(kanaLetterActivity.hiraganaLetters.get(30));
            checkBox32.setText(kanaLetterActivity.hiraganaLetters.get(31));
            checkBox33.setText(kanaLetterActivity.hiraganaLetters.get(32));
            checkBox34.setText(kanaLetterActivity.hiraganaLetters.get(33));
            checkBox35.setText(kanaLetterActivity.hiraganaLetters.get(34));
            checkBox36.setText(kanaLetterActivity.hiraganaLetters.get(35));
            checkBox37.setText(kanaLetterActivity.hiraganaLetters.get(36));
            checkBox38.setText(kanaLetterActivity.hiraganaLetters.get(37));
            checkBox39.setText(kanaLetterActivity.hiraganaLetters.get(38));

            checkBox40.setText(kanaLetterActivity.hiraganaLetters.get(39));
            checkBox41.setText(kanaLetterActivity.hiraganaLetters.get(40));
            checkBox42.setText(kanaLetterActivity.hiraganaLetters.get(41));
            checkBox43.setText(kanaLetterActivity.hiraganaLetters.get(42));
            checkBox44.setText(kanaLetterActivity.hiraganaLetters.get(43));
            checkBox45.setText(kanaLetterActivity.hiraganaLetters.get(44));
            checkBox46.setText(kanaLetterActivity.hiraganaLetters.get(45));
        } else {
            checkBox1.setText(kanaLetterActivity.hiraganaLetters.get(0));
            checkBox2.setText(kanaLetterActivity.hiraganaLetters.get(1));
            checkBox3.setText(kanaLetterActivity.hiraganaLetters.get(2));
            checkBox4.setText(kanaLetterActivity.hiraganaLetters.get(3));
            checkBox5.setText(kanaLetterActivity.hiraganaLetters.get(4));
            checkBox6.setText(kanaLetterActivity.hiraganaLetters.get(5));
            checkBox7.setText(kanaLetterActivity.hiraganaLetters.get(6));
            checkBox8.setText(kanaLetterActivity.hiraganaLetters.get(7));
            checkBox9.setText(kanaLetterActivity.hiraganaLetters.get(8));

            checkBox10.setText(kanaLetterActivity.hiraganaLetters.get(9));
            checkBox11.setText(kanaLetterActivity.hiraganaLetters.get(10));
            checkBox12.setText(kanaLetterActivity.hiraganaLetters.get(11));
            checkBox13.setText(kanaLetterActivity.hiraganaLetters.get(12));
            checkBox14.setText(kanaLetterActivity.hiraganaLetters.get(13));
            checkBox15.setText(kanaLetterActivity.hiraganaLetters.get(14));
            checkBox16.setText(kanaLetterActivity.hiraganaLetters.get(15));
            checkBox17.setText(kanaLetterActivity.hiraganaLetters.get(16));
            checkBox18.setText(kanaLetterActivity.hiraganaLetters.get(17));
            checkBox19.setText(kanaLetterActivity.hiraganaLetters.get(18));

            checkBox20.setText(kanaLetterActivity.hiraganaLetters.get(19));
            checkBox21.setText(kanaLetterActivity.hiraganaLetters.get(20));
            checkBox22.setText(kanaLetterActivity.hiraganaLetters.get(21));
            checkBox23.setText(kanaLetterActivity.hiraganaLetters.get(22));
            checkBox24.setText(kanaLetterActivity.hiraganaLetters.get(23));
            checkBox25.setText(kanaLetterActivity.hiraganaLetters.get(24));
            checkBox26.setText(kanaLetterActivity.hiraganaLetters.get(25));
            checkBox27.setText(kanaLetterActivity.hiraganaLetters.get(26));
            checkBox28.setText(kanaLetterActivity.hiraganaLetters.get(27));
            checkBox29.setText(kanaLetterActivity.hiraganaLetters.get(28));

            checkBox30.setText(kanaLetterActivity.hiraganaLetters.get(29));
            checkBox31.setText(kanaLetterActivity.hiraganaLetters.get(30));
            checkBox32.setText(kanaLetterActivity.hiraganaLetters.get(31));
            checkBox33.setText(kanaLetterActivity.hiraganaLetters.get(32));
            checkBox34.setText(kanaLetterActivity.hiraganaLetters.get(33));
            checkBox35.setText(kanaLetterActivity.hiraganaLetters.get(34));
            checkBox36.setText(kanaLetterActivity.hiraganaLetters.get(35));
            checkBox37.setText(kanaLetterActivity.hiraganaLetters.get(36));
            checkBox38.setText(kanaLetterActivity.hiraganaLetters.get(37));
            checkBox39.setText(kanaLetterActivity.hiraganaLetters.get(38));

            checkBox40.setText(kanaLetterActivity.hiraganaLetters.get(39));
            checkBox41.setText(kanaLetterActivity.hiraganaLetters.get(40));
            checkBox42.setText(kanaLetterActivity.hiraganaLetters.get(41));
            checkBox43.setText(kanaLetterActivity.hiraganaLetters.get(42));
            checkBox44.setText(kanaLetterActivity.hiraganaLetters.get(43));
            checkBox45.setText(kanaLetterActivity.hiraganaLetters.get(44));
            checkBox46.setText(kanaLetterActivity.hiraganaLetters.get(45));
        }
    }

}
