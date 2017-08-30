package com.baidu.www.successful.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.baidu.www.successful.R;

/**
 * Created by 黄郑宇 on 2017/8/30.兄弟真棒！
 */

public class MyView extends View {
    private String s;
    private float size;
    private int color;
    public MyView(Context context) {
        super(context);
        initviewdata(null);
    }

    private void initviewdata(@Nullable AttributeSet attrs) {
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.MyView);
        s = array.getString(R.styleable.MyView_text);
        size = array.getDimension(R.styleable.MyView_textsize, 10);
        color= array.getColor(R.styleable.MyView_textcolor, 0xffff);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initviewdata(attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setTextSize(size);
        canvas.drawText(s,0,22,paint);
    }
}
