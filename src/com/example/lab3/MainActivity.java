package com.example.lab3;

 
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
 
public class MainActivity extends Activity {
 
	DemoView demo;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		demo = new DemoView(this);
		setContentView(demo);
	}
 
	private class DemoView extends View {
		public DemoView(Context mcontext) {
			super(mcontext);
		}
 
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
 
			Paint paint = new Paint();
			paint.setStyle(Paint.Style.FILL);
 
			
			paint.setColor(Color.BLUE);
			canvas.drawPaint(paint);
 
			paint.setAntiAlias(false);
			paint.setColor(Color.MAGENTA);
			canvas.drawCircle(150, 150, 40, paint);
 
			paint.setAntiAlias(true);
			paint.setColor(Color.CYAN);
			canvas.drawCircle(150, 300, 60, paint);
 
			
			paint.setAntiAlias(false);
			paint.setColor(Color.YELLOW);
			canvas.drawRect(100, 15, 300, 70, paint);
			
			canvas.rotate(-25);
 
			paint.setStyle(Paint.Style.FILL);
			canvas.drawText("Graphics Rotation", 80, 280, paint);
 
		
			canvas.restore();
		}
	}
 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
 
}