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
import example.com.itprogramminghub.CustomList;
import example.com.itprogramminghub.FragmentDrawer;
import example.com.itprogramminghub.HtmlActivity;
import example.com.itprogramminghub.JavaActivity;
import example.com.itprogramminghub.MainActivity;
import example.com.itprogramminghub.PhpActivity;
import example.com.itprogramminghub.RateActivity;
import example.com.itprogramminghub.SqlActivity;
import example.com.itprogramminghub.WebActivity;

public class CssActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {
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
      this.mToolbar.setTitle("CSS");
      ((AdView)this.findViewById(2131624066)).loadAd((new Builder()).build());
      this.drawerFragment = (FragmentDrawer)this.getSupportFragmentManager().findFragmentById(2131624067);
      this.drawerFragment.setUp(2131624067, (DrawerLayout)this.findViewById(2131624061), this.mToolbar);
      this.drawerFragment.setDrawerListener(this);
      ((TextView)this.findViewById(2131624072)).setOnClickListener(new OnClickListener() {
         public void onClick(View var1) {
         }
      });
      String[] var2 = new String[]{"Chapter 1:CSS Indroduction", "Chapter 2:Cascading Style Sheet", "Chapter 3:Applying CSS", "Chapter 4:Selectors, Properties, and Values ", "Chapter 5:Colors", "Chapter 6:Text", "Chapter 7:Margins and Padding", "Chapter 8:Borders", "Chapter 9:CSS Beginner Tutorial", "Chapter 10:Class and ID Selectors", "Chapter 11:Grouping and Nesting", "Chapter 12:Pseudo Classes", "Chapter 13:Shorthand Properties", "Chapter 14:Background Images", "Chapter 15:The Display Property", "Chapter 16:Page Layout", "Chapter 17:At-Rules", "Chapter 18:Specificity", "Chapter 19:Pseudo Elements", "Chapter 20:Advance CSS"};
      Integer[] var3 = new Integer[]{Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597), Integer.valueOf(2130837597)};
      CustomList var4 = new CustomList(this, var2, var3);
      this.list = (ListView)this.findViewById(2131624065);
      this.list.setAdapter(var4);
      this.list.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            switch(var3) {
            case 0:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css0.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 1:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css1.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 2:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css2.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 3:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css3.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 4:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css4.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 5:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css5.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 6:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css6.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 7:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css7.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 8:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css8.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 9:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css9.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 10:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css10.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 11:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css11.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 12:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css12.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 13:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css13.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 14:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css14.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 15:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css15.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 16:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css16.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 17:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css17.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 18:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css18.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
               return;
            case 19:
               CssActivity.this.intent = new Intent(CssActivity.this, WebActivity.class);
               CssActivity.this.intent.putExtra("url", "file:///android_asset/css_html/css19.html");
               CssActivity.this.startActivity(CssActivity.this.intent);
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
