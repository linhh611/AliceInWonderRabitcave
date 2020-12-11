/*    */ package tklibs;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import javax.imageio.ImageIO;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SpriteUtils
/*    */ {
/* 15 */   public static HashMap<String, BufferedImage> images = new HashMap<>();
/*    */ 
/*    */   
/*    */   public static BufferedImage loadImage(String url) {
/* 19 */     BufferedImage image = images.get(url);
/* 20 */     if (image != null) {
/* 21 */       return image;
/*    */     }
/*    */     try {
/* 24 */       return ImageIO.read(new File(url));
/* 25 */     } catch (IOException e) {
/* 26 */       e.printStackTrace();
/*    */       
/* 28 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static ArrayList<BufferedImage> loadImages(String... urls) {
/* 34 */     ArrayList<BufferedImage> images = new ArrayList<>();
/* 35 */     for (String url : urls) {
/* 36 */       BufferedImage image = loadImage(url);
/* 37 */       if (image != null) {
/* 38 */         images.add(image);
/*    */       }
/*    */     } 
/* 41 */     return images;
/*    */   }
/*    */   
/*    */   public static void renderAtCenter(Graphics graphics, BufferedImage image, double x, double y) {
/* 45 */     graphics.drawImage(image, (int)(x - image.getWidth() / 2.0D), (int)(y - image.getHeight() / 2.0D), null);
/*    */   }
/*    */   
/*    */   public static BufferedImage maskWhite(BufferedImage image) {
/* 49 */     BufferedImage returnImage = new BufferedImage(image.getWidth(), image.getHeight(), 2);
/* 50 */     for (int y = 0; y < image.getHeight(); y++) {
/* 51 */       for (int x = 0; x < image.getWidth(); x++) {
/* 52 */         int color = image.getRGB(x, y);
/* 53 */         int alpha = color & 0xFF000000;
/* 54 */         if (alpha != 0) {
/* 55 */           returnImage.setRGB(x, y, color | 0xFFFFFF | alpha);
/*    */         } else {
/* 57 */           returnImage.setRGB(x, y, color);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 62 */     return returnImage;
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\tklibs\SpriteUtils.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */