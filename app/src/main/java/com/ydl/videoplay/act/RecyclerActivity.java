package com.ydl.videoplay.act;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ydl.videoplay.R;
import com.ydl.videoplay.adpter.VideoAdapter;
import com.ydl.videoplay.bean.Video;
import com.ydl.videoplay.utils.ConstantVideo;
import com.ydl.videoplaylib.manager.VideoPlayerManager;
import com.ydl.videoplaylib.player.VideoPlayer;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity  extends BaseActivity  {
    RecyclerView recyclerView;

    @Override
    protected void onStop() {
        super.onStop();
        VideoPlayerManager.instance().releaseVideoPlayer();
    }

    @Override
    public void onBackPressed() {
        if (VideoPlayerManager.instance().onBackPressed()){
            return;
        }
        super.onBackPressed();
    }


    @Override
    public int getContentView() {
        return R.layout.base_recycler_view;
    }

    @Override
    public void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        List<Video> list = new ArrayList<>();
        for (int a = 0; a< ConstantVideo.VideoPlayerList.length ; a++){
            Video video = new Video(ConstantVideo.VideoPlayerTitle[a],ConstantVideo.VideoPlayerList[a]);
            list.add(video);
        }
        VideoAdapter adapter = new VideoAdapter(this, list);
        recyclerView.setAdapter(adapter);
        recyclerView.setRecyclerListener(new RecyclerView.RecyclerListener() {
            @Override
            public void onViewRecycled(RecyclerView.ViewHolder holder) {
                VideoPlayer videoPlayer = ((VideoAdapter.VideoViewHolder) holder).mVideoPlayer;
                if (videoPlayer == VideoPlayerManager.instance().getCurrentVideoPlayer()) {
                    VideoPlayerManager.instance().releaseVideoPlayer();
                }
            }
        });
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }
}
