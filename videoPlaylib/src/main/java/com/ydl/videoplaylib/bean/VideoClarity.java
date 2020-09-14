
package com.ydl.videoplaylib.bean;


/**
 * 清晰度实体类
 */
public class VideoClarity {

    /**
     * 清晰度等级
     */
    private String grade;
    /**
     * 270P、480P、720P、1080P、4K ...
     */
    private String p;
    /**
     * 视频链接地址
     */
    private String videoUrl;

    public VideoClarity(String grade, String p, String videoUrl) {
        this.grade = grade;
        this.p = p;
        this.videoUrl = videoUrl;
    }

    public String getGrade() {
        return grade;
    }

    public String getP() {
        return p;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

}