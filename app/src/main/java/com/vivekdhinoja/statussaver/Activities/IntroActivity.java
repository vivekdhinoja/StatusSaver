package com.vivekdhinoja.statussaver.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.vivekdhinoja.statussaver.R;
import com.vivekdhinoja.statussaver.Utils.Constants;

/**
 * Created by Tushar on 9/3/2017.
 */

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("STEP 1", "Tap to open WhatsApp.", R.drawable.waintro1, Color.parseColor("#00695c")));
        addSlide(AppIntroFragment.newInstance("STEP 2", "View Recent Stories and Open Whatsapp Story Saver.", R.drawable.waintro2, Color.parseColor("#4caf50")));
        addSlide(AppIntroFragment.newInstance("STEP 3", "Download Stories you want!", R.drawable.waintro3, Color.parseColor("#00bcd4")));
        showSkipButton(false);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        SharedPreferences.Editor editor = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE).edit();
        editor.putBoolean("AppIntro", false);
        editor.commit();
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
    }
}
