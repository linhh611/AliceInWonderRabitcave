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
/*    */ public class ObstacleTree1L
/*    */   extends Obstacle
/*    */   implements Physics
/*    */ {
/*    */   boolean goOut;
/*    */   
/*    */   public void move() {
/* 41 */     float vx = 0.0F;
/*    */     
/* 43 */     if (this.goOut) {
/* 44 */       if (this.position.x > 80.0F) {
/* 45 */         this.goOut = false;
/*    */       }
/* 47 */       vx += 6.0F;
/*    */     } else {
/*    */       
/* 50 */       if (this.position.x < -this.collider.width) {
/* 51 */         this.goOut = true;
/*    */       }
/* 53 */       vx = -1.0F;
/*    */     } 
/*    */ 
/*    */     
/* 57 */     this.position.addThis(vx, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public float clamp(float number, float min, float max) {
/* 62 */     return (number < min) ? min : ((number > max) ? max : number);
/*    */   }
/*    */ 
/*    */   
/*    */   public BoxCollider getBoxCollider() {
/* 67 */     return this.collider;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 72 */     if (KeyEventPress.isUpPress) {
/* 73 */       this.position.subtractThis(0.0F, 2.0F);
/*    */     } else {
/* 75 */       this.position.subtractThis(0.0F, 5.0F);
/*    */     } 
/*    */     
/* 78 */     move();
/*    */ 
/*    */     
/* 81 */     Player player = (Player)GameObject.intersect(Player.class, this);
/* 82 */     if (player != null) {
/* 83 */       player.destroy();
/*    */     }
/* 85 */     else if (this.position.y < -25.0F) {
/* 86 */       destroy();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\obstacle\ObstacleTree1L.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */