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
import example.com.itprogramminghub.HtmlActivity;
import example.com.itprogramminghub.JavaActivity;
import example.com.itprogramminghub.MainActivity;
import example.com.itprogramminghub.RateActivity;
import example.com.itprogramminghub.SqlActivity;
import example.com.itprogramminghub.WebActivity;

public class PhpActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {
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
         var2 = "PHP";
         break;
      case 4:
         this.startActivity(new Intent(this, HtmlActivity.class));
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
      this.setContentView(2130968607);
      this.mToolbar = (Toolbar)this.findViewById(2131624063);
      this.mToolbar.setTitle("PHP");
      ((AdView)this.findViewById(2131624066)).loadAd((new Builder()).build());
      this.drawerFragment = (FragmentDrawer)this.getSupportFragmentManager().findFragmentById(2131624067);
      this.drawerFragment.setUp(2131624067, (DrawerLayout)this.findViewById(2131624061), this.mToolbar);
      this.drawerFragment.setDrawerListener(this);
      ((TextView)this.findViewById(2131624072)).setOnClickListener(new OnClickListener() {
         public void onClick(View var1) {
         }
      });
      String[] var2 = new String[]{"Chapter 1:Introduction", "Chapter 2:Installing PHP", "Chapter 3:Variables", "Chapter 4:Conditional Logic", "Chapter 5:Operators In PHP", "Chapter 6:Logical Operators", "Chapter 7:If Else Statement", "Chapter 8:Switch Statement", "Chapter 9:For Loop", "Chapter 10:While and Do-While Loop", "Chapter 11:Arrays", "Chapter 12:Setting up Array", "Chapter 13:Stroing Values in PHP", "Chapter 14:Functions in PHP", "Chapter 15:Functions and Arguments", "Chapter 16:Call By Reference and Value", "Chapter 17:String Function", "Chapter 18:Date Function", "Chapter 19:Working with Files", "Chapter 20:Opening a File", "Chapter 21:File Location in PHP", "Chapter 22:Creating Database", "Chapter 23:Fields in Database", "Chapter 24:Accessing Database in PHP", "Chapter 25:SQL and PHP", "Chapter 26:Deleting Record from Database", "Chapter 27:Adding Record to Database"};
      Integer[] var3 = new Integer[]{Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646), Integer.valueOf(2130837646)};
      CustomList var4 = new CustomList(this, var2, var3);
      this.list = (ListView)this.findViewById(2131624065);
      this.list.setAdapter(var4);
      this.list.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            switch(var3) {
            case 0:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php1.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 1:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php2.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 2:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php3.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 3:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php4.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 4:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php5.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 5:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php6.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 6:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php7.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 7:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php8.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 8:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php9.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 9:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php10.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 10:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php11.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 11:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php12.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 12:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php13.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 13:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php14.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 14:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php15.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 15:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php16.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 16:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php17.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 17:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php18.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 18:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php19.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 19:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php20.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 20:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php21.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 21:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php22.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 22:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php23.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 23:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php24.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 24:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php25.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 25:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php26.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            case 26:
               PhpActivity.this.intent = new Intent(PhpActivity.this, WebActivity.class);
               PhpActivity.this.intent.putExtra("url", "file:///android_asset/php_html/php27.html");
               PhpActivity.this.startActivity(PhpActivity.this.intent);
               return;
            default:
            }
         }
      });
   }

   public boolean onCreateOptionsMenu(Menu var1) {
      this.getMenuInflater().inflate(2131689475, var1);
      return true;
   }

   public void onDrawerItemSelected(View var1, int var2) {
      this.displayView(var2);
   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      return var1.getItemId() == 2131624109?true:super.onOptionsItemSelected(var1);
   }
}
