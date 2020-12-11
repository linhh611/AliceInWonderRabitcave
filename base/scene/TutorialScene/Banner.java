/*    */ package base.scene.TutorialScene;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.Vector2D;
/*    */ import base.event.KeyEventPress;
/*    */ import base.renderer.Renderer;
/*    */ import base.renderer.SingleImageRenderer;
/*    */ import base.scene.Scene;
/*    */ import base.scene.SceneManager;
/*    */ import base.scene.StageScene;
/*    */ import tklibs.SpriteUtils;
/*    */ 
/*    */ public class Banner extends GameObject {
/*    */   public Banner() {
/* 15 */     this.renderer = (Renderer)new SingleImageRenderer(SpriteUtils.loadImage("assets/images/scenes/tutorial.png"));
/* 16 */     this.position = new Vector2D();
/* 17 */     this.position.x = 0.0F;
/* 18 */     this.position.y = 0.0F;
/* 19 */     this.anchor.setThis(Float.valueOf(0.0F), Float.valueOf(0.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 24 */     if (KeyEventPress.isAnyKey)
/* 25 */       SceneManager.signNewScene((Scene)new StageScene()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\scene\TutorialScene\Banner.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */