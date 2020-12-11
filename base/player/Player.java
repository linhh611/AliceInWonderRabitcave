/*     */ package base.player;
/*     */ 
/*     */ import base.GameObject;
/*     */ import base.Setting;
/*     */ import base.SoundManager;
/*     */ import base.Vector2D;
/*     */ import base.counter.FrameCounter;
/*     */ import base.event.KeyEventPress;
/*     */ import base.physics.BoxCollider;
/*     */ import base.physics.Physics;
/*     */ import base.scene.EndScene.EndScene;
/*     */ import base.scene.Scene;
/*     */ import base.scene.SceneManager;
/*     */ import base.score.Score;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Player
/*     */   extends GameObject
/*     */   implements Physics
/*     */ {
/*     */   FrameCounter fireCounter;
/*     */   FrameCounter scoreCounter;
/*     */   FrameCounter dieCounter;
/*     */   BoxCollider collider;
/*     */   Vector2D velocity;
/*     */   public Score score;
/*     */   public int playerHealth;
/*     */   
/*     */   public Player() {
/*  32 */     this.renderer = new PlayerAnimator();
/*     */     
/*  34 */     this.position = new Vector2D();
/*  35 */     this.position.x = Setting.START_PLAYER_POSITION_X;
/*  36 */     this.position.y = Setting.START_PLAYER_POSITION_Y;
/*  37 */     this.playerHealth = Setting.Player_Full_HP;
/*     */     
/*  39 */     this.dieCounter = new FrameCounter(10);
/*  40 */     this.fireCounter = new FrameCounter(10);
/*  41 */     this.scoreCounter = new FrameCounter(120);
/*  42 */     this.collider = new BoxCollider(35, 55);
/*  43 */     this.velocity = new Vector2D(0.0F, 0.0F);
/*  44 */     this.score = new Score();
/*  45 */     GameObject.add((GameObject)this.score);
/*     */   }
/*     */ 
/*     */   
/*     */   public void move(float velocityX, float velocityY) {
/*  50 */     if (velocityX == 0.0F && velocityY == 0.0F) {
/*  51 */       this.velocity.setThis(Float.valueOf(0.0F), Float.valueOf(0.0F));
/*     */     } else {
/*  53 */       this.velocity.addThis(velocityX, velocityY);
/*  54 */       if (KeyEventPress.isUpPress) {
/*  55 */         this.velocity.setThis(Float.valueOf(clamp(this.velocity.x, -3.0F, 3.0F)), Float.valueOf(clamp(this.velocity.y, -2.1F, 2.1F)));
/*     */       } else {
/*  57 */         this.velocity.setThis(Float.valueOf(clamp(this.velocity.x, -3.0F, 3.0F)), Float.valueOf(clamp(this.velocity.y, -4.0F, 4.0F)));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float clamp(float number, float min, float max) {
/*  64 */     return (number < min) ? min : ((number > max) ? max : number);
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  69 */     int vx = 0;
/*  70 */     float vy = 0.0F;
/*  71 */     if (KeyEventPress.isUpPress) {
/*  72 */       if (this.position.y > 50.0F) {
/*  73 */         vy = (float)(vy - 0.1D);
/*     */       } else {
/*  75 */         vy -= 0.0F;
/*     */       } 
/*     */       
/*  78 */       if (KeyEventPress.isRightPress)
/*     */       {
/*  80 */         if (this.position.x < (Setting.SCREEN_WIDTH - this.collider.width - 30)) {
/*  81 */           vx += 3;
/*     */         } else {
/*  83 */           vx += 0;
/*     */         } 
/*     */       }
/*     */       
/*  87 */       if (KeyEventPress.isLeftPress) {
/*  88 */         if (this.position.x > 30.0F) {
/*  89 */           vx -= 4;
/*     */         } else {
/*  91 */           vx += 0;
/*     */         }
/*     */       
/*     */       }
/*  95 */     } else if (!KeyEventPress.isUpPress) {
/*  96 */       if (this.position.y > (Setting.SCREEN_HEIGHT - 100)) {
/*  97 */         destroy();
/*     */       } else {
/*  99 */         vy += 6.0F;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 104 */     if (this.position.y < 600.0F && this.position.y > 300.0F && 
/* 105 */       this.scoreCounter.run()) {
/* 106 */       this.score.addScore(1);
/* 107 */       this.scoreCounter.reset();
/*     */     } 
/*     */ 
/*     */     
/* 111 */     if (this.position.x < 30.0F && this.position.x > (Setting.SCREEN_WIDTH - this.collider.width - 30)) {
/* 112 */       vx = 0;
/*     */     }
/*     */     
/* 115 */     move(vx, vy);
/* 116 */     if (this.position.y <= 0.0F) this.position.y = 0.0F; 
/* 117 */     if (this.position.x <= 25.0F) this.position.x = 25.0F; 
/* 118 */     if (this.position.y > (Setting.SCREEN_HEIGHT - 100)) {
/* 119 */       this.position.y = (Setting.SCREEN_HEIGHT - 100);
/*     */     }
/* 121 */     if (this.position.x >= (Setting.SCREEN_WIDTH - this.collider.width)) {
/* 122 */       this.position.x = (Setting.SCREEN_WIDTH - this.collider.width);
/*     */     }
/* 124 */     this.position.addThis(this.velocity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void takeDamage(int damage) {
/* 129 */     this.playerHealth -= damage;
/* 130 */     reportStatus();
/* 131 */     if (this.playerHealth <= 0) {
/* 132 */       destroy();
/* 133 */       this.playerHealth = 0;
/* 134 */       reportStatus();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void reportStatus() {
/* 140 */     if (this.playerHealth > 0) {
/* 141 */       System.out.println("player HP: " + this.playerHealth);
/*     */     } else {
/*     */       
/* 144 */       System.out.println("playerHp: " + this.playerHealth);
/* 145 */       System.out.println("you lose");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void destroy() {
/* 151 */     super.destroy();
/* 152 */     Explosion explosion = (Explosion)GameObject.recycle(Explosion.class);
/* 153 */     explosion.position.setThis(this.position);
/* 154 */     Setting.SCORE = this.score.score;
/* 155 */     SoundManager.playSound("assets/music/sfx/Cartoon sound effects bangs 1.wav");
/* 156 */     SoundManager.playSound("assets/music/sfx/whistle spin.wav");
/* 157 */     SceneManager.signNewScene((Scene)new EndScene(), 110);
/*     */   }
/*     */ 
/*     */   
/*     */   public BoxCollider getBoxCollider() {
/* 162 */     return this.collider;
/*     */   }
/*     */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\player\Player.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */