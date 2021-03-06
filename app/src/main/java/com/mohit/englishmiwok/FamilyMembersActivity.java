package com.mohit.englishmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","әpә",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("Mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("Son","Angsi",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("Daughter","Tune",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("Older Brother","Taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("Younger Brother","Chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("Older Sister","Teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("Younger Sister","Kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("Grandmother","Ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("Grandfather","Paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Word word=words.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyMembersActivity.this,word.getmAudioResourceId());
                mMediaPlayer.start();
            }


        });

    }
}

