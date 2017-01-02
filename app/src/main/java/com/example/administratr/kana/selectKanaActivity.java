package com.example.administratr.kana;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class selectKanaActivity extends AppCompatActivity {

    static ArrayList<CheckBox> kanaCheckBoxes = new ArrayList<CheckBox>();
    static ArrayList<Boolean> kanaCheckBoolean = new ArrayList<Boolean>();
    static ArrayList<Integer> kanaToRemove = new ArrayList<Integer>();
    boolean checkAll = true;
    boolean save;
    boolean load;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_kana_layout);
        // Clears array so that it can add new additions to it without stacking up
        kanaCheckBoxes.clear();
        kanaToRemove.clear();
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
        if (kanaToRemove.size() == 0) {
            kanaToRemove.clear();
            for (int i = 0; i < 46; i++) {
                if (!kanaCheckBoxes.get(i).isChecked()) {
                    kanaToRemove.add(i);
                }
            }
        }

            startActivity(new Intent(selectKanaActivity.this, kanaLetterActivity.class));
            finish();
    }
    public void selectAllButton(View view) {
        if (checkAll) {
            checkAll = false;
        } else if (checkAll == false) {
            checkAll = true;
        }
        HandleChecking();
    }
    public void preset1Click(View view) {
        CheckBox preset2 = (CheckBox) findViewById(R.id.preset2);
        CheckBox preset3 = (CheckBox) findViewById(R.id.preset3);

        preset2.setChecked(false);
        preset3.setChecked(false);
    }
    public void preset2Click(View view) {
        CheckBox preset1 = (CheckBox) findViewById(R.id.preset1);
        CheckBox preset3 = (CheckBox) findViewById(R.id.preset3);

        preset1.setChecked(false);
        preset3.setChecked(false);
    }
    public void preset3Click(View view) {
        CheckBox preset1 = (CheckBox) findViewById(R.id.preset1);
        CheckBox preset2 = (CheckBox) findViewById(R.id.preset2);

        preset1.setChecked(false);
        preset2.setChecked(false);
    }



    public void saveButton(View view) {
        save = true;
        load = false;
        saveAndLoad();
    }
    public void loadButton(View view) {
        load = true;
        save = false;
        saveAndLoad();
    }


    public void saveAndLoad() {
        kanaToRemove.clear();
        CheckBox preset1 = (CheckBox) findViewById(R.id.preset1);
        CheckBox preset2 = (CheckBox) findViewById(R.id.preset2);
        CheckBox preset3 = (CheckBox) findViewById(R.id.preset3);
        String filename1 = "preset1";
        String filename2 = "preset2";
        String filename3 = "preset3";

        if (save) {
            if (preset1.isChecked()) {

                FileOutputStream fos;
                deleteFile(filename1);
                try {
                    kanaCheckBoolean.clear();
                    for (int i = 0; i < 46; i++) {
                        if (kanaCheckBoxes.get(i).isChecked()) {
                            kanaCheckBoolean.add(true);
                        } else {
                            kanaCheckBoolean.add(false);
                        }
                    }
                    fos = openFileOutput(filename1, Context.MODE_PRIVATE);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(kanaCheckBoolean);
                    fos.close();
                    oos.close();

                } catch(Exception ex) {
                    ex.printStackTrace();
                }

            } else if (preset2.isChecked()) {

                FileOutputStream fos;
                deleteFile(filename2);
                try {
                    kanaCheckBoolean.clear();
                    for (int i = 0; i < 46; i++) {
                        if (kanaCheckBoxes.get(i).isChecked()) {
                            kanaCheckBoolean.add(true);
                        } else {
                            kanaCheckBoolean.add(false);
                        }
                    }
                    fos = openFileOutput(filename2, Context.MODE_PRIVATE);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(kanaCheckBoolean);
                    fos.close();
                    oos.close();

                } catch(Exception ex) {
                    ex.printStackTrace();
                }


            } else if (preset3.isChecked()) {

                FileOutputStream fos;
                deleteFile(filename3);
                try {
                    kanaCheckBoolean.clear();
                    for (int i = 0; i < 46; i++) {
                        if (kanaCheckBoxes.get(i).isChecked()) {
                            kanaCheckBoolean.add(true);
                        } else {
                            kanaCheckBoolean.add(false);
                        }
                    }
                    fos = openFileOutput(filename3, Context.MODE_PRIVATE);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(kanaCheckBoolean);
                    fos.close();
                    oos.close();

                } catch(Exception ex) {
                    ex.printStackTrace();
                }


            }
        } else if (load) {
            if (preset1.isChecked()) {

                FileInputStream fis;
                try {
                    fis = openFileInput(filename1);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    kanaCheckBoolean = (ArrayList<Boolean>)  ois.readObject();
                    for (int i = 0; i < 46; i++) {
                        kanaCheckBoxes.get(i).setChecked(kanaCheckBoolean.get(i).booleanValue());

                    }
                    fis.close();
                    ois.close();

                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else if (preset2.isChecked()) {
                FileInputStream fis;
                try {
                    fis = openFileInput(filename2);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    kanaCheckBoolean = (ArrayList<Boolean>)  ois.readObject();
                    for (int i = 0; i < 46; i++) {
                        kanaCheckBoxes.get(i).setChecked(kanaCheckBoolean.get(i).booleanValue());

                    }
                    fis.close();
                    ois.close();

                } catch(Exception ex) {
                    ex.printStackTrace();
                }

            } else if (preset3.isChecked()) {
                FileInputStream fis;
                try {
                    fis = openFileInput(filename3);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    kanaCheckBoolean = (ArrayList<Boolean>)  ois.readObject();
                    for (int i = 0; i < 46; i++) {
                        kanaCheckBoxes.get(i).setChecked(kanaCheckBoolean.get(i).booleanValue());

                    }
                    fis.close();
                    ois.close();

                } catch(Exception ex) {
                    ex.printStackTrace();
                }

            }
        }
    }
}
