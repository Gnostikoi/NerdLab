package nerdlab.main;

import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.guideapplication.R;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.ikimuhendis.ldrawer.ActionBarDrawerToggle;
import com.ikimuhendis.ldrawer.DrawerArrowDrawable;


public class DrawerActivity extends FragmentActivity{

    private DrawerLayout mDrawerLayout;

    private ListView mDrawerList;

    private ActionBarDrawerToggle mDrawerToggle;

    private DrawerArrowDrawable drawerArrow;

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        if(savedInstanceState==null){
            Log.d("TEST", "NULL");

        }else {
            Log.d("TEST","NOT NULL");
        }

        actionBar=getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.navdrawer);

        drawerArrow = new DrawerArrowDrawable(this) {
            @Override
            public boolean isLayoutRtl() {
                return false;
            }
        };

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                drawerArrow, R.string.drawer_open, R.string.drawer_close) {

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        String[] values = new String[]{
                "One",
                "Two",
                "Three"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        mDrawerToggle.setAnimateEnabled(true);//The animation in the top-left button
//                        drawerArrow.setProgress(0);
                        getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment1()).commit();
                        mDrawerLayout.closeDrawer(mDrawerList);
                        break;
                    case 1:
                        mDrawerToggle.setAnimateEnabled(true);
//                        drawerArrow.setProgress(1f);
                        getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment2()).commit();
                        mDrawerLayout.closeDrawer(mDrawerList);
                        break;
                    case 2:
                        mDrawerToggle.setAnimateEnabled(true);
                        mDrawerToggle.syncState();
                        getSupportFragmentManager().beginTransaction().replace(R.id.content, new FragmentParent()).commit();
                        mDrawerLayout.closeDrawer(mDrawerList);
                        break;
                }

            }
        });

        final View actionB = findViewById(R.id.action_b);
        final View actionA=findViewById(R.id.action_a);
        FloatingActionButton actionC = new FloatingActionButton(getBaseContext());
        actionC.setTitle("new activity");
        actionC.setColorPressed(R.color.orange);
        actionC.setColorPressed(R.color.orange_pressed);
        actionC.setIcon(R.drawable.ic_fab_star);
        actionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionB.setVisibility(actionB.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                actionA.setVisibility(actionA.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
            }
        });
        ((FloatingActionsMenu) findViewById(R.id.multiple_actions)).addButton(actionC);
        getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment2()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_drawer, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id==android.R.id.home){
            if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
                mDrawerLayout.closeDrawer(mDrawerList);
            } else {
                mDrawerLayout.openDrawer(mDrawerList);
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }
}
