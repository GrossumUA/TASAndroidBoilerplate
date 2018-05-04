package com.theappsolutions.boilerplate.additionalusefulclasses.custom_views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * @author Dmytro Yakovlev d.yakovlev@theappsolutions.com
 * @copyright (c) 2017 TheAppSolutions. (https://theappsolutions.com)
 */
public class SquareByHeightImageView extends AppCompatImageView {


    public SquareByHeightImageView(Context context) {
        super(context);
    }

    public SquareByHeightImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareByHeightImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int height = getMeasuredHeight();
        setMeasuredDimension(height, height);
    }
}