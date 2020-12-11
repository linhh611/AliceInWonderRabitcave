/*    */ package base.scene.welcomeScene;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.Vector2D;
/*    */ import base.event.KeyEventPress;
/*    */ import base.renderer.Renderer;
/*    */ import base.renderer.SingleImageRenderer;
/*    */ import base.scene.Scene;
/*    */ import base.scene.SceneManager;
/*    */ import base.scene.StageScene;
/*    */ import base.scene.TutorialScene.TutorialScene;
/*    */ import tklibs.SpriteUtils;
/*    */ 
/*    */ public class Banner extends GameObject {
/*    */   public Banner() {
/* 16 */     this.renderer = (Renderer)new SingleImageRenderer(SpriteUtils.loadImage("assets/images/scenes/welcome.png"));
/* 17 */     this.position = new Vector2D();
/* 18 */     this.position.x = 0.0F;
/* 19 */     this.position.y = 0.0F;
/* 20 */     this.anchor.setThis(Float.valueOf(0.0F), Float.valueOf(0.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 25 */     if (KeyEventPress.isAnyKey) {
/* 26 */       SceneManager.signNewScene((Scene)new StageScene());
/* 27 */     } else if (KeyEventPress.isEscPress) {
/* 28 */       SceneManager.signNewScene((Scene)new TutorialScene());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\scene\welcomeScene\Banner.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */