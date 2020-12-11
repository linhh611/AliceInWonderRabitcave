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
/*    */ public class ObstacleCatR
/*    */   extends GameObject
/*    */   implements Physics
/*    */ {
/* 24 */   BoxCollider collider = new BoxCollider(97, 31);
/*    */   
/*    */   boolean goOut;
/*    */   
/*    */   public void move() {
/* 29 */     float vx = 0.0F;
/*    */     
/* 31 */     if (this.goOut) {
/* 32 */       if (this.position.x > 600.0F) {
/* 33 */         this.goOut = false;
/*    */       }
/* 35 */       vx += 4.0F;
/*    */     } else {
/*    */       
/* 38 */       if (this.position.x < 400.0F) {
/* 39 */         this.goOut = true;
/*    */       }
/* 41 */       vx -= 4.0F;
/*    */     } 
/*    */ 
/*    */     
/* 45 */     this.position.addThis(vx, 0.0F);
/*    */     
/* 47 */     if (this.position.y < 0.0F) {
/* 48 */       destroy();
/*    */     }
/*    */   }
/*    */   
/*    */   public float clamp(float number, float min, float max) {
/* 53 */     return (number < min) ? min : ((number > max) ? max : number);
/*    */   }
/*    */ 
/*    */   
/*    */   public BoxCollider getBoxCollider() {
/* 58 */     return this.collider;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 63 */     if (KeyEventPress.isUpPress) {
/* 64 */       this.position.subtractThis(0.0F, 3.0F);
/*    */     } else {
/* 66 */       this.position.subtractThis(0.0F, 5.0F);
/*    */     } 
/*    */     
/* 69 */     move();
/*    */ 
/*    */     
/* 72 */     Player player = (Player)GameObject.intersect(Player.class, this);
/* 73 */     if (player != null) {
/* 74 */       player.destroy();
/*    */     }
/* 76 */     else if (this.position.y < 0.0F) {
/* 77 */       destroy();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\obstacle\ObstacleCatR.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */