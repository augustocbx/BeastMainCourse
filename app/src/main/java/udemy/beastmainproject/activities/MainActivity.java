package udemy.beastmainproject.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import udemy.beastmainproject.R;
import udemy.beastmainproject.R2;
import udemy.beastmainproject.views.MainActivityViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.activity_main_viewPager)
    ViewPager mainViewPager;

    @BindView(R2.id.activity_main_tabLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MainActivityViewPagerAdapter adapter = new MainActivityViewPagerAdapter(getSupportFragmentManager());
        mainViewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(mainViewPager);

    }
}
