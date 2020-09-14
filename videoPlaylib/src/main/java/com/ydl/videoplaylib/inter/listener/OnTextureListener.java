
package com.ydl.videoplaylib.inter.listener;


import android.graphics.SurfaceTexture;

/**
 * VideoTextureView监听
 */
public interface OnTextureListener {

    /**
     * SurfaceTexture准备就绪
     * @param surface                   surface
     */
    void onSurfaceAvailable(SurfaceTexture surface);

    /**
     * SurfaceTexture缓冲大小变化
     * @param surface                   surface
     * @param width                     WIDTH
     * @param height                    HEIGHT
     */
    void onSurfaceSizeChanged(SurfaceTexture surface, int width, int height);

    /**
     * SurfaceTexture即将被销毁
     * @param surface                   surface
     * @return                          销毁
     */
    boolean onSurfaceDestroyed(SurfaceTexture surface);

    /**
     * SurfaceTexture通过updateImage更新
     * @param surface                   surface
     */
    void onSurfaceUpdated(SurfaceTexture surface);

}
