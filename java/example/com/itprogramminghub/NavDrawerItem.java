package example.com.itprogramminghub;

public class NavDrawerItem {
   public int image_nav;
   private boolean showNotify;
   private String title;

   public NavDrawerItem() {
   }

   public NavDrawerItem(boolean var1, String var2) {
      this.showNotify = var1;
      this.title = var2;
   }

   public String getTitle() {
      return this.title;
   }

   public boolean isShowNotify() {
      return this.showNotify;
   }

   public void setShowNotify(boolean var1) {
      this.showNotify = var1;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }
}
