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
import example.com.itprogramminghub.PhpActivity;
import example.com.itprogramminghub.RateActivity;
import example.com.itprogramminghub.WebActivity;

public class SqlActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {
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
         this.startActivity(new Intent(this, HtmlActivity.class));
         var2 = "HTML";
         break;
      case 5:
         this.startActivity(new Intent(this, CssActivity.class));
         var2 = "CSS";
         break;
      case 6:
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
      this.mToolbar.setTitle("SQL");
      ((AdView)this.findViewById(2131624066)).loadAd((new Builder()).build());
      this.drawerFragment = (FragmentDrawer)this.getSupportFragmentManager().findFragmentById(2131624067);
      this.drawerFragment.setUp(2131624067, (DrawerLayout)this.findViewById(2131624061), this.mToolbar);
      this.drawerFragment.setDrawerListener(this);
      ((TextView)this.findViewById(2131624072)).setOnClickListener(new OnClickListener() {
         public void onClick(View var1) {
         }
      });
      String[] var2 = new String[]{"Chapter 1:Introduction", "Chapter 2:Syntax", "Chapter 3:Select Statement", "Chapter 4:Distinct Statement", "Chapter 5:Where Clause", "Chapter 6:And OR Operators", "Chapter 7:Order By Keyword", "Chapter 8:Insert Statement", "Chapter 9:Update Statement", "Chapter 10:Delete Statement", "Chapter 11:Like Operator", "Chapter 12:Join Operator", "Chapter 13:Union Operator", "Chapter 14:Not Null & Unique Constraint", "Chapter 15:Key\'s Constraint", "Chapter 16:Check & Default Constraint", "Chapter 17:Create View Statement", "Chapter 18:Data types", "Chapter 19:Functions", "Chapter 20:Avg and Count Function", "Chapter 21:First and Last Function", "Chapter 22:Max and Min Function", "Chapter 23:Group by Statement", "Chapter 24:Having Clause", "Chapter 25:Upper & LowerCase Function", "Chapter 26:Length Function", "Chapter 27:Format Function"};
      Integer[] var3 = new Integer[]{Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652), Integer.valueOf(2130837652)};
      CustomList var4 = new CustomList(this, var2, var3);
      this.list = (ListView)this.findViewById(2131624065);
      this.list.setAdapter(var4);
      this.list.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            switch(var3) {
            case 0:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql1.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 1:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql2.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 2:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql3.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 3:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql4.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 4:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql5.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 5:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql6.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 6:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql7.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 7:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql8.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 8:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql9.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 9:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql10.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 10:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql11.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 11:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql12.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 12:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql13.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 13:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql14.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 14:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql15.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 15:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql16.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 16:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql17.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 17:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql18.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 18:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql19.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 19:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql20.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 20:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql21.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 21:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql22.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 22:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql23.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 23:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql24.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 24:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql25.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 25:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql26.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
               return;
            case 26:
               SqlActivity.this.intent = new Intent(SqlActivity.this, WebActivity.class);
               SqlActivity.this.intent.putExtra("url", "file:///android_asset/sql_html/sql27.html");
               SqlActivity.this.startActivity(SqlActivity.this.intent);
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
