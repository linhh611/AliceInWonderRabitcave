/*    */ package base.scene.EndScene;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.scene.Scene;
/*    */ 
/*    */ public class EndScene
/*    */   extends Scene {
/*    */   public void init() {
/*  9 */     GameObject.recycle(Banner.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public void destroy() {
/* 14 */     GameObject.clearAll();
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\scene\EndScene\EndScene.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */