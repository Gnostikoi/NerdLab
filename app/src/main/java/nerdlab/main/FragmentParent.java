package nerdlab.main;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;
import com.example.guideapplication.R;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

/**
 * Created by Wu on 2015/4/16.
 */
public class FragmentParent extends Fragment {

    private final Handler handler = new Handler();

    private DisplayMetrics dm;

    static final int NUM_ITEMS=2;

    private MyPagerAdapter myPagerAdapter;

    private ViewPager mPager;

    private PagerSlidingTabStrip tabs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmentparent, container, false);
        mPager=(ViewPager)rootView.findViewById(R.id.pager);
        myPagerAdapter=new MyPagerAdapter(getChildFragmentManager());
        mPager.setAdapter(myPagerAdapter);
        tabs=(PagerSlidingTabStrip)rootView.findViewById(R.id.tabs);
        tabs.setViewPager(mPager);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setHasOptionsMenu(true);
    }

}