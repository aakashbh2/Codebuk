package example.com.itprogramminghub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import example.com.itprogramminghub.CardAdapter;
import example.com.itprogramminghub.CppActivity;
import example.com.itprogramminghub.CssActivity;
import example.com.itprogramminghub.FragmentDrawer;
import example.com.itprogramminghub.HtmlActivity;
import example.com.itprogramminghub.JavaActivity;
import example.com.itprogramminghub.PhpActivity;
import example.com.itprogramminghub.RateActivity;
import example.com.itprogramminghub.SqlActivity;

public class MainActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {
   private static String TAG = MainActivity.class.getSimpleName();
   private FragmentDrawer drawerFragment;
   private Toolbar mToolbar;

   private void displayView(int var1) {
      String var2 = this.getString(2131165246);
      switch(var1) {
      case 0:
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
      this.setContentView(2130968605);
      RecyclerView var2 = (RecyclerView)this.findViewById(2131624068);
      var2.setHasFixedSize(true);
      var2.setLayoutManager(new LinearLayoutManager(this));
      var2.setAdapter(new CardAdapter(this));
      this.mToolbar = (Toolbar)this.findViewById(2131624063);
      this.mToolbar.setTitle("HOME");
      this.drawerFragment = (FragmentDrawer)this.getSupportFragmentManager().findFragmentById(2131624067);
      this.drawerFragment.setUp(2131624067, (DrawerLayout)this.findViewById(2131624061), this.mToolbar);
      this.drawerFragment.setDrawerListener(this);
      ((TextView)this.findViewById(2131624072)).setOnClickListener(new OnClickListener() {
         public void onClick(View var1) {
         }
      });
      this.displayView(0);
   }

   public boolean onCreateOptionsMenu(Menu var1) {
      this.getMenuInflater().inflate(2131689479, var1);
      return true;
   }

   public void onDrawerItemSelected(View var1, int var2) {
      this.displayView(var2);
   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      return var1.getItemId() == 2131624109?true:super.onOptionsItemSelected(var1);
   }
}
