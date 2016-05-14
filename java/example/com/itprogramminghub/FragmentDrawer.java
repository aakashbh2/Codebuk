package example.com.itprogramminghub;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.GestureDetector.SimpleOnGestureListener;
import example.com.itprogramminghub.NavDrawerItem;
import example.com.itprogramminghub.NavigationDrawerAdapter;
import java.util.ArrayList;
import java.util.List;

public class FragmentDrawer extends Fragment {
   private static String TAG = FragmentDrawer.class.getSimpleName();
   private static String[] titles = null;
   private NavigationDrawerAdapter adapter;
   private View containerView;
   private FragmentDrawer.FragmentDrawerListener drawerListener;
   private DrawerLayout mDrawerLayout;
   private ActionBarDrawerToggle mDrawerToggle;
   private RecyclerView recyclerView;

   public static List getData() {
      ArrayList var0 = new ArrayList();
      int[] var1 = new int[]{2130837602, 2130837631, 2130837595, 2130837646, 2130837603, 2130837597, 2130837652, 2130837644, 2130837650};

      for(int var2 = 0; var2 < titles.length; ++var2) {
         NavDrawerItem var3 = new NavDrawerItem();
         var3.setTitle(titles[var2]);
         var3.image_nav = var1[var2];
         var0.add(var3);
      }

      return var0;
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      titles = this.getActivity().getResources().getStringArray(2131492864);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2130968616, var2, false);
      this.recyclerView = (RecyclerView)var4.findViewById(2131624073);
      this.adapter = new NavigationDrawerAdapter(this.getActivity(), getData());
      this.recyclerView.setAdapter(this.adapter);
      this.recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
      this.recyclerView.addOnItemTouchListener(new FragmentDrawer.RecyclerTouchListener(this.getActivity(), this.recyclerView, new FragmentDrawer.ClickListener() {
         public void onClick(View var1, int var2) {
            FragmentDrawer.this.drawerListener.onDrawerItemSelected(var1, var2);
            FragmentDrawer.this.mDrawerLayout.closeDrawer(FragmentDrawer.this.containerView);
         }

         public void onLongClick(View var1, int var2) {
         }
      }));
      return var4;
   }

   public void setDrawerListener(FragmentDrawer.FragmentDrawerListener var1) {
      this.drawerListener = var1;
   }

   public void setUp(int var1, final DrawerLayout var2, final Toolbar var3) {
      this.containerView = this.getActivity().findViewById(var1);
      this.mDrawerLayout = var2;
      this.mDrawerToggle = new ActionBarDrawerToggle(this.getActivity(), var2, var3, 2131165258, 2131165257) {
         public void onDrawerClosed(View var1) {
            super.onDrawerClosed(var1);
            FragmentDrawer.this.getActivity().invalidateOptionsMenu();
         }

         public void onDrawerOpened(View var1) {
            super.onDrawerOpened(var1);
            FragmentDrawer.this.getActivity().invalidateOptionsMenu();
         }

         public void onDrawerSlide(View var1, float var2) {
            super.onDrawerSlide(var1, var2);
            var3.setAlpha(1.0F - var2 / 2.0F);
         }
      };
      this.mDrawerLayout.setDrawerListener(this.mDrawerToggle);
      this.mDrawerLayout.post(new Runnable() {
         public void run() {
            FragmentDrawer.this.mDrawerToggle.syncState();
         }
      });
   }

   public interface ClickListener {
      void onClick(View var1, int var2);

      void onLongClick(View var1, int var2);
   }

   public interface FragmentDrawerListener {
      void onDrawerItemSelected(View var1, int var2);
   }

   static class RecyclerTouchListener implements OnItemTouchListener {
      private FragmentDrawer.ClickListener clickListener;
      private GestureDetector gestureDetector;

      public RecyclerTouchListener(Context var1, final RecyclerView var2, final FragmentDrawer.ClickListener var3) {
         this.clickListener = var3;
         this.gestureDetector = new GestureDetector(var1, new SimpleOnGestureListener() {
            public void onLongPress(MotionEvent var1) {
               View var2x = var2.findChildViewUnder(var1.getX(), var1.getY());
               if(var2x != null && var3 != null) {
                  var3.onLongClick(var2x, var2.getChildPosition(var2x));
               }

            }

            public boolean onSingleTapUp(MotionEvent var1) {
               return true;
            }
         });
      }

      public boolean onInterceptTouchEvent(RecyclerView var1, MotionEvent var2) {
         View var3 = var1.findChildViewUnder(var2.getX(), var2.getY());
         if(var3 != null && this.clickListener != null && this.gestureDetector.onTouchEvent(var2)) {
            this.clickListener.onClick(var3, var1.getChildPosition(var3));
         }

         return false;
      }

      public void onRequestDisallowInterceptTouchEvent(boolean var1) {
      }

      public void onTouchEvent(RecyclerView var1, MotionEvent var2) {
      }
   }
}
