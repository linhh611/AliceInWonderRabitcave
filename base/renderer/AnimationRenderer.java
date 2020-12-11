/*    */ package base.renderer;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.counter.FrameCounter;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.util.ArrayList;
/*    */ import tklibs.SpriteUtils;
/*    */ 
/*    */ public class AnimationRenderer
/*    */   extends Renderer {
/*    */   ArrayList<BufferedImage> images;
/* 13 */   int currentImage = 0;
/*    */   FrameCounter frameCounter;
/*    */   boolean isOne;
/*    */   
/*    */   public AnimationRenderer(String... urls) {
/* 18 */     ArrayList<BufferedImage> images = SpriteUtils.loadImages(urls);
/* 19 */     this.images = images;
/* 20 */     this.frameCounter = new FrameCounter(5);
/*    */   }
/*    */   
/*    */   public AnimationRenderer(int framecount, String... urls) {
/* 24 */     ArrayList<BufferedImage> images = SpriteUtils.loadImages(urls);
/* 25 */     this.images = images;
/* 26 */     this.frameCounter = new FrameCounter(framecount);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AnimationRenderer(int frameCount, boolean isOnce, String... urls) {
/* 40 */     ArrayList<BufferedImage> images = SpriteUtils.loadImages(urls);
/* 41 */     this.images = images;
/* 42 */     this.frameCounter = new FrameCounter(frameCount);
/* 43 */     this.isOne = isOnce;
/*    */   }
/*    */   
/*    */   public AnimationRenderer(ArrayList<BufferedImage> images) {
/* 47 */     this.images = images;
/* 48 */     this.frameCounter = new FrameCounter(5);
/* 49 */     this.isOne = false;
/*    */   }
/*    */ 
/*    */   
/*    */   public AnimationRenderer(ArrayList<BufferedImage> images, int maxCount) {
/* 54 */     this.images = images;
/* 55 */     this.frameCounter = new FrameCounter(maxCount);
/* 56 */     this.isOne = false;
/*    */   }
/*    */   
/*    */   public AnimationRenderer(ArrayList<BufferedImage> images, int maxCount, boolean isOne) {
/* 60 */     this.images = images;
/* 61 */     this.frameCounter = new FrameCounter(maxCount);
/* 62 */     this.isOne = isOne;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g, GameObject master) {
/* 71 */     if (this.images.size() > 0) {
/*    */ 
/*    */       
/* 74 */       BufferedImage image = this.images.get(this.currentImage);
/*    */       
/* 76 */       double x = (master.position.x - image.getWidth() * master.anchor.x);
/* 77 */       double y = (master.position.y - image.getHeight() * master.anchor.y);
/* 78 */       g.drawImage(image, (int)x, (int)y, null);
/*    */       
/* 80 */       if (this.frameCounter.run()) {
/* 81 */         this.currentImage++;
/* 82 */         if (this.isOne && this.currentImage >= this.images.size() - 1) {
/* 83 */           master.destroy();
/*    */         }
/* 85 */         if (this.currentImage >= this.images.size() - 1) {
/* 86 */           this.currentImage = 0;
/*    */         }
/* 88 */         this.frameCounter.reset();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\renderer\AnimationRenderer.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */