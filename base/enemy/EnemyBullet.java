/*     */ package base.enemy;
/*     */ 
/*     */ import base.GameObject;
/*     */ import base.SoundManager;
/*     */ import base.Vector2D;
/*     */ import base.counter.FrameCounter;
/*     */ import base.event.KeyEventPress;
/*     */ import base.physics.BoxCollider;
/*     */ import base.physics.Physics;
/*     */ import base.player.Player;
/*     */ import base.renderer.AnimationRenderer;
/*     */ import base.renderer.Renderer;
/*     */ import java.util.Random;
/*     */ 
/*     */ public class EnemyBullet
/*     */   extends GameObject implements Physics {
/*     */   BoxCollider collider;
/*     */   int damage;
/*  19 */   Random randomX = new Random();
/*  20 */   Random randomCount = new Random();
/*     */   
/*     */   Vector2D velocity;
/*     */   FrameCounter moveCounter;
/*     */   
/*     */   public EnemyBullet() {
/*  26 */     this.renderer = (Renderer)new AnimationRenderer(8, new String[] { "assets/images/bullet Smiley/Smiley1.png", "assets/images/bullet Smiley/Smiley2.png", "assets/images/bullet Smiley/Smiley3.png", "assets/images/bullet Smiley/Smiley4.png", "assets/images/bullet Smiley/Smiley5.png", "assets/images/bullet Smiley/Smiley6.png", "assets/images/bullet Smiley/Smiley8.png", "assets/images/bullet Smiley/Smiley7.png", "assets/images/bullet Smiley/Smiley9.png", "assets/images/bullet Smiley/Smiley10.png" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     this.position = new Vector2D(0.0F, 0.0F);
/*  37 */     this.collider = new BoxCollider(20, 20);
/*  38 */     this.velocity = new Vector2D();
/*  39 */     this.moveCounter = new FrameCounter(5);
/*  40 */     this.damage = 20;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void move(float velocityX, float velocityY) {
/*  46 */     if (this.moveCounter.run()) {
/*  47 */       if (velocityX == 0.0F && velocityY == 0.0F) {
/*  48 */         this.velocity.setThis(Float.valueOf(0.0F), Float.valueOf(0.0F));
/*     */       } else {
/*  50 */         this.velocity.setThis(Float.valueOf(velocityX), Float.valueOf(velocityY));
/*     */       } 
/*  52 */       this.moveCounter.reset();
/*  53 */       this.moveCounter.addMaxCount(this.randomCount.nextInt(115) + 5);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/*  60 */     Player player = (Player)GameObject.intersect(Player.class, this);
/*  61 */     if (player != null) {
/*     */       
/*  63 */       if (KeyEventPress.isUpPress) {
/*  64 */         if (player.playerHealth > 0) {
/*  65 */           player.takeDamage(this.damage);
/*  66 */           destroy();
/*  67 */           SoundManager.playSound("assets/music/sfx/pain-sound.wav");
/*     */         }
/*  69 */         else if (player.playerHealth == 0) {
/*  70 */           player.reportStatus();
/*  71 */           destroy();
/*  72 */           SoundManager.playSound("assets/music/sfx/whistle spin.wav");
/*     */         } 
/*     */       } else {
/*  75 */         destroy();
/*  76 */         SoundManager.playSound("assets/music/sfx/pop.wav");
/*     */       }
/*     */     
/*     */     }
/*  80 */     else if (this.position.y < -25.0F) {
/*  81 */       destroy();
/*     */     } 
/*     */     
/*  84 */     float vx = 0.0F, vy = 0.0F;
/*  85 */     if (KeyEventPress.isUpPress) {
/*     */       
/*  87 */       vx = (this.randomX.nextInt(8) - 3);
/*  88 */       vy = -5.0F;
/*     */     } else {
/*     */       
/*  91 */       vx = (this.randomX.nextInt(12) - 5);
/*  92 */       vy = -7.0F;
/*     */     } 
/*     */     
/*  95 */     move(vx, vy);
/*  96 */     this.position.addThis(this.velocity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void destroy() {
/* 101 */     super.destroy();
/* 102 */     BalloonExplosion balloonExplosion = (BalloonExplosion)GameObject.recycle(BalloonExplosion.class);
/* 103 */     balloonExplosion.position.setThis(this.position);
/*     */   }
/*     */ 
/*     */   
/*     */   public BoxCollider getBoxCollider() {
/* 108 */     return this.collider;
/*     */   }
/*     */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\enemy\EnemyBullet.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */