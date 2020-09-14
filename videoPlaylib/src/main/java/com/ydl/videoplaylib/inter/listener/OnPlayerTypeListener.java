
package com.ydl.videoplaylib.inter.listener;


/**
 * 视频播放模式监听
 */
public interface OnPlayerTypeListener {

    /**
     * 切换到全屏播放监听
     */
    void onFullScreen();

    /**
     * 切换到小窗口播放监听
     */
    void onTinyWindow();

    /**
     * 切换到正常播放监听
     */
    void onNormal();

}
