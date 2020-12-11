/*    */ package base.player;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.event.KeyEventPress;
/*    */ import base.renderer.AnimationRenderer;
/*    */ import base.renderer.Renderer;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlayerAnimator
/*    */   extends Renderer
/*    */ {
/* 18 */   Renderer straightAnimation = (Renderer)new AnimationRenderer(7, new String[] { "assets/images/Alice-Straight/Straight/Alice_Straight1.png", "assets/images/Alice-Straight/Straight/Alice_Straight2.png", "assets/images/Alice-Straight/Straight/Alice_Straight3.png", "assets/images/Alice-Straight/Straight/Alice_Straight4.png", "assets/images/Alice-Straight/Straight/Alice_Straight5.png", "assets/images/Alice-Straight/Straight/Alice_Straight6.png", "assets/images/Alice-Straight/Straight/Alice_Straight7.png" });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   Renderer bullet = (Renderer)new AnimationRenderer(new String[] { "assets/images/Alice-attack/Attack/Sprite-0001.png", "assets/images/Alice-attack/Attack/Sprite-0002.png", "assets/images/Alice-attack/Attack/Sprite-0003.png", "assets/images/Alice-attack/Attack/Sprite-0004.png", "assets/images/Alice-attack/Attack/Sprite-0005.png", "assets/images/Alice-attack/Attack/Sprite-0006.png", "assets/images/Alice-attack/Attack/Sprite-0007.png", "assets/images/Alice-attack/Attack/Sprite-0008.png", "assets/images/Alice-attack/Attack/Sprite-0009.png", "assets/images/Alice-attack/Attack/Sprite-0010.png", "assets/images/Alice-attack/Attack/Sprite-0011.png", "assets/images/Alice-attack/Attack/Sprite-0012.png", "assets/images/Alice-attack/Attack/Sprite-0013.png", "assets/images/Alice-attack/Attack/Sprite-0014.png", "assets/images/Alice-attack/Attack/Sprite-0015.png", "assets/images/Alice-attack/Attack/Sprite-0016.png", "assets/images/Alice-attack/Attack/Sprite-0017.png", "assets/images/Alice-attack/Attack/Sprite-0018.png", "assets/images/Alice-attack/Attack/Sprite-0019.png", "assets/images/Alice-attack/Attack/Sprite-0020.png" });
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
/* 49 */   Renderer leftAnimation = (Renderer)new AnimationRenderer(new String[] { "assets/images/players/left/0.png", "assets/images/players/left/1.png", "assets/images/players/left/2.png", "assets/images/players/left/3.png", "assets/images/players/left/4.png", "assets/images/players/left/5.png" });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 57 */   Renderer rightAnimation = (Renderer)new AnimationRenderer(new String[] { "assets/images/players/right/0.png", "assets/images/players/right/1.png", "assets/images/players/right/2.png", "assets/images/players/right/3.png", "assets/images/players/right/4.png", "assets/images/players/right/5.png" });
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
/*    */   public void render(Graphics g, GameObject master) {
/* 69 */     Player player = (Player)master;
/* 70 */     if (KeyEventPress.isUpPress) {
/* 71 */       this.straightAnimation.render(g, master);
/*    */     }
/* 73 */     else if (!KeyEventPress.isUpPress) {
/* 74 */       this.bullet.render(g, master);
/*    */     }
/* 76 */     else if (player.velocity.x < 0.0F) {
/* 77 */       this.rightAnimation.render(g, master);
/*    */     } else {
/*    */       
/* 80 */       this.straightAnimation.render(g, master);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\player\PlayerAnimator.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */