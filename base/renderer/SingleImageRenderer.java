/*    */ package base.renderer;
/*    */ 
/*    */ import base.GameObject;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import tklibs.SpriteUtils;
/*    */ 
/*    */ public class SingleImageRenderer
/*    */   extends Renderer {
/*    */   BufferedImage image;
/*    */   
/*    */   public SingleImageRenderer(String url) {
/* 13 */     this.image = SpriteUtils.loadImage(url);
/*    */   } public SingleImageRenderer(BufferedImage image) {
/* 15 */     this.image = image;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g, GameObject master) {
/* 21 */     double x = (master.position.x - this.image.getWidth() * master.anchor.x);
/* 22 */     double y = (master.position.y - this.image.getHeight() * master.anchor.y);
/* 23 */     g.drawImage(this.image, (int)x, (int)y, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\renderer\SingleImageRenderer.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */