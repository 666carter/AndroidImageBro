package com.example.cs349.a3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Toolbar toolbar;
    //private RatingBar ratingMenuBar;
    List<Pic> picList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(picList == null) {
            picList = new ArrayList<>();
        }

        System.out.println(getResources().getConfiguration().orientation);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            layoutManager = new GridLayoutManager(this,1);
        } else {
            layoutManager = new GridLayoutManager(this,2);
        }

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //ratingMenuBar = findViewById(R.id.ratingMenuBar);

        //set the recyclerview
        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        mAdapter = new MyAdapter(this, picList);
        //assign the adapter and layoutmanager to this recycleView
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id ==  R.id.load){
            if(picList != null){
                picList.clear();
            }

            //add all ten image into the array
            picList.add(new Pic("0", 0));
            picList.add(new Pic("0", 1));
            picList.add(new Pic("0", 2));
            picList.add(new Pic("0", 3));
            picList.add(new Pic("0", 4));
            picList.add(new Pic("0", 5));
            picList.add(new Pic("0", 6));
            picList.add(new Pic("0", 7));
            picList.add(new Pic("0", 8));
            picList.add(new Pic("0", 9));

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                layoutManager = new GridLayoutManager(this,1);
            } else {
                layoutManager = new GridLayoutManager(this,2);
            }

            //assign the adapter and layoutmanager to this recycleView
            //ratingMenuBar.setRating(Float.parseFloat("0"));
            mAdapter = new MyAdapter(this, picList);
            recyclerView.setAdapter(mAdapter);
            recyclerView.setLayoutManager(layoutManager);
        }else if(id == R.id.clear){
            if(picList != null){
                picList.clear();

                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                    layoutManager = new GridLayoutManager(this,1);
                } else {
                    layoutManager = new GridLayoutManager(this,2);
                }

                //assign the adapter and layoutmanager to this recycleView
                //ratingMenuBar.setRating(Float.parseFloat("0"));
                mAdapter = new MyAdapter(this, picList);
                recyclerView.setAdapter(mAdapter);
                recyclerView.setLayoutManager(layoutManager);
            }
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //System.out.println("Here");
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
           // System.out.println("A");
            layoutManager = new GridLayoutManager(this,2);
            recyclerView.setLayoutManager(layoutManager);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            layoutManager = new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
        }
    }

}
