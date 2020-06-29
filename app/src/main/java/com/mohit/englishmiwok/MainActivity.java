package com.mohit.englishmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  
        final TextView members = (TextView) findViewById(R.id.family);

        members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent membersintent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(membersintent);
            }
        });

        final TextView numbers = (TextView) findViewById(R.id.numbers);


        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent numbersintent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersintent);
            }
        });

        final TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent colorsintent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsintent);
            }
        });

        final TextView phrases = (TextView) findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent phrasesintent = new Intent(MainActivity.this, CommomPhrasesActivity.class);
                startActivity(phrasesintent);
            }
        });


    }
}
