package example.com.itprogramminghub;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import example.com.itprogramminghub.CppActivity;
import example.com.itprogramminghub.CssActivity;
import example.com.itprogramminghub.Data;
import example.com.itprogramminghub.HtmlActivity;
import example.com.itprogramminghub.JavaActivity;
import example.com.itprogramminghub.PhpActivity;
import example.com.itprogramminghub.SqlActivity;
import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends Adapter {
   Context context;
   LayoutInflater layoutInflater;
   List mItems;

   public CardAdapter(Context var1) {
      this.context = var1;
      this.layoutInflater = (LayoutInflater)var1.getSystemService("layout_inflater");
      this.mItems = new ArrayList();
      new Data();
      Data var3 = new Data();
      var3.setmName("JAVA");
      var3.setmDesc("•No.1 Development Platform\n•1 Billion Java Downloads per Year\n•3 Billion devices run on Java\n•Compile Once,Run anywhere");
      var3.setmImage(2130837632);
      this.mItems.add(var3);
      Data var5 = new Data();
      var5.setmDesc("•Object Oriented Programming\n•Supports Multiple Inheritance\n•Structured Programming\n•Preprocessing before Compilation");
      var5.setmName("C++");
      var5.setmImage(2130837596);
      this.mItems.add(var5);
      Data var7 = new Data();
      var7.setmName("PHP");
      var7.setmDesc("•Include MediaWiki , WordPress , the user-facing portion \nof Facebook\n•Cross Platform Compatibility\n•Extensive Pattern Matching ");
      var7.setmImage(2130837647);
      this.mItems.add(var7);
      Data var9 = new Data();
      var9.setmName("HTML");
      var9.setmDesc("•Embed Video Without third-party Proprietary\n•No Need for a Plug-in\n•Enables a Web Application to Execute Complex Tasks Independently");
      var9.setmImage(2130837604);
      this.mItems.add(var9);
      Data var11 = new Data();
      var11.setmName("CSS");
      var11.setmDesc("•Separation of content and presentation\n•Smaller webpage file sizes\n•Improved rendering speed\n•Table-less Layout\n•Customisation");
      var11.setmImage(2130837598);
      this.mItems.add(var11);
      Data var13 = new Data();
      var13.setmName("SQL");
      var13.setmDesc("•Relational Database System\n•Client/Server Architecture\n•SQL has Platform Independence\n•Stored Procedures and Triggers");
      var13.setmImage(2130837653);
      this.mItems.add(var13);
   }

   public int getItemCount() {
      return this.mItems.size();
   }

   public void onBindViewHolder(CardAdapter.ViewHolder var1, int var2) {
      Data var3 = (Data)this.mItems.get(var2);
      var1.name.setText(var3.getmName());
      var1.image.setImageResource(var3.getmImage());
      var1.desc.setText(var3.getmDesc());
   }

   public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
      return new CardAdapter.ViewHolder(LayoutInflater.from(var1.getContext()).inflate(2130968632, var1, false));
   }

   class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements OnClickListener {
      public TextView desc;
      public ImageView image;
      public TextView name;
      public View view;

      public ViewHolder(View var2) {
         super(var2);
         this.image = (ImageView)var2.findViewById(2131624105);
         this.name = (TextView)var2.findViewById(2131624106);
         this.desc = (TextView)var2.findViewById(2131624108);
         this.image.setOnClickListener(this);
         this.name.setOnClickListener(this);
         this.desc.setOnClickListener(this);
      }

      public void onClick(View var1) {
         switch(this.getPosition()) {
         case 0:
            CardAdapter.this.context.startActivity(new Intent(CardAdapter.this.context, JavaActivity.class));
            return;
         case 1:
            CardAdapter.this.context.startActivity(new Intent(CardAdapter.this.context, CppActivity.class));
            return;
         case 2:
            CardAdapter.this.context.startActivity(new Intent(CardAdapter.this.context, PhpActivity.class));
            return;
         case 3:
            CardAdapter.this.context.startActivity(new Intent(CardAdapter.this.context, HtmlActivity.class));
            return;
         case 4:
            CardAdapter.this.context.startActivity(new Intent(CardAdapter.this.context, CssActivity.class));
            return;
         case 5:
            CardAdapter.this.context.startActivity(new Intent(CardAdapter.this.context, SqlActivity.class));
            return;
         default:
         }
      }
   }
}
