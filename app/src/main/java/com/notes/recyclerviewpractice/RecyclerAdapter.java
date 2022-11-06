package com.notes.recyclerviewpractice;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.notes.recyclerviewpractice.model.UserrecommendedClasses;
import com.notes.recyclerviewpractice.utils.ViewPager1Adapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    UserrecommendedClasses.Data list;

    public RecyclerAdapter(Context context, UserrecommendedClasses.Data list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider1, parent, false);
                return new RecyViewHolder1(view);
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider, parent, false);
                return new RecyViewHolder(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (holder.getItemViewType() == 0) {
            //recomendationview pager1
            RecyViewHolder1 holder1 = (RecyViewHolder1) holder;

            holder1.viewPager1.setClipToPadding(false);
            holder1.viewPager1.setPageMargin(60);

            ViewPager1Adapter viewPager1Adapter = new ViewPager1Adapter(context, list.getRecommendedClasses());
            holder1.viewPager1.setAdapter(viewPager1Adapter);

            holder1.dotscount1 = viewPager1Adapter.getCount();
            holder1.dots1 = new ImageView[holder1.dotscount1];

            for (int i = 0; i < holder1.dotscount1; i++) {

                holder1.dots1[i] = new ImageView(context);
                holder1.dots1[i].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.non_active_dot));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(8, 0, 8, 0);

                holder1.sliderDotspanel1.addView(holder1.dots1[i], params);
            }

            if (list.getRecommendedClasses().size() > 0) {
                holder1.dots1[0].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.active_dot));
            }
            holder1.viewPager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int arg0) {
                    for (int i = 0; i < holder1.dotscount1; i++) {
                        holder1.dots1[i].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.non_active_dot));
                    }
                    holder1.dots1[arg0].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.active_dot));
                }

                @Override
                public void onPageScrollStateChanged(int state) {
                }
            });
        } else {
            Log.d("shdggsdh", "onBindViewHolder: " + position);
            int realPosition = position - 1;
            Log.d("djhsjd", "onBindViewHolder: " + realPosition);
            Log.d("djhsjds", "onBindViewHolder: " + list.getRecommendedClasses().size());
            RecyViewHolder holder2 = (RecyViewHolder) holder;

            holder2.headtxt1.setText(list.getGoalDetails().get(realPosition).getName());

            //view pager
            holder2.viewPager.setClipToPadding(false);
            holder2.viewPager.setPageMargin(60);

            ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(context, list.getGoalDetails().get(realPosition).getClassDetails());
            holder2.viewPager.setAdapter(viewPagerAdapter);

            holder2.dotscount = viewPagerAdapter.getCount();
            holder2.dots = new ImageView[holder2.dotscount];

            for (int i = 0; i < holder2.dotscount; i++) {

                holder2.dots[i] = new ImageView(context);
                holder2.dots[i].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.non_active_dot));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(8, 0, 8, 0);

                holder2.sliderDotspanel.addView(holder2.dots[i], params);
            }

            holder2.dots[0].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.active_dot));
            holder2.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int arg0) {
                    for (int i = 0; i < holder2.dotscount; i++) {
                        holder2.dots[i].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.non_active_dot));
                    }
                    holder2.dots[arg0].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.active_dot));
                }

                @Override
                public void onPageScrollStateChanged(int state) {
                }
            });

        }
    }


    @Override
    public int getItemCount() {
        return list.getRecommendedClasses().size() + list.getGoalDetails().size();
    }

    class RecyViewHolder extends RecyclerView.ViewHolder {

        ViewPager viewPager;
        LinearLayout sliderDotspanel;
        private int dotscount;
        private ImageView[] dots;
        TextView headtxt, headtxt1;

        public RecyViewHolder(@NonNull View itemView) {
            super(itemView);
            viewPager = itemView.findViewById(R.id.viewPager);
            sliderDotspanel = itemView.findViewById(R.id.SliderDots);
            headtxt = itemView.findViewById(R.id.headtxt);
            headtxt1 = itemView.findViewById(R.id.headtxt1);

        }
    }

    class RecyViewHolder1 extends RecyclerView.ViewHolder {

        ViewPager viewPager1;
        LinearLayout sliderDotspanel1;
        private int dotscount1;
        private ImageView[] dots1;
        TextView headtxt, headtxt1;

        public RecyViewHolder1(@NonNull View itemView) {
            super(itemView);
            viewPager1 = itemView.findViewById(R.id.viewPager1);
            sliderDotspanel1 = itemView.findViewById(R.id.SliderDots1);
            headtxt = itemView.findViewById(R.id.headtxt);
            headtxt1 = itemView.findViewById(R.id.headtxt1);

        }
    }
}
