/*    */ package base.obstacle;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.event.KeyEventPress;
/*    */ import base.physics.BoxCollider;
/*    */ import base.physics.Physics;
/*    */ import base.player.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Obstacle
/*    */   extends GameObject
/*    */   implements Physics
/*    */ {
/*    */   BoxCollider collider;
/*    */   
/*    */   public BoxCollider getBoxCollider() {
/* 23 */     return this.collider;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 28 */     if (KeyEventPress.isUpPress) {
/* 29 */       this.position.addThis(0.0F, -2.0F);
/*    */     } else {
/* 31 */       this.position.addThis(0.0F, -6.0F);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 36 */     Player player = (Player)GameObject.intersect(Player.class, this);
/* 37 */     if (player != null) {
/* 38 */       player.destroy();
/*    */     }
/* 40 */     else if (this.position.y < -30.0F) {
/* 41 */       destroy();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\obstacle\Obstacle.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */