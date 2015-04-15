package nerdlab.guide;

/**
 * Created by Wu on 2015/4/2.
 */

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.guideapplication.R;

public class AnimationView {
    private Animation alphaAnimation =null;
    public AnimationView(){
        alphaAnimation=new Animation() {
        };
    }

    public void setAlphaAnimation(Context context){
        alphaAnimation= AnimationUtils.loadAnimation(context, R.anim.alpha_anim);
    }

    public Animation getAnimation(){
        return alphaAnimation;
    }
}
