
package com.ydl.videoplaylib.inter.player;

import java.util.Map;


/**
 * VideoPlayer抽象接口,负责播放模式切换和销毁逻辑的接口
 */
public interface InterScreenVideoPlayer {

    /**------------------以下3个方法是播放器的模式----------------------------*/
    /**
     * 是否是全屏播放
     */
    boolean isFullScreen();
    /**
     * 是否是小窗口播放
     */
    boolean isTinyWindow();
    /**
     * 是否是正常播放
     */
    boolean isNormal();

    /**------------------以下方法是切换播放器的模式----------------------------*/

    /**
     * 进入全屏模式
     * 这个是横屏模式
     */
    void enterVerticalScreenScreen();

    /**
     * 进入全屏模式
     */
    void enterFullScreen();

    /**
     * 退出全屏模式
     *
     * @return true 退出
     */
    boolean exitFullScreen();

    /**
     * 进入小窗口模式
     */
    void enterTinyWindow();

    /**
     * 退出小窗口模式
     *
     * @return true 退出小窗口
     */
    boolean exitTinyWindow();

    /**------------------以下方法是销毁视频播放器资源----------------------------*/

    /**
     * 此处只释放播放器（如果要释放播放器并恢复控制器状态需要调用{@link #release()}方法）
     * 不管是全屏、小窗口还是Normal状态下控制器的UI都不恢复初始状态
     * 这样以便在当前播放器状态下可以方便的切换不同的清晰度的视频地址
     */
    void releasePlayer();

    /**
     * 释放INiceVideoPlayer，释放后，内部的播放器被释放掉，同时如果在全屏、小窗口模式下都会退出
     * 并且控制器的UI也应该恢复到最初始的状态.
     */
    void release();
}
