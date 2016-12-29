package com.example.administratr.kana;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class selectKanaActivity extends AppCompatActivity {

    static ArrayList<CheckBox> kanaCheckBoxes = new ArrayList<CheckBox>();
    static ArrayList<Integer> kanaToUse = new ArrayList<Integer>();
    boolean checkAll = true;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_kana_layout);
        // Clears array so that it can add new additions to it without stacking up
        kanaCheckBoxes.clear();
        CheckBoxArray();
        AddKanaToCheckBoxes();
    }

    // Add all the checkboxes into an array
    public void CheckBoxArray(){
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox1));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox2));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox3));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox4));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox5));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox6));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox7));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox8));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox9));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox10));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox11));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox12));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox13));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox14));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox15));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox16));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox17));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox18));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox19));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox20));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox21));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox22));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox23));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox24));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox25));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox26));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox27));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox28));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox29));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox30));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox31));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox32));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox33));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox34));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox35));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox36));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox37));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox38));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox39));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox40));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox41));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox42));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox43));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox44));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox45));
        kanaCheckBoxes.add((CheckBox) findViewById(R.id.checkBox46));
    }
    // Add kana to the checkboxes
    public void AddKanaToCheckBoxes() {
        kanaLetterActivity.hiraganaLetters.clear();
        kanaLetterActivity.katakanaLetters.clear();
        kanaLetterActivity.HiraganaLetters();
        kanaLetterActivity.KatakanaLetters();
        if (kanaLetterActivity.hir) {
            for (int i=0;i<46;i++) {
                kanaCheckBoxes.get(i).setText(kanaLetterActivity.hiraganaLetters.get(i));
            }
        } else {
            for (int i=0;i<46;i++) {
                kanaCheckBoxes.get(i).setText(kanaLetterActivity.katakanaLetters.get(i));
            }
        }
        HandleChecking();
    }
    private void HandleChecking() {
        for (int i = 0; i < 46; i++) {
            kanaCheckBoxes.get(i).setChecked(checkAll);
        }
    }
    public void continueButton(View view) {
        for(int i=0;i<46;i++) {
            if (!kanaCheckBoxes.get(i).isChecked()) {
                kanaToUse.add(i);
            }
        }
        if (kanaToUse.size() < 3) {
            checkAll = true;
            HandleChecking();
        } else {
            startActivity(new Intent(selectKanaActivity.this, kanaLetterActivity.class));
            finish();
        }
    }
    public void selectAllButton(View view) {
        if (checkAll) {
            checkAll = false;
        } else if (checkAll == false) {
            checkAll = true;
        }
        HandleChecking();
    }
}
