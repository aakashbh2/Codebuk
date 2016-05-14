package example.com.itprogramminghub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest.Builder;
import example.com.itprogramminghub.CppActivity;
import example.com.itprogramminghub.CssActivity;
import example.com.itprogramminghub.CustomList;
import example.com.itprogramminghub.FragmentDrawer;
import example.com.itprogramminghub.JavaActivity;
import example.com.itprogramminghub.MainActivity;
import example.com.itprogramminghub.PhpActivity;
import example.com.itprogramminghub.RateActivity;
import example.com.itprogramminghub.SqlActivity;
import example.com.itprogramminghub.WebActivity;

public class HtmlActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {
   private FragmentDrawer drawerFragment;
   Intent intent = new Intent();
   ListView list;
   private Toolbar mToolbar;

   private void displayView(int var1) {
      String var2 = this.getString(2131165246);
      switch(var1) {
      case 0:
         this.startActivity(new Intent(this, MainActivity.class));
         var2 = "Main Page";
         break;
      case 1:
         this.startActivity(new Intent(this, JavaActivity.class));
         var2 = "JAVA";
         break;
      case 2:
         this.startActivity(new Intent(this, CppActivity.class));
         var2 = "C++";
         break;
      case 3:
         this.startActivity(new Intent(this, PhpActivity.class));
         var2 = "PHP";
         break;
      case 4:
         var2 = "HTML";
         break;
      case 5:
         this.startActivity(new Intent(this, CssActivity.class));
         var2 = "CSS";
         break;
      case 6:
         this.startActivity(new Intent(this, SqlActivity.class));
         var2 = "SQL";
         break;
      case 7:
         this.startActivity(new Intent(this, RateActivity.class));
         var2 = "Rate Us";
      }

      if(false) {
         FragmentTransaction var3 = this.getSupportFragmentManager().beginTransaction();
         var3.replace(2131624064, (Fragment)null);
         var3.commit();
         this.getSupportActionBar().setTitle(var2);
      }

   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968604);
      this.mToolbar = (Toolbar)this.findViewById(2131624063);
      this.mToolbar.setTitle("HTML");
      ((AdView)this.findViewById(2131624066)).loadAd((new Builder()).build());
      this.drawerFragment = (FragmentDrawer)this.getSupportFragmentManager().findFragmentById(2131624067);
      this.drawerFragment.setUp(2131624067, (DrawerLayout)this.findViewById(2131624061), this.mToolbar);
      this.drawerFragment.setDrawerListener(this);
      ((TextView)this.findViewById(2131624072)).setOnClickListener(new OnClickListener() {
         public void onClick(View var1) {
         }
      });
      String[] var2 = new String[]{"Chapter 1:Home", "Chapter 2:Introduction", "Chapter 3:Basic Example", "Chapter 4:Elements", "Chapter 5:Attributes", "Chapter 6:Heading", "Chapter 7:Paragraph", "Chapter 8:Text Formatting", "Chapter 9:font Tag", "Chapter 10:Hyperlinks", "Chapter 11:Image", "Chapter 12:Table", "Chapter 13:List", "Chapter 14:Forms", "Chapter 15:Colors", "Chapter 16:Basic Document", "Chapter 17:Website Layouts", "Chapter 18:Head Tag", "Chapter 19:Meta", "Chapter 20:Scripts", "Chapter 21:Entity", "Chapter 22:URL\'S", "Chapter 23:URL Encode", "Chapter 24:Webserver", "Chapter 25:Media-Audio", "Chapter 26:Media-Videos", "Chapter 27:Media -Youtube"};
      Integer[] var3 = new Integer[]{Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603), Integer.valueOf(2130837603)};
      CustomList var4 = new CustomList(this, var2, var3);
      this.list = (ListView)this.findViewById(2131624065);
      this.list.setAdapter(var4);
      this.list.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            switch(var3) {
            case 0:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html1.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 1:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html2.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 2:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html3.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 3:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html4.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 4:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html5.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 5:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html6.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 6:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html7.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 7:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html8.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 8:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html9.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 9:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html10.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 10:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html11.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 11:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html12.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 12:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html13.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 13:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html14.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 14:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html15.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 15:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html16.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 16:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html17.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 17:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html19.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 18:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html20.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 19:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html21.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 20:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html22.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 21:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html23.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 22:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html24.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 23:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html25.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 24:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html26.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 25:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html27.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            case 26:
               HtmlActivity.this.intent = new Intent(HtmlActivity.this, WebActivity.class);
               HtmlActivity.this.intent.putExtra("url", "file:///android_asset/html_html/html28.html");
               HtmlActivity.this.startActivity(HtmlActivity.this.intent);
               return;
            default:
            }
         }
      });
   }

   public boolean onCreateOptionsMenu(Menu var1) {
      this.getMenuInflater().inflate(2131689478, var1);
      return true;
   }

   public void onDrawerItemSelected(View var1, int var2) {
      this.displayView(var2);
   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      return var1.getItemId() == 2131624109?true:super.onOptionsItemSelected(var1);
   }
}
