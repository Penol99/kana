package com.example.administratr.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int count = 0;

    String[] hiraganaWords = {"ひらがな","にく","おはよ"};
    String[] hiraganaAnswers = {"hiragana","niku","ohayo"};

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
        final EditText hiraganaTextInput = (EditText) findViewById(R.id.hiragana_text_input);
        final TextView hiraganaText = (TextView) findViewById(R.id.hiragana_text);
        hiraganaText.setText(hiraganaWords[count]);
        // Check if the input of the EditText is the same as the hiragana from the TextView
        findViewById(R.id.hiragana_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String hiragana = hiraganaTextInput.getText().toString();
                if (hiragana.equals(hiraganaAnswers[count])) {
                    count += 1;
                    hiraganaTextInput.setText("");
                    hiraganaText.setText(hiraganaWords[count]);
                }
            }
        });
    }

}
