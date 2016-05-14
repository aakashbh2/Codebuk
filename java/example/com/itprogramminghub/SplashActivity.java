package example.com.itprogramminghub;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import example.com.itprogramminghub.MainActivity;

public class SplashActivity extends ActionBarActivity {
   private static final int DELAY_TIME = 2000;
   boolean BackButtonPressed;
   Handler myhandler;

   public void onBackPressed() {
      this.BackButtonPressed = true;
      super.onBackPressed();
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968608);
      this.myhandler = new Handler();
      this.myhandler.postDelayed(new Runnable() {
         public void run() {
            SplashActivity.this.finish();
            if(!SplashActivity.this.BackButtonPressed) {
               SplashActivity.this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }

         }
      }, 2000L);
   }
}
