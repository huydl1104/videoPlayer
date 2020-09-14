
package com.ydl.videoplaylib.inter.listener;


import android.view.SurfaceHolder;

/**
 * VideoSurfaceView监听
 */
public interface OnSurfaceListener {

    void surfaceCreated(SurfaceHolder holder);

    void surfaceChanged(SurfaceHolder holder, int format, int width, int height);

    void surfaceDestroyed(SurfaceHolder holder);


}
