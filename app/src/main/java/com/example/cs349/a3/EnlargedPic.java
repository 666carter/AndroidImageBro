package com.example.cs349.a3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EnlargedPic extends AppCompatActivity {

    //private TextView rateOfImg;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enlarged_each_pic);

        //rateOfImg = (TextView) findViewById(R.id.eachrate);
        img = (ImageView) findViewById(R.id.enlargedpic);

        // Recieve data
        Intent intent = getIntent();
        String Rate = intent.getExtras().getString("Rate");
        int num = intent.getExtras().getInt("Thumbnail");

        // Setting values
        //rateOfImg.setText(Rate);

        if(num == 0){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/bunny.jpg");
        }
        if(num == 1){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/chinchilla.jpg");
        }
        if(num == 2){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/doggo.jpg");
        }
        if(num == 3){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/fox.jpg");
        }
        if(num == 4){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/hamster.jpg");
        }
        if(num == 5){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/husky.jpg");
        }
        if(num == 6){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/kitten.png");
        }
        if(num == 7){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/loris.jpg");
        }
        if(num == 8){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/puppy.jpg");
        }
        if(num == 9){
            new DownloadImageTask(img).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/sleepy.png");
        }

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
