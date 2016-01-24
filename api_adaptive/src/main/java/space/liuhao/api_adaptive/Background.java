package space.liuhao.api_adaptive;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/**
 * 北京类Api兼容
 *
 * @author 刘浩 2016-01-24 15-14
 * @version 1.1.0
 */
public class Background {
    /**
     * 设置是背景Drawable对象
     * @param view 待设置的视图对象
     * @param drawable Drawable对象
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static final void setBackgroundDrawable(View view,Drawable drawable){
        if(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1>=Build.VERSION.SDK_INT){
            //noinspection deprecation
            view.setBackgroundDrawable(drawable);
        }else{
            view.setBackground(drawable);
        }
    }
}
