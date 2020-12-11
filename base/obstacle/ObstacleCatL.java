/*    */ package base.obstacle;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.event.KeyEventPress;
/*    */ import base.physics.BoxCollider;
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
/*    */ public class ObstacleCatL
/*    */   extends Obstacle
/*    */ {
/*    */   boolean goOut;
/*    */   
/*    */   public void move() {
/* 28 */     float vx = 0.0F;
/*    */     
/* 30 */     if (this.goOut) {
/* 31 */       if (this.position.x > 250.0F) {
/* 32 */         this.goOut = false;
/*    */       }
/* 34 */       vx += 4.0F;
/*    */     } else {
/*    */       
/* 37 */       if (this.position.x < 100.0F) {
/* 38 */         this.goOut = true;
/*    */       }
/* 40 */       vx -= 4.0F;
/*    */     } 
/*    */ 
/*    */     
/* 44 */     this.position.addThis(vx, 0.0F);
/*    */     
/* 46 */     if (this.position.y < 0.0F) {
/* 47 */       destroy();
/*    */     }
/*    */   }
/*    */   
/*    */   public float clamp(float number, float min, float max) {
/* 52 */     return (number < min) ? min : ((number > max) ? max : number);
/*    */   }
/*    */ 
/*    */   
/*    */   public BoxCollider getBoxCollider() {
/* 57 */     return this.collider;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 62 */     if (KeyEventPress.isUpPress) {
/* 63 */       this.position.subtractThis(0.0F, 3.0F);
/*    */     } else {
/* 65 */       this.position.subtractThis(0.0F, 5.0F);
/*    */     } 
/*    */     
/* 68 */     move();
/*    */ 
/*    */     
/* 71 */     Player player = (Player)GameObject.intersect(Player.class, this);
/* 72 */     if (player != null) {
/* 73 */       player.destroy();
/*    */     }
/* 75 */     else if (this.position.y < 0.0F) {
/* 76 */       destroy();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\obstacle\ObstacleCatL.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */