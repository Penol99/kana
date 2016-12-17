package com.example.administratr.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

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

    }

    public void hiraganaButtonClick(View view)  {
        if (toggleWordLetterSwitch()== false) {
            startActivity(new Intent(MainActivity.this, kanaActivity.class));
            kanaActivity.hir = true;
            kanaActivity.kat = false;
        }

    }

    public void katakanaButtonClick(View view) {
        if (toggleWordLetterSwitch() == false) {
            startActivity(new Intent(MainActivity.this, kanaActivity.class));
            kanaActivity.hir = false;
            kanaActivity.kat = true;
        }
    }

}
