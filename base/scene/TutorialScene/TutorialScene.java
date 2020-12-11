/*    */ package base.scene.TutorialScene;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.scene.Scene;
/*    */ 
/*    */ public class TutorialScene
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


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\scene\TutorialScene\TutorialScene.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */