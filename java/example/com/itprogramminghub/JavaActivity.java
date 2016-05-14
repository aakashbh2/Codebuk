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
import example.com.itprogramminghub.MainActivity;
import example.com.itprogramminghub.PhpActivity;
import example.com.itprogramminghub.RateActivity;
import example.com.itprogramminghub.SqlActivity;
import example.com.itprogramminghub.WebActivity;

public class JavaActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {
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
      this.setContentView(2130968604);
      this.mToolbar = (Toolbar)this.findViewById(2131624063);
      this.mToolbar.setTitle("JAVA");
      ((AdView)this.findViewById(2131624066)).loadAd((new Builder()).build());
      this.drawerFragment = (FragmentDrawer)this.getSupportFragmentManager().findFragmentById(2131624067);
      this.drawerFragment.setUp(2131624067, (DrawerLayout)this.findViewById(2131624061), this.mToolbar);
      this.drawerFragment.setDrawerListener(this);
      ((TextView)this.findViewById(2131624072)).setOnClickListener(new OnClickListener() {
         public void onClick(View var1) {
         }
      });
      String[] var2 = new String[]{"Chapter 1:Introduction", "Chapter 2:Environment Setup", "Chapter 3:Basic Syntax", "Chapter 4:Object & Classes", "Chapter 5:Datatypes", "Chapter 6:Variable Types", "Chapter 7:Modifier Types", "Chapter 8:Basic Operators", "Chapter 9:Loop Control", "Chapter 10:Decision Making", "Chapter 11:Number Class", "Chapter 12:Character Class", "Chapter 13:Strings", "Chapter 14:Arrays", "Chapter 15:Exceptions", "Chapter 16:Object Oriented Programming", "Chapter 17:Inheritance", "Chapter 18:Overriding", "Chapter 19:Polymorphism", "Chapter 20:Abstraction", "Chapter 21:Encapsulation", "Chapter 22:Interfaces", "Chapter 23:Data Structures", "Chapter 24:Generics", "Chapter 25:Multithreading", "Chapter 26:Applet Basic"};
      Integer[] var3 = new Integer[]{Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631), Integer.valueOf(2130837631)};
      CustomList var4 = new CustomList(this, var2, var3);
      this.list = (ListView)this.findViewById(2131624065);
      this.list.setAdapter(var4);
      this.list.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            switch(var3) {
            case 0:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java1.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 1:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java2.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 2:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java3.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 3:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java4.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 4:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java5.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 5:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java6.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 6:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java7.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 7:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java8.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 8:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java9.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 9:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java10.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 10:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java11.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 11:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java12.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 12:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java13.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 13:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java14.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 14:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java15.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 15:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java16.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 16:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java17.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 17:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java18.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 18:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java19.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 19:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java20.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 20:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java21.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 21:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java22.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 22:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java23.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 23:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java24.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 24:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java25.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
               return;
            case 25:
               JavaActivity.this.intent = new Intent(JavaActivity.this, WebActivity.class);
               JavaActivity.this.intent.putExtra("url", "file:///android_asset/java_html/java26.html");
               JavaActivity.this.startActivity(JavaActivity.this.intent);
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
