package com.ydl.videoplay.act;

import com.ydl.videoplay.R;
import com.ydl.videoplay.fragment.TestListFragment;
import com.ydl.videoplaylib.manager.VideoPlayerManager;

public class ListActivity extends BaseActivity{
    @Override
    public void onBackPressed() {
        if (VideoPlayerManager.instance().onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public int getContentView() {
        return R.layout.activity_fragment;
    }

    @Override
    public void initView() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new TestListFragment())
                .commit();
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }
}
