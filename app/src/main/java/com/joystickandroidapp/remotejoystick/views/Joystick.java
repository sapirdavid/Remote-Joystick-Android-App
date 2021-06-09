package com.joystickandroidapp.remotejoystick.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;


public class Joystick extends View {
    public double initCenterX;
    public double initCenterY;
    public double movingX = 0;
    public double movingY = 0;
    public double radius = 170;
    public JoystickListener joystickListener;

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
        initCenterX = getWidth() / 2;
        initCenterY = getHeight() / 2;
        double centerX = initCenterX + this.movingX;
        double centerY = initCenterY + this.movingY;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(Color.RED);
        canvas.drawCircle((float)centerX, (float)centerY, (float)radius, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                float x = event.getX();
                float y = event.getY();
                this.movingX = x - (getWidth() / 2);
                this.movingY = y - (getHeight() / 2);
                if (joystickListener!= null) {
                    joystickListener.onMoved((float)this.movingX, (float)this.movingY);
                }
                invalidate();
                return true;
            case MotionEvent.ACTION_UP:
                this.movingX = 0;
                this.movingY = 0;
                if (joystickListener!= null) {
                    joystickListener.onMoved(0, 0);
                }
                invalidate();
                return true;
        }
        return super.onTouchEvent(event);
    }

}

interface JoystickListener {
    void onMoved(float x, float y);
}

