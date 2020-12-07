package com.example.example;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.example.R;

public class GridviewAdapter extends BaseAdapter {

    int[] animalImages ={R.drawable.bear,R.drawable.bird,R.drawable.cat,R.drawable.cow,R.drawable.dolphin,R.drawable.fish,
            R.drawable.fox,R.drawable.horse,R.drawable.lion,R.drawable.tiger};
    String[] animalNames = {"Bear","Bird","Cat","Cow","Dolphine","Fish","Fox","Horse","Lion","Tiger"};
    Context context;
    @Override
    public int getCount() {
        return animalImages.length;
    }
    public GridviewAdapter(Context context){
        this.context = context;
    }

    @Override
    public Object getItem(int position) {
        return animalImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(animalImages[position]);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));
        imageView.setPadding(10,10,10,10);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"The name of the animal is: " + animalNames[position],Toast.LENGTH_LONG);
            }
        });


        return imageView;
    }
}
