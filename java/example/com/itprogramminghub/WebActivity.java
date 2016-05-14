package example.com.itprogramminghub;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;

public class WebActivity extends ActionBarActivity {
   WebView webView1;

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968610);
      this.webView1 = (WebView)this.findViewById(2131624070);
      String var2 = this.getIntent().getStringExtra("url");
      this.webView1.getSettings().setJavaScriptEnabled(true);
      this.webView1.getSettings().setBuiltInZoomControls(true);
      this.webView1.loadUrl(var2);
   }
}
