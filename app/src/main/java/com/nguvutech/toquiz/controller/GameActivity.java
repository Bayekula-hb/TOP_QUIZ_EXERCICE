package com.nguvutech.toquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.nguvutech.toquiz.R;

public class GameActivity extends AppCompatActivity {

    private TextView mTextViewGame;
    private Button mButtonGame1;
    private Button mButtonGame2;
    private Button mButtonGame3;
    private Button mButtonGame4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mTextViewGame = findViewById(R.id.game_activity_textview_question);
        mButtonGame1 = findViewById(R.id.game_activity_button_answers1);
        mButtonGame2 = findViewById(R.id.game_activity_button_answers2);
        mButtonGame3 = findViewById(R.id.game_activity_button_answers3);
        mButtonGame4 = findViewById(R.id.game_activity_button_answers4);


    }
}