package com.solarisintel.bottommenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenerOnButton();

    }

    ImageButton BottomMenuButton1;
    ImageButton BottomMenuButton2;
    ImageButton BottomMenuButton3;
    ImageButton BottomMenuButton4;
    ImageButton BottomMenuButton5;

    public boolean isPlaying = false;

    // 最下行ボタンのリスナー登録
    public void addListenerOnButton() {

        BottomMenuButton4 = (ImageButton) findViewById(R.id.BottomMenuButton4);
        BottomMenuButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this,
                        "push", Toast.LENGTH_SHORT).show();
                if (isPlaying == true) {
                    isPlaying = false;
                    BottomMenuButton4.setBackgroundResource(R.drawable.btn_music_play);
                } else {
                    isPlaying = true;
                    BottomMenuButton4.setBackgroundResource(R.drawable.btn_music_pause);
                }

            }
        });
    }
}