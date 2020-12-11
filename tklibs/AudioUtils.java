/*    */ package tklibs;
/*    */ 
/*    */ import java.io.File;
/*    */ import javafx.embed.swing.JFXPanel;
/*    */ import javafx.scene.media.Media;
/*    */ import javafx.scene.media.MediaPlayer;
/*    */ import javax.sound.sampled.AudioInputStream;
/*    */ import javax.sound.sampled.AudioSystem;
/*    */ import javax.sound.sampled.Clip;
/*    */ import javax.sound.sampled.UnsupportedAudioFileException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AudioUtils
/*    */ {
/*    */   public static Clip loadSound(String audioUrl) {
/* 22 */     File soundFile = new File(audioUrl);
/*    */     try {
/* 24 */       AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
/* 25 */       Clip clip = AudioSystem.getClip();
/* 26 */       clip.open(audioIn);
/* 27 */       return clip;
/* 28 */     } catch (UnsupportedAudioFileException|java.io.IOException|javax.sound.sampled.LineUnavailableException e) {
/* 29 */       e.printStackTrace();
/*    */       
/* 31 */       return null;
/*    */     } 
/*    */   }
/*    */   public static void playSound(Clip sound) {
/* 35 */     sound.setFramePosition(0);
/* 36 */     sound.start();
/*    */   }
/*    */   
/*    */   public static void initialize() {
/* 40 */     new JFXPanel();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static MediaPlayer loadMedia(String audioUrl) {
/* 49 */     String uriString = (new File(audioUrl)).toURI().toString();
/* 50 */     MediaPlayer mediaPlayer = new MediaPlayer(new Media(uriString));
/* 51 */     mediaPlayer.setAutoPlay(true);
/* 52 */     return mediaPlayer;
/*    */   }
/*    */   
/*    */   public static void playMedia(MediaPlayer media) {
/* 56 */     media.play();
/*    */   }
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 61 */     Clip sound = loadSound("assets/music/sfx/enemy-explosion.wav");
/* 62 */     playSound(sound);
/*    */ 
/*    */     
/* 65 */     initialize();
/* 66 */     MediaPlayer media = loadMedia("assets/music/bgm/ending.mp3");
/* 67 */     playMedia(media);
/*    */     while (true);
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\tklibs\AudioUtils.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */