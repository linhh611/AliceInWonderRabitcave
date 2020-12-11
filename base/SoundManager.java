/*    */ package base;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import javax.sound.sampled.Clip;
/*    */ import tklibs.AudioUtils;
/*    */ 
/*    */ public class SoundManager
/*    */ {
/*  9 */   public static HashMap<String, Clip> sounds = new HashMap<>();
/*    */   
/*    */   public static void loadSounds(String... urls) {
/* 12 */     sounds.clear();
/* 13 */     for (String url : urls) {
/* 14 */       Clip sound = AudioUtils.loadSound(url);
/* 15 */       sounds.put(url, sound);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void playSound(String url) {
/* 20 */     Clip sound = sounds.get(url);
/* 21 */     if (sound != null)
/* 22 */       AudioUtils.playSound(sound); 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\SoundManager.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */