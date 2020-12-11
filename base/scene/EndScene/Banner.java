/*    */ package base.scene.EndScene;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.Setting;
/*    */ import base.Vector2D;
/*    */ import base.event.KeyEventPress;
/*    */ import base.scene.Scene;
/*    */ import base.scene.SceneManager;
/*    */ import base.scene.StageScene;
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import tklibs.SpriteUtils;
/*    */ 
/*    */ public class Banner
/*    */   extends GameObject {
/*    */   BufferedImage image;
/*    */   
/*    */   public Banner() {
/* 21 */     this.position = new Vector2D();
/* 22 */     this.image = SpriteUtils.loadImage("assets/images/scenes/end.png");
/* 23 */     this.position.x = 0.0F;
/* 24 */     this.position.y = 0.0F;
/* 25 */     this.anchor.setThis(Float.valueOf(0.0F), Float.valueOf(0.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 30 */     g.drawImage(this.image, (int)this.anchor.x, (int)this.anchor.y, null);
/* 31 */     g = this.image.getGraphics();
/* 32 */     Font f = new Font("TimesRoman", 50, 30);
/* 33 */     g.setFont(f);
/* 34 */     g.setColor(Color.RED);
/* 35 */     g.drawString("Your Score: " + Setting.SCORE, 260, 300);
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 40 */     if (KeyEventPress.isSpacePress)
/* 41 */       SceneManager.signNewScene((Scene)new StageScene()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\scene\EndScene\Banner.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */