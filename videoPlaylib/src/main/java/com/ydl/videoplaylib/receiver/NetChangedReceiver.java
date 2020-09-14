
package com.ydl.videoplaylib.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.ydl.videoplaylib.constant.ConstantKeys;
import com.ydl.videoplaylib.controller.AbsVideoPlayerController;
import com.ydl.videoplaylib.manager.VideoPlayerManager;
import com.ydl.videoplaylib.player.VideoPlayer;
import com.ydl.videoplaylib.utils.NetworkUtils;
import com.ydl.videoplaylib.utils.VideoLogUtil;



/**
 * 网络状态监听广播
 */
public class NetChangedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        VideoLogUtil.i("网络状态监听广播接收到数据了");
        VideoPlayer mVideoPlayer = VideoPlayerManager.instance().getCurrentVideoPlayer();
        if (mVideoPlayer!=null){
            AbsVideoPlayerController controller = mVideoPlayer.getController();
            switch (NetworkUtils.getConnectState(context)) {
                case MOBILE:
                    VideoLogUtil.i("当网络状态监听前连接了移动数据");
                    break;
                case WIFI:
                    VideoLogUtil.i("网络状态监听当前连接了Wifi");
                    break;
                case UN_CONNECTED:
                    VideoLogUtil.i("网络状态监听当前没有网络连接");
                    if (mVideoPlayer.isPlaying() || mVideoPlayer.isBufferingPlaying()) {
                        VideoLogUtil.i("网络状态监听当前没有网络连接---设置暂停播放");
                        mVideoPlayer.pause();
                    }
                    if (controller!=null){
                        controller.onPlayStateChanged(ConstantKeys.CurrentState.STATE_ERROR);
                    }
                    break;
                default:
                    VideoLogUtil.i("网络状态监听其他情况");
                    break;
            }
        }
    }
}
