package com.joystickandroidapp.remotejoystick.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;

public class Joystick extends View {
    public double centerX;
    public double centerY;
    public double radius;

    public Joystick(Context context) {
        super(context);
    }

    public Joystick(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Joystick(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x = getWidth();
        int y = getHeight();
        int radius = 170;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(Color.RED);
        canvas.drawCircle(x/2, y/2, radius, paint);
    }
}

