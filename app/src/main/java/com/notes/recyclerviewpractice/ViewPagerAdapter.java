package com.notes.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.notes.recyclerviewpractice.model.UserrecommendedClasses;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image};
    List<UserrecommendedClasses.ClassDetail> list;

    public ViewPagerAdapter(Context context,List<UserrecommendedClasses.ClassDetail> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
        TextView textView =  view.findViewById(R.id.text);
        TextView text1 =  view.findViewById(R.id.text1);
        TextView text2 =  view.findViewById(R.id.text2);
       // Button button = view.findViewById(R.id.button2);

        //set image
        imageView.setImageResource(R.drawable.image);

//        if (position==images.length-1){
//            button.setVisibility(View.VISIBLE);
//        }else {
//            button.setVisibility(View.GONE);
//        }
            textView.setText(list.get(position).getName());
            text1.setText(list.get(position).getTimeSlotName());
            text2.setText(list.get(position).getIntensityName());


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }

    @Override
    public float getPageWidth(int position) {

        if (position==list.size()-1){
            return 1f;
        }
        return 0.93f;

    }


}
