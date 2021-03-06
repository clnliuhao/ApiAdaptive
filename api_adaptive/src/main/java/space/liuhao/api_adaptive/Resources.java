package space.liuhao.api_adaptive;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;

/**
 * Resources类Api兼容
 *
 * @author 刘浩 2016-01-24 11-11
 * @version 1.2.0
 */
public class Resources {
    /**
     * 获取一个Drawable资源
     *
     * @param context 上下文实体
     * @param id      资源ID
     * @return Drawable资源对象
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static final Drawable getDrawable(Context context, int id) {
        if (Build.VERSION_CODES.LOLLIPOP>= Build.VERSION.SDK_INT) {
            //noinspection deprecation
            return context.getResources().getDrawable(id);
        } else {
            return context.getResources().getDrawable(id, context.getTheme());
        }
    }

    /**
     * 获取一个颜色值
     * @param context 上下文实体
     * @param id 颜色Id
     * @return 颜色值
     */
    @TargetApi(Build.VERSION_CODES.M)
    public static final int getColor(Context context,int id){
        if(Build.VERSION_CODES.LOLLIPOP_MR1>=Build.VERSION.SDK_INT){
            //noinspection deprecation
            return context.getResources().getColor(id);
        }else{
            return context.getResources().getColor(id,context.getTheme());
        }

    }

}
