/*    */ package game;
/*    */ 
/*    */ import base.Background;
/*    */ import base.GameObject;
/*    */ import base.enemy.EnemyManager;
/*    */ import base.obstacle.Obstacle;
/*    */ import base.obstacle.ObstacleManager;
/*    */ import base.obstacle.ObstacleTree1L;
/*    */ import base.player.Player;
/*    */ import base.scene.Scene;
/*    */ import base.scene.SceneManager;
/*    */ import base.scene.welcomeScene.WelcomeScene;
/*    */ import java.awt.Graphics;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class GameCanvas
/*    */   extends JPanel
/*    */ {
/*    */   Background background;
/*    */   Player player;
/*    */   EnemyManager enemyManager;
/*    */   Obstacle obstacle;
/*    */   ObstacleTree1L obstacleType1;
/*    */   ObstacleManager obstacleManager;
/*    */   
/*    */   public GameCanvas() {
/* 27 */     SceneManager.signNewScene((Scene)new WelcomeScene());
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/* 45 */     GameObject.runAll();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render() {
/* 54 */     GameObject.renderAllToBackBuffer();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void paintComponent(Graphics g) {
/* 65 */     GameObject.renderBackBufferToGame(g);
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\game\GameCanvas.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */