package net.uyghurdev.avaroid.shekiltunush;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
public class main extends Activity {
	/** Called when the activity is first created. */
	 public Handler hand=new Handler();
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); 
       setContentView(R.layout.main);
       hand.postDelayed( new Runnable() {
	        public void run() {
	        	Intent shekil = new Intent();
	        	shekil.setClass(main.this,shekil.class);
				main.this.startActivity(shekil);
	        }
	        },3000);
   }
}