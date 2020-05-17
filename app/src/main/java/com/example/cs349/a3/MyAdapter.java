package com.example.cs349.a3;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;


import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    private List<Pic> mData;
    //private int selectedRate = 0;
    //private RatingBar ratingMenuBar;
    //private int orientation;

    //constructor
    public MyAdapter(Context mContext, List<Pic> mData) {
        this.mContext = mContext;
        this.mData = mData;
        //this.ratingMenuBar = ratingMenuBar;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.cardview_pic, parent, false);
        return new MyViewHolder(v);
    }

    // Replace the contents of a view
    @Override
    public void onBindViewHolder(MyViewHolder holder,  int position) {
        final int pos = position;
        //holder.pic.setImageResource(mData.get(position).getThumbnail());
        //int eachRate = Integer.valueOf(mData.get(position).getRate());
        //System.out.println(eachRate);
        //if((selectedRate == 0) || (eachRate >= selectedRate)) {
            if (position == 0) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/bunny.jpg");
                mData.get(position).setThumbnail(0);
            }
            if (position == 1) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/chinchilla.jpg");
                mData.get(position).setThumbnail(1);
            }
            if (position == 2) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/doggo.jpg");
                mData.get(position).setThumbnail(2);
            }
            if (position == 3) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/fox.jpg");
                mData.get(position).setThumbnail(3);
            }
            if (position == 4) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/hamster.jpg");
                mData.get(position).setThumbnail(4);
            }
            if (position == 5) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/husky.jpg");
                mData.get(position).setThumbnail(5);
            }
            if (position == 6) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/kitten.png");
                mData.get(position).setThumbnail(6);
            }
            if (position == 7) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/loris.jpg");
                mData.get(position).setThumbnail(7);
            }
            if (position == 8) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/puppy.jpg");
                mData.get(position).setThumbnail(8);
            }
            if (position == 9) {
                new DownloadImageTask(holder.pic).execute("https://www.student.cs.uwaterloo.ca/~cs349/s19/assignments/images/sleepy.png");
                mData.get(position).setThumbnail(9);
            }
        //}

        //******************************************click the img to enlarge that picture******************************************
        holder.pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, EnlargedPic.class);
                // passing data to the enlarged pic activity
                intent.putExtra("Rate", mData.get(pos).getRate());
                intent.putExtra("Thumbnail", mData.get(pos).getThumbnail());
                // start the activity
                mContext.startActivity(intent);
            }
        });

        //****************************************** set the rating based on the selected stars******************************************
        holder.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mData.get(pos).setRate("1");
                        break;
                    case 2:
                        mData.get(pos).setRate("2");
                        break;
                    case 3:
                        mData.get(pos).setRate("3");
                        break;
                    case 4:
                        mData.get(pos).setRate("4");
                        break;
                    case 5:
                        mData.get(pos).setRate("5");
                        break;
                    default:
                }
            }
        });
        //update the rating to the correct value
        holder.ratingBar.setRating(Float.parseFloat(mData.get(position).getRate()));

        /*ratingMenuBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        selectedRate = 1;
                        break;
                    case 2:
                        selectedRate = 2;
                        break;
                    case 3:
                        selectedRate = 3;
                        break;
                    case 4:
                        selectedRate = 4;
                        break;
                    case 5:
                        selectedRate = 5;
                        break;
                    default:
                }
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView pic;
        CardView cardView;
        int rate;
        RatingBar ratingBar;

        public MyViewHolder(View v) {
            super(v);
            pic = (ImageView) v.findViewById(R.id.pic_id);
            cardView = (CardView) v.findViewById(R.id.cardview_id);
            //rate = v.findViewById(R.id.ratingScore) ;
            ratingBar = (RatingBar) v.findViewById(R.id.ratingBar);
        }
    }
}