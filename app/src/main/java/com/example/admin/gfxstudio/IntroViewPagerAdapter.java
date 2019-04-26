package com.example.admin.gfxstudio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

    Context context;
    List<ScreenItem> listScreen;

    public IntroViewPagerAdapter(Context context, List<ScreenItem> listScreen) {
        this.context = context;
        this.listScreen = listScreen;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.intro_screen,null);

        ImageView imageView = layoutScreen.findViewById(R.id.intro_image);
        TextView title =  layoutScreen.findViewById(R.id.intro_title);
        TextView description = layoutScreen.findViewById(R.id.intro_description);

        title.setText(listScreen.get(position).getTitle());
        description.setText(listScreen.get(position).getDescription());
        imageView.setImageResource(listScreen.get(position).getScreenImg());

        container.addView(layoutScreen);
        return layoutScreen;
    }

    @Override
    public int getCount() {
        return listScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
