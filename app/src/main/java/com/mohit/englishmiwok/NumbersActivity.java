package com.mohit.englishmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "Lutti", R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Two", "Otiiko", R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Three", "Tolookosu", R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Four", "Oyyisa", R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Five", "Massokka", R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Six", "Temmoka", R.drawable.number_six,R.raw.number_six));
        words.add(new Word("Seven", "Kenekaku", R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("Eight", "Kawinta", R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("Nine", "Wo'e", R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("Ten", "Na'accha", R.drawable.number_ten,R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Word word=words.get(position);
                mMediaPlayer =MediaPlayer.create(NumbersActivity.this,word.getmAudioResourceId());
                mMediaPlayer.start();
            }


        });

    }
}
