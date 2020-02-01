package com.techgen.tejus.slidetounlock.example;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.techgen.tejus.slidetounlock.ISlideChangeListener;
import com.techgen.tejus.slidetounlock.ISlideListener;
import com.techgen.tejus.slidetounlock.SlideLayout;
import com.techgen.tejus.slidetounlock.example.databinding.ActivityMainBinding;
import com.techgen.tejus.slidetounlock.renderers.ScaleRenderer;
import com.techgen.tejus.slidetounlock.sliders.HorizontalSlider;

public class MainActivity extends AppCompatActivity implements ISlideListener {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupSlider2();
//        setupIosSlider();
    }

    @Override
    public void onSlideDone(SlideLayout slider, boolean done) {
        if (done) {
            slider.reset();
        }
    }


    private void setupSlider2() {
        mBinding.slide2.setRenderer(new ScaleRenderer());
        mBinding.slide2.setSlider(new HorizontalSlider());
        mBinding.slide2.setChildId(R.id.slide_child);
        mBinding.slide2.setThreshold(0.9f);
        mBinding.slide2.addSlideChangeListener(new ISlideChangeListener() {
            @Override
            public void onSlideStart(SlideLayout slider) { ; }

            @Override
            public void onSlideChanged(SlideLayout slider, float percentage) {
                mBinding.txtText.setAlpha(1 - percentage);
            }

            @Override
            public void onSlideFinished(SlideLayout slider, boolean done) {
                onSlideDone(slider, done);
            }
        });
    }

}
