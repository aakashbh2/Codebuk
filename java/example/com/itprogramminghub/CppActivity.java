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
import example.com.itprogramminghub.CssActivity;
import example.com.itprogramminghub.CustomList;
import example.com.itprogramminghub.FragmentDrawer;
import example.com.itprogramminghub.HtmlActivity;
import example.com.itprogramminghub.JavaActivity;
import example.com.itprogramminghub.MainActivity;
import example.com.itprogramminghub.PhpActivity;
import example.com.itprogramminghub.RateActivity;
import example.com.itprogramminghub.SqlActivity;
import example.com.itprogramminghub.WebActivity;

public class CppActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {
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
         var2 = "C++";
         break;
      case 3:
         this.startActivity(new Intent(this, PhpActivity.class));
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
      this.setContentView(2130968601);
      this.mToolbar = (Toolbar)this.findViewById(2131624063);
      this.mToolbar.setTitle("C++");
      ((AdView)this.findViewById(2131624066)).loadAd((new Builder()).build());
      this.drawerFragment = (FragmentDrawer)this.getSupportFragmentManager().findFragmentById(2131624067);
      this.drawerFragment.setUp(2131624067, (DrawerLayout)this.findViewById(2131624061), this.mToolbar);
      this.drawerFragment.setDrawerListener(this);
      ((TextView)this.findViewById(2131624072)).setOnClickListener(new OnClickListener() {
         public void onClick(View var1) {
         }
      });
      String[] var2 = new String[]{"Chapter 1:Introduction", "Chapter 2:Structure of Program", "Chapter 3:Data Type", "Chapter 4:Variable Scope", "Chapter 5:Constants and Literals", "Chapter 6:Storage Classes", "Chapter 7:Operators", "Chapter 8:Array", "Chapter 9:String", "Chapter 10:Pointers", "Chapter 11:Struct", "Chapter 12:Input Output", "Chapter 13:Error", "Chapter 14:Loops", "Chapter 15:Loop Control System", "Chapter 16:Functions", "Chapter 17:More About Functions", "Chapter 18:Object Oriented Programming", "Chapter 19:Classes", "Chapter 20:Polymorphism ", "Chapter 21:Inheritance", "Chapter 22:Constructor", "Chapter 23:Data Abstraction", "Chapter 24:Encapsulation", "Chapter 25:Allocating Memory", "Chapter 26:Templates", "Chapter 27:File Handling", "Chapter 28:Exception Handling"};
      Integer[] var3 = new Integer[]{Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595), Integer.valueOf(2130837595)};
      CustomList var4 = new CustomList(this, var2, var3);
      this.list = (ListView)this.findViewById(2131624065);
      this.list.setAdapter(var4);
      this.list.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            switch(var3) {
            case 0:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp1.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 1:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp2.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 2:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp3.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 3:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp4.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 4:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp5.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 5:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp6.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 6:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp7.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 7:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp8.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 8:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp9.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 9:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp10.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 10:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp11.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 11:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp12.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 12:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp12.5.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 13:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp13.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 14:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp14.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 15:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp15.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 16:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp16.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 17:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp17.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 18:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp18.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 19:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp19.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 20:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp20.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 21:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp21.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 22:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp22.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 23:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp23.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 24:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp24.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 25:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp25.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 26:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp26.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
               return;
            case 27:
               CppActivity.this.intent = new Intent(CppActivity.this, WebActivity.class);
               CppActivity.this.intent.putExtra("url", "file:///android_asset/cpp_html/cpp27.html");
               CppActivity.this.startActivity(CppActivity.this.intent);
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
