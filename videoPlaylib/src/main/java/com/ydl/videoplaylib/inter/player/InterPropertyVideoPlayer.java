
package com.ydl.videoplaylib.inter.player;

/**
 * VideoPlayer抽象接口，播放器基础属性获取和设置属性接口
 */
public interface InterPropertyVideoPlayer {

    /**
     * seek到制定的位置继续播放
     *
     * @param pos 播放位置
     */
    void seekTo(long pos);

    /**
     * 设置音量
     *
     * @param volume 音量值
     */
    void setVolume(int volume);

    /**
     * 设置播放速度，目前只有IjkPlayer有效果，原生MediaPlayer暂不支持
     *
     * @param speed 播放速度
     */
    void setSpeed(float speed);

    /**
     * 开始播放时，是否从上一次的位置继续播放
     *
     * @param continueFromLastPosition true 接着上次的位置继续播放，false从头开始播放
     */
    void continueFromLastPosition(boolean continueFromLastPosition);

    /**
     * 获取最大音量
     *
     * @return 最大音量值
     */
    int getMaxVolume();

    /**
     * 获取当前播放状态
     *
     * @return  播放状态
     */
    int getPlayType();

    /**
     * 获取当前音量
     *
     * @return 当前音量值
     */
    int getVolume();

    /**
     * 获取办法给总时长，毫秒
     *
     * @return 视频总时长ms
     */
    long getDuration();

    /**
     * 获取当前播放的位置，毫秒
     *
     * @return 当前播放位置，ms
     */
    long getCurrentPosition();

    /**
     * 获取视频缓冲百分比
     *
     * @return 缓冲白百分比
     */
    int getBufferPercentage();

    /**
     * 获取播放速度
     *
     * @param speed 播放速度
     * @return      播放速度
     */
    float getSpeed(float speed);

    /**
     * 获取网络加载速度
     *
     * @return 网络加载速度
     */
    long getTcpSpeed();

}
