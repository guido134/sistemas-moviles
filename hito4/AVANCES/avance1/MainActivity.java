package com.jhelsoncarrillo.reciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jhelsoncarrillo.reciclerview.Adapter.RVAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURL = new ArrayList<>();

    private final String imgURL = "VlGGqmG,DWX6eGn,EpmxiT3,V9Pcw5j,HkEJ5K4,DaXpXsG,0IRvKpq,XUZw40U,mjR9oaO";
    private final String imgNam = "Whastapp,Twitter,Youtube,Snapchat,Instagram,Google+,Pinterest,LinkedIN,Facebook";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitMaps();
        initRecyclerView();
    }

    public void initImageBitMaps()
    {
        imagesURL.addAll(Arrays.asList(imgURL.split(",")));
        imagesName.addAll(Arrays.asList(imgNam.split(",")));

    }

    public void initRecyclerView()
    {
        recyclerView = findViewById(R.id.rvContainer);
        rvAdapter = new RVAdapter(this, imagesName, imagesURL);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void StopPlaying() {
        for(int i = 0; i < rvAdapter.players.size(); i++) {
            //adapter.players.get(i)._clickPause();
            rvAdapter.players.get(i)._clickStop();
        }
    }
}
