package com.example.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    RectF rectF;
    public MyView(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        for (int i = 0; i < getHeight(); i+=50)
            canvas.drawLine(0, i, getWidth(), getWidth() + i, paint);
        for (int i = 0; i < getWidth(); i+=50)
            canvas.drawLine(i, 0, getWidth(), getWidth() - i, paint);
    }
}
