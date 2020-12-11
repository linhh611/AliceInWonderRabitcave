/*    */ package base;
/*    */ 
/*    */ import base.event.KeyEventPress;
/*    */ import base.renderer.Renderer;
/*    */ import base.renderer.SingleImageRenderer;
/*    */ import java.awt.Graphics;
/*    */ import tklibs.SpriteUtils;
/*    */ 
/*    */ public class Background
/*    */   extends GameObject
/*    */ {
/*    */   public Background() {
/* 13 */     this.image = SpriteUtils.loadImage("assets/images/background/BG.png");
/* 14 */     this.renderer = (Renderer)new SingleImageRenderer(this.image);
/* 15 */     this.position = new Vector2D();
/*    */     
/* 17 */     this.position.x = 0.0F;
/* 18 */     this.position.y = 0.0F;
/* 19 */     this.anchor.setThis(Float.valueOf(0.0F), Float.valueOf(0.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getImageWidth() {
/* 24 */     return this.image.getWidth();
/*    */   }
/*    */   
/*    */   public int getImageHeight() {
/* 28 */     return this.image.getHeight();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 34 */     g.drawImage(this.image, (int)this.position.x, (int)this.position.y, null);
/* 35 */     g.drawImage(this.image, (int)this.position.x, (int)this.position.y + 1000, null);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/* 41 */     if (this.position.y > -(this.image.getHeight() - Setting.SCREEN_HEIGHT - 100)) {
/* 42 */       if (KeyEventPress.isUpPress) {
/* 43 */         this.position.subtractThis(0.0F, 2.0F);
/*    */       } else {
/*    */         
/* 46 */         this.position.subtractThis(0.0F, 5.0F);
/*    */       } 
/*    */     } else {
/*    */       
/* 50 */       this.position.setThis(Float.valueOf(0.0F), Float.valueOf(0.0F));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\Background.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */