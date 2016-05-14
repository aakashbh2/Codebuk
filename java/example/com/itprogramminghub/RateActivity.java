package example.com.itprogramminghub;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class RateActivity extends ActionBarActivity {
   protected void onCreate(Bundle var1) {
      super.onCreate(var1);

      try {
         this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.getPackageName())));
      } catch (ActivityNotFoundException var3) {
         this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
      }
   }
}
