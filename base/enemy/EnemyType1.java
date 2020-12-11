/*    */ package base.enemy;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.SoundManager;
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
/*    */ public class EnemyType1
/*    */   extends Enemy
/*    */ {
/*    */   public void takeDamage(int damage) {
/* 28 */     if (damage > 0) {
/* 29 */       destroy();
/* 30 */       SoundManager.playSound("assets/music/sfx/enemy-explosion.wav");
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void destroy() {
/* 36 */     super.destroy();
/* 37 */     Explosion explosion = (Explosion)GameObject.recycle(Explosion.class);
/* 38 */     explosion.position.setThis(this.position);
/*    */   }
/*    */ 
/*    */   
/*    */   public void shoot() {
/* 43 */     super.shoot();
/* 44 */     SoundManager.playSound("assets/music/sfx/whoosh.wav");
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\enemy\EnemyType1.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */