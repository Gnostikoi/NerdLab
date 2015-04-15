package nerdlab.guide;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Wu on 2015/4/2.
 * ViewpagerAdapter
 */
public class ViewPagerAdapter extends PagerAdapter {

    private ArrayList<View> views;

    public ViewPagerAdapter(ArrayList<View> views){
        this.views=views;
    }

    @Override
    public int getCount() {
        if(views!=null){
            return views.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(View container,int position,Object object){
        ((ViewPager)container).removeView(views.get(position));
    }

    @Override
    public Object instantiateItem(View container,int position){
        ((ViewPager)container).addView(views.get(position), 0);
        return views.get(position);
    }
}
