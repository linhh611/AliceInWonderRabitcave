/*     */ package base.enemy;
/*     */ import base.GameObject;
/*     */ import base.Setting;
/*     */ import base.Vector2D;
/*     */ import base.action.Action;
/*     */ import base.action.ActionParallel;
/*     */ import base.action.ActionRepeat;
/*     */ import base.action.ActionSequence;
/*     */ import base.action.ActionWait;
/*     */ import base.event.KeyEventPress;
/*     */ import base.physics.BoxCollider;
/*     */ import base.physics.Physics;
/*     */ import base.player.Player;
/*     */ import base.renderer.AnimationRenderer;
/*     */ import base.renderer.Renderer;
/*     */ import base.scene.EndScene.EndScene;
/*     */ import base.scene.Scene;
/*     */ import base.scene.SceneManager;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import tklibs.SpriteUtils;
/*     */ 
/*     */ public class Enemy extends GameObject implements Physics {
/*     */   public Enemy() {
/*  26 */     ArrayList<BufferedImage> images = SpriteUtils.loadImages(new String[] { "assets/images/enemies/level0/black/0.png", "assets/images/enemies/level0/black/0.png", "assets/images/enemies/level0/black/1.png", "assets/images/enemies/level0/black/2.png", "assets/images/enemies/level0/black/4.png", "assets/images/enemies/level0/black/5.png", "assets/images/enemies/level0/black/6.png", "assets/images/enemies/level0/black/7.png", "assets/images/enemies/level0/black/8.png" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     this.renderer = (Renderer)new AnimationRenderer(images);
/*  38 */     this.position = new Vector2D(0.0F, 0.0F);
/*     */     
/*  40 */     defineAction();
/*     */   }
/*     */   EnemyBullet enemyBullet;
/*     */   BoxCollider collider;
/*     */   Action action;
/*     */   
/*     */   void defineAction() {
/*  47 */     ActionWait actionWait = new ActionWait(60);
/*  48 */     Action actionFire = new Action()
/*     */       {
/*     */         public void run(GameObject master)
/*     */         {
/*  52 */           Enemy.this.shoot();
/*  53 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/*  58 */           this.isDone = false;
/*     */         }
/*     */       };
/*     */ 
/*     */     
/*  63 */     Action actionMove = new Action()
/*     */       {
/*     */         public void run(GameObject master) {
/*  66 */           Enemy.this.move();
/*  67 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/*  72 */           this.isDone = false;
/*     */         }
/*     */       };
/*     */     
/*  76 */     ActionParallel actionParallel = new ActionParallel(new Action[] { actionMove, actionFire });
/*     */     
/*  78 */     ActionSequence actionSquence = new ActionSequence(new Action[] { (Action)actionWait, (Action)actionParallel });
/*     */     
/*  80 */     ActionRepeat actionRepeat = new ActionRepeat((Action)actionSquence);
/*  81 */     this.action = (Action)actionRepeat;
/*     */   }
/*     */ 
/*     */   
/*     */   public Enemy(int x, int y) {
/*  86 */     ArrayList<BufferedImage> images = SpriteUtils.loadImages(new String[] { "assets/images/enemies/level0/black/0.png", "assets/images/enemies/level0/black/0.png", "assets/images/enemies/level0/black/1.png", "assets/images/enemies/level0/black/2.png", "assets/images/enemies/level0/black/4.png", "assets/images/enemies/level0/black/5.png", "assets/images/enemies/level0/black/6.png", "assets/images/enemies/level0/black/7.png", "assets/images/enemies/level0/black/8.png" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     this.renderer = (Renderer)new AnimationRenderer(images, 2);
/* 100 */     this.position = new Vector2D(x, y);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void takeDamage(int damage) {}
/*     */ 
/*     */ 
/*     */   
/* 109 */   Random randomX = new Random();
/* 110 */   Random randomY = new Random();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/* 117 */     this.action.run(this);
/*     */ 
/*     */     
/* 120 */     Player player = (Player)GameObject.intersect(Player.class, this);
/* 121 */     if (player != null) {
/* 122 */       if (KeyEventPress.isUpPress) {
/* 123 */         player.destroy();
/* 124 */         Setting.SCORE = player.score.score;
/* 125 */         SceneManager.signNewScene((Scene)new EndScene());
/*     */       } else {
/*     */         
/* 128 */         takeDamage(10);
/* 129 */         player.score.addScore(1);
/*     */       } 
/*     */     }
/*     */     
/* 133 */     if (KeyEventPress.isUpPress) {
/* 134 */       this.position.y -= 2.0F;
/*     */     } else {
/* 136 */       this.position.y -= 6.0F;
/*     */     } 
/*     */     
/* 139 */     if (this.position.y < -25.0F) {
/* 140 */       destroy();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void move() {
/* 146 */     this.position.addThis(0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public void shoot() {
/* 150 */     this.enemyBullet = (EnemyBullet)GameObject.recycle(EnemyBullet.class);
/* 151 */     this.enemyBullet.position.setThis(Float.valueOf(this.position.x + 5.0F), Float.valueOf(this.position.y));
/*     */   }
/*     */   
/*     */   public float clamp(float number, float min, float max) {
/* 155 */     return (number < min) ? min : ((number > max) ? max : number);
/*     */   }
/*     */ 
/*     */   
/*     */   public BoxCollider getBoxCollider() {
/* 160 */     return this.collider;
/*     */   }
/*     */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\enemy\Enemy.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */