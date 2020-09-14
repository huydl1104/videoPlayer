package com.ydl.videoplay.act;

import com.ydl.videoplay.R;
import com.ydl.videoplay.fragment.TestFragment;
import com.ydl.videoplaylib.manager.VideoPlayerManager;

public class MyFragmentActivity  extends BaseActivity{
    @Override
    protected void onStop() {
        super.onStop();
        VideoPlayerManager.instance().releaseVideoPlayer();
    }

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
                .add(R.id.container, new TestFragment())
                .commit();
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }
}
