package example.com.itprogramminghub;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import example.com.itprogramminghub.NavDrawerItem;
import java.util.Collections;
import java.util.List;

public class NavigationDrawerAdapter extends Adapter {
   private Context context;
   List data = Collections.emptyList();
   private LayoutInflater inflater;

   public NavigationDrawerAdapter(Context var1, List var2) {
      this.context = var1;
      this.inflater = LayoutInflater.from(var1);
      this.data = var2;
   }

   public void delete(int var1) {
      this.data.remove(var1);
      this.notifyItemRemoved(var1);
   }

   public int getItemCount() {
      return this.data.size();
   }

   public void onBindViewHolder(NavigationDrawerAdapter.MyViewHolder var1, int var2) {
      NavDrawerItem var3 = (NavDrawerItem)this.data.get(var2);
      var1.title.setText(var3.getTitle());
      var1.image.setImageResource(var3.image_nav);
   }

   public NavigationDrawerAdapter.MyViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
      return new NavigationDrawerAdapter.MyViewHolder(this.inflater.inflate(2130968623, var1, false));
   }

   class MyViewHolder extends ViewHolder {
      ImageView image;
      TextView title;

      public MyViewHolder(View var2) {
         super(var2);
         this.image = (ImageView)var2.findViewById(2131624090);
         this.title = (TextView)var2.findViewById(2131624026);
      }
   }
}
