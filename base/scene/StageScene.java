/*    */ package base.scene;
/*    */ 
/*    */ import base.Background;
/*    */ import base.GameObject;
/*    */ import base.SoundManager;
/*    */ import base.enemy.EnemyManager;
/*    */ import base.obstacle.ObstacleManager;
/*    */ import base.player.Player;
/*    */ import tklibs.AudioUtils;
/*    */ 
/*    */ 
/*    */ public class StageScene
/*    */   extends Scene
/*    */ {
/*    */   public void init() {
/* 16 */     GameObject.recycle(Background.class);
/* 17 */     GameObject.recycle(Player.class);
/* 18 */     GameObject.recycle(EnemyManager.class);
/* 19 */     GameObject.recycle(ObstacleManager.class);
/*    */     
/* 21 */     String[] urls = { "assets/music/sfx/enemy-explosion.wav", "assets/music/sfx/whoosh.wav", "assets/music/sfx/pop.wav", "assets/music/sfx/whistle spin.wav", "assets/music/sfx/Cartoon sound effects bangs 1.wav", "assets/music/sfx/pain-sound.wav" };
/*    */ 
/*    */ 
/*    */     
/* 25 */     SoundManager.loadSounds(urls);
/* 26 */     AudioUtils.playMedia(AudioUtils.loadMedia("assets/music/sfx/background.mp3"));
/*    */   }
/*    */ 
/*    */   
/*    */   public void destroy() {
/* 31 */     GameObject.clearAll();
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\scene\StageScene.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */