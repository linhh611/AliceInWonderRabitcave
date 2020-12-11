/*    */ package base.scene;
/*    */ 
/*    */ import base.counter.FrameCounter;
/*    */ 
/*    */ 
/*    */ public class SceneManager
/*    */ {
/*    */   public static Scene currentScene;
/*    */   public static Scene nextScene;
/*    */   public static FrameCounter sceneCount;
/*    */   
/*    */   public static void signNewScene(Scene scene, int frame) {
/* 13 */     nextScene = scene;
/* 14 */     sceneCount = new FrameCounter(frame);
/*    */   }
/*    */   
/*    */   public static void signNewScene(Scene scene) {
/* 18 */     nextScene = scene;
/* 19 */     sceneCount = new FrameCounter(0);
/*    */   }
/*    */   
/*    */   public static void changeSceneIfNeeded() {
/* 23 */     if (sceneCount.run()) {
/* 24 */       if (nextScene != null) {
/* 25 */         if (currentScene != null) {
/* 26 */           currentScene.destroy();
/* 27 */           sceneCount.reset();
/*    */         } 
/* 29 */         nextScene.init();
/* 30 */         currentScene = nextScene;
/* 31 */         nextScene = null;
/*    */       } 
/* 33 */       sceneCount.reset();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\scene\SceneManager.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */