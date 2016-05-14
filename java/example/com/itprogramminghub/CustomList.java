package example.com.itprogramminghub;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter {
   private final Activity context;
   private final Integer[] imageId;
   private final String[] web;

   public CustomList(Activity var1, String[] var2, Integer[] var3) {
      super(var1, 2130968622, var2);
      this.context = var1;
      this.web = var2;
      this.imageId = var3;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      View var4 = this.context.getLayoutInflater().inflate(2130968622, (ViewGroup)null, true);
      TextView var5 = (TextView)var4.findViewById(2131624089);
      ImageView var6 = (ImageView)var4.findViewById(2131624025);
      var5.setText(this.web[var1]);
      var6.setImageResource(this.imageId[var1].intValue());
      return var4;
   }
}
