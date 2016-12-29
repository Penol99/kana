package com.example.administratr.kana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public boolean toggleWordLetterSwitch() {
        Switch wordToggle = (Switch) findViewById(R.id.toggle);
        boolean switchState = wordToggle.isChecked();

        return switchState;
    }
    //Button presses
    public void kanjiButtonClick(View view)  {
        ArrayList<Button> kanjis = new ArrayList<Button>();
        kanjis.add((Button) findViewById(R.id.kanji_button));
        String[] my_string = getResources().getStringArray(R.array.check_boxes);
        kanjis.get(0).setText(my_string[0]);


    }

    public void hiraganaButtonClick(View view)  {
        if (toggleWordLetterSwitch()== false) {
            startActivity(new Intent(MainActivity.this, kanaActivity.class));
            kanaActivity.hir = true;
            kanaActivity.kat = false;
        } else {
            startActivity(new Intent(MainActivity.this, selectKanaActivity.class));
            kanaLetterActivity.hir = true;
            kanaLetterActivity.kat = false;
        }

    }

    public void katakanaButtonClick(View view) {
        if (toggleWordLetterSwitch() == false) {
            startActivity(new Intent(MainActivity.this, kanaActivity.class));
            kanaActivity.hir = false;
            kanaActivity.kat = true;
        } else {
            startActivity(new Intent(MainActivity.this, selectKanaActivity.class));
            kanaLetterActivity.hir = false;
            kanaLetterActivity.kat = true;
        }
    }

}
