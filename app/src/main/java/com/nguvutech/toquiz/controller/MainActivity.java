package com.nguvutech.toquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nguvutech.toquiz.R;
import com.nguvutech.toquiz.model.User;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewHome;
    private EditText mEditTextHome;
    private Button mButtonHome;

    User mNameUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewHome = findViewById(R.id.m_textview_question);
        mEditTextHome = findViewById(R.id.m_edittext_name);
        mButtonHome  = findViewById(R.id.m_button_submit);

        mButtonHome.setEnabled(false);

        mEditTextHome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mButtonHome.setEnabled(!editable.toString().isEmpty());
            }
        });

        mButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivityIntent);
                mNameUser.setFirstName(mEditTextHome.getText().toString());

            }
        });

    }

}