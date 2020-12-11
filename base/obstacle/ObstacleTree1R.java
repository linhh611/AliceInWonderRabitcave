/*    */ package base.obstacle;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.Setting;
/*    */ import base.event.KeyEventPress;
/*    */ import base.physics.BoxCollider;
/*    */ import base.player.Player;
/*    */ import base.renderer.AnimationRenderer;
/*    */ import base.renderer.Renderer;
/*    */ 
/*    */ public class ObstacleTree1R extends Obstacle {
/*    */   boolean goOut;
/*    */   
/*    */   public ObstacleTree1R() {
/* 15 */     this.renderer = (Renderer)new AnimationRenderer(3, new String[] { "assets/images/obstacle/woodR/wood1.png", "assets/images/obstacle/woodR/wood2.png", "assets/images/obstacle/woodR/wood3.png", "assets/images/obstacle/woodR/wood4.png", "assets/images/obstacle/woodR/wood5.png", "assets/images/obstacle/woodR/wood6.png", "assets/images/obstacle/woodR/wood7.png", "assets/images/obstacle/woodR/wood8.png", "assets/images/obstacle/woodR/wood9.png", "assets/images/obstacle/woodR/wood10.png", "assets/images/obstacle/woodR/wood11.png", "assets/images/obstacle/woodR/wood12.png", "assets/images/obstacle/woodR/wood13.png", "assets/images/obstacle/woodR/wood14.png", "assets/images/obstacle/woodR/wood15.png", "assets/images/obstacle/woodR/wood16.png", "assets/images/obstacle/woodR/wood17.png", "assets/images/obstacle/woodR/wood18.png", "assets/images/obstacle/woodR/wood19.png", "assets/images/obstacle/woodR/wood20.png", "assets/images/obstacle/woodR/wood21.png", "assets/images/obstacle/woodR/wood22.png", "assets/images/obstacle/woodR/wood23.png", "assets/images/obstacle/woodR/wood24.png" });
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
/* 39 */     this.collider = new BoxCollider(150, 90);
/* 40 */     this.position.setThis(Float.valueOf(Setting.SCREEN_WIDTH), Float.valueOf(2000.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public void move() {
/* 45 */     float vx = 0.0F;
/*    */     
/* 47 */     if (this.goOut) {
/* 48 */       if (this.position.x < (Setting.SCREEN_WIDTH - this.collider.width + 50)) {
/* 49 */         this.goOut = false;
/*    */       }
/* 51 */       vx -= 5.0F;
/*    */     } else {
/*    */       
/* 54 */       if (this.position.x > (Setting.SCREEN_WIDTH + 30)) {
/* 55 */         this.goOut = true;
/*    */       }
/* 57 */       vx = 1.0F;
/*    */     } 
/*    */ 
/*    */     
/* 61 */     this.position.addThis(vx, 0.0F);
/*    */   }
/*    */ 
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


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\obstacle\ObstacleTree1R.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */