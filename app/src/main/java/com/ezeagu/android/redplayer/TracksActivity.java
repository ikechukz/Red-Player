package com.ezeagu.android.redplayer;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        ConstraintLayout mainActivity = (ConstraintLayout) findViewById(R.id.constraint_layout);
        mainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TracksActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Antidote", "Travis Scott", "4:16", R.drawable.noart));
        songs.add(new Music("Hypnotized", "Coldplay", "5:55", R.drawable.noart));
        songs.add(new Music("Patiently Waiting", "50 cent ft Eminem", "3:46", R.drawable.noart));
        songs.add(new Music("Guwop Home", "Gucci Mane ft Young Thug", "3:50", R.drawable.guwophomesmall));
        songs.add(new Music("Back On", "Gucci Mane", "2:33", R.drawable.noart));
        songs.add(new Music("Gyrate", "Tony One Week", "22:06", R.drawable.noart));
        songs.add(new Music("Hypnotized", "Coldplay", "5:55", R.drawable.noart));
        songs.add(new Music("Lose", "Travis Scott", "3:20", R.drawable.noart));
        songs.add(new Music("Yes Indeed", "Young Thug", "4:12", R.drawable.noart));
        songs.add(new Music("Malibu", "Miley Cyrus", "3:51", R.drawable.noart));
        songs.add(new Music("Migo Pablo", "Migos", "2:11", R.drawable.noart));
        songs.add(new Music("Ugo ga adi", "Umuobiligbo", "59:21", R.drawable.noart));
        songs.add(new Music("Adventure Of A Lifetime", "Coldplay", "4:12", R.drawable.noart));

        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
