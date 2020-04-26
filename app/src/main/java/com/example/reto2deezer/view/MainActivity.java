package com.example.reto2deezer.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.reto2deezer.R;
import com.example.reto2deezer.control.MainController;
import com.example.reto2deezer.model.Playlist;
import com.example.reto2deezer.model.User;

public class MainActivity extends AppCompatActivity {

    private EditText searchPlaylist;
    private ImageButton searchImage;
    private ListView listPlaylist;
    private PlaylistAdapter adapter;
    private MainController controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchPlaylist = findViewById(R.id.searchPlaylist);
        searchImage = findViewById(R.id.searchImage);
        listPlaylist = findViewById(R.id.listPlaylist);
        adapter = new PlaylistAdapter(this);
        listPlaylist.setAdapter(adapter);


        controller = new MainController(this);


    }

    public EditText getSearchPlaylist() {
        return searchPlaylist;
    }

    public ImageButton getSearchImage() {
        return searchImage;
    }

    public ListView getListPlaylist() {
        return listPlaylist;
    }

    public PlaylistAdapter getAdapter() {
        return adapter;
    }
}
