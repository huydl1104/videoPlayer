
package com.ydl.videoplaylib.bean;


import java.io.Serializable;
import java.util.Map;

/**
 * 视频信息实体类
 */
public class VideoInfo implements Serializable {

    /**
     * 视频的标题
     */
    private String title;
    /**
     * 播放的视频地址
     */
    private String videoUrl;
    /**
     * 请求header
     */
    private Map<String, String> headers;
    /**
     * 视频封面
     */
    private String cover;
    /**
     * 视频时长
     */
    private long length;
    /**
     * 异常状态下的文案
     */
    private String errorMsg;
    /**
     * 播放完成的文案
     */
    private String completeMsg;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getCompleteMsg() {
        return completeMsg;
    }

    public void setCompleteMsg(String completeMsg) {
        this.completeMsg = completeMsg;
    }
}
