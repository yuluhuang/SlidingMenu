package com.slidingmenu.ylh.slidingmenu;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.slidingmenu.ylh.view.SlidingMenu;


public class MyActivity extends Activity {

    private SlidingMenu mLeftMenu;
    private RelativeLayout oneRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏action bar
        setContentView(R.layout.activity_my);

        mLeftMenu = (SlidingMenu) findViewById(R.id.id_menu);
        oneRelativeLayout=(RelativeLayout)mLeftMenu.findViewById(R.id.oneRelativeLayout);
        oneRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyActivity.this,"aaaa",1).show();
            }
        });
    }

    public void toggleMenu(View view) {
        mLeftMenu.toggleMenu();
    }

}
