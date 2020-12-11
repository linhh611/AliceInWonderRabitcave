/*     */ package base.enemy;
/*     */ 
/*     */ import base.GameObject;
/*     */ import base.action.Action;
/*     */ import base.action.ActionRepeat;
/*     */ import base.action.ActionSequence;
/*     */ import base.action.ActionWait;
/*     */ import base.counter.FrameCounter;
/*     */ 
/*     */ public class EnemyManager
/*     */   extends GameObject
/*     */ {
/*     */   Action action;
/*     */   FrameCounter spawnCounter;
/*     */   FrameCounter spawnCounter1;
/*     */   FrameCounter spawnCounter2;
/*  17 */   int count = 0;
/*  18 */   int lastTimeCall = 0;
/*     */   
/*     */   public EnemyManager() {
/*  21 */     defineAction();
/*  22 */     this.spawnCounter = new FrameCounter(30);
/*  23 */     this.spawnCounter1 = new FrameCounter(40);
/*  24 */     this.spawnCounter2 = new FrameCounter(50);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   void defineAction() {
/*  30 */     ActionWait actionWait1 = new ActionWait(500);
/*  31 */     Action spawnAction1 = new Action()
/*     */       {
/*     */         
/*     */         public void run(GameObject master)
/*     */         {
/*  36 */           EnemyManager.this.lastTimeCall = EnemyManager.this.count;
/*     */           
/*  38 */           for (int i = 0; i < 2; i++) {
/*  39 */             EnemyType1 enemyType11 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  40 */             enemyType11.position.setThis(Float.valueOf(230.0F * (i + 1)), Float.valueOf(900.0F));
/*     */           } 
/*  42 */           EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  43 */           enemyType1.position.setThis(Float.valueOf(350.0F), Float.valueOf(800.0F));
/*  44 */           EnemyType1 enemyType2 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  45 */           enemyType2.position.setThis(Float.valueOf(150.0F), Float.valueOf(1000.0F));
/*  46 */           EnemyType1 enemyType3 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  47 */           enemyType3.position.setThis(Float.valueOf(550.0F), Float.valueOf(1000.0F));
/*  48 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/*  53 */           this.isDone = false;
/*     */         }
/*     */       };
/*     */     
/*  57 */     ActionWait actionWait2 = new ActionWait(200);
/*  58 */     Action spawnAction2 = new Action()
/*     */       {
/*     */         
/*     */         public void run(GameObject master)
/*     */         {
/*  63 */           EnemyManager.this.lastTimeCall = EnemyManager.this.count;
/*     */           int i;
/*  65 */           for (i = 0; i < 2; i++) {
/*  66 */             EnemyType1 enemy1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  67 */             enemy1.position.setThis(Float.valueOf(10.0F + ((i + 1) * 60)), Float.valueOf(900.0F));
/*     */           } 
/*  69 */           for (i = 0; i < 2; i++) {
/*  70 */             EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  71 */             enemyType1.position.setThis(Float.valueOf(220.0F + ((i + 1) * 60)), Float.valueOf(800.0F));
/*     */           } 
/*  73 */           for (i = 0; i < 2; i++) {
/*  74 */             EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  75 */             enemyType1.position.setThis(Float.valueOf(430.0F + ((i + 1) * 60)), Float.valueOf(900.0F));
/*     */           } 
/*  77 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/*  82 */           this.isDone = false;
/*     */         }
/*     */       };
/*     */     
/*  86 */     ActionWait actionWait3 = new ActionWait(600);
/*  87 */     Action spawnAction3 = new Action()
/*     */       {
/*     */         
/*     */         public void run(GameObject master)
/*     */         {
/*  92 */           EnemyManager.this.lastTimeCall = EnemyManager.this.count;
/*     */           
/*  94 */           EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  95 */           enemyType1.position.setThis(Float.valueOf(300.0F), Float.valueOf(800.0F)); int i;
/*  96 */           for (i = 0; i < 2; i++) {
/*  97 */             EnemyType1 enemy1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/*  98 */             enemy1.position.setThis(Float.valueOf((100 + i * 80)), Float.valueOf(900.0F));
/*     */           } 
/* 100 */           for (i = 0; i < 2; i++) {
/* 101 */             EnemyType1 enemy2 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 102 */             enemy2.position.setThis(Float.valueOf(450.0F + (i * 80)), Float.valueOf(900.0F));
/*     */           } 
/* 104 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/* 109 */           this.isDone = false;
/*     */         }
/*     */       };
/*     */     
/* 113 */     ActionWait actionWait4 = new ActionWait(400);
/* 114 */     Action spawnAction4 = new Action()
/*     */       {
/*     */         
/*     */         public void run(GameObject master)
/*     */         {
/* 119 */           EnemyManager.this.lastTimeCall = EnemyManager.this.count;
/*     */           
/* 121 */           for (int i = 0; i < 2; i++) {
/* 122 */             EnemyType1 enemy1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 123 */             enemy1.position.setThis(Float.valueOf(150.0F + (i * 350)), Float.valueOf(800.0F));
/* 124 */             EnemyType1 enemy2 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 125 */             enemy2.position.setThis(Float.valueOf(50.0F + (i * 350)), Float.valueOf(900.0F));
/* 126 */             EnemyType1 enemy3 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 127 */             enemy3.position.setThis(Float.valueOf(250.0F + (i * 350)), Float.valueOf(900.0F));
/* 128 */             EnemyType1 enemy4 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 129 */             enemy4.position.setThis(Float.valueOf(150.0F + (i * 350)), Float.valueOf(1000.0F));
/*     */           } 
/* 131 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/* 136 */           this.isDone = false;
/*     */         }
/*     */       };
/*     */     
/* 140 */     ActionWait actionWait5 = new ActionWait(200);
/* 141 */     Action spawnAction5 = new Action()
/*     */       {
/*     */         
/*     */         public void run(GameObject master)
/*     */         {
/* 146 */           EnemyManager.this.lastTimeCall = EnemyManager.this.count;
/*     */           int i;
/* 148 */           for (i = 0; i < 2; i++) {
/* 149 */             EnemyType1 enemyType11 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 150 */             enemyType11.position.setThis(Float.valueOf(300.0F + (i * 60)), Float.valueOf(800.0F));
/*     */           } 
/* 152 */           for (i = 0; i < 2; i++) {
/* 153 */             EnemyType1 enemyType11 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 154 */             enemyType11.position.setThis(Float.valueOf(170.0F + (i * 320)), Float.valueOf(900.0F));
/*     */           } 
/* 156 */           for (i = 0; i < 2; i++) {
/* 157 */             EnemyType1 enemyType11 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 158 */             enemyType11.position.setThis(Float.valueOf(210.0F + (i * 250)), Float.valueOf(1000.0F));
/*     */           } 
/* 160 */           for (i = 0; i < 2; i++) {
/* 161 */             EnemyType1 enemyType11 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 162 */             enemyType11.position.setThis(Float.valueOf(260.0F + (i * 150)), Float.valueOf(1100.0F));
/*     */           } 
/* 164 */           EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 165 */           enemyType1.position.setThis(Float.valueOf(340.0F), Float.valueOf(1200.0F));
/* 166 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/* 171 */           this.isDone = false;
/*     */         }
/*     */       };
/*     */     
/* 175 */     ActionWait actionWait6 = new ActionWait(1000);
/* 176 */     Action spawnAction6 = new Action()
/*     */       {
/*     */         
/*     */         public void run(GameObject master)
/*     */         {
/* 181 */           EnemyManager.this.lastTimeCall = EnemyManager.this.count;
/*     */           int i;
/* 183 */           for (i = 0; i < 2; i++) {
/* 184 */             EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 185 */             enemyType1.position.setThis(Float.valueOf(280.0F + (i * 150)), Float.valueOf(800.0F));
/*     */           } 
/* 187 */           for (i = 0; i < 2; i++) {
/* 188 */             EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 189 */             enemyType1.position.setThis(Float.valueOf(200.0F + (i * 310)), Float.valueOf(900.0F));
/*     */           } 
/* 191 */           for (i = 0; i < 2; i++) {
/* 192 */             EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 193 */             enemyType1.position.setThis(Float.valueOf(200.0F + (i * 310)), Float.valueOf(1050.0F));
/*     */           } 
/* 195 */           for (i = 0; i < 2; i++) {
/* 196 */             EnemyType1 enemyType1 = (EnemyType1)GameObject.recycle(EnemyType1.class);
/* 197 */             enemyType1.position.setThis(Float.valueOf(280.0F + (i * 150)), Float.valueOf(1150.0F));
/*     */           } 
/* 199 */           this.isDone = true;
/*     */         }
/*     */ 
/*     */         
/*     */         public void reset() {
/* 204 */           this.isDone = false;
/*     */         }
/*     */       };
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 225 */     ActionSequence actionSequence = new ActionSequence(new Action[] { spawnAction1, (Action)actionWait1, spawnAction2, (Action)actionWait2, spawnAction3, (Action)actionWait3, spawnAction4, (Action)actionWait4, spawnAction5, (Action)actionWait5, spawnAction6, (Action)actionWait6 });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 234 */     this.action = (Action)new ActionRepeat((Action)actionSequence);
/*     */   }
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/* 252 */     this.count++;
/* 253 */     this.action.run(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\enemy\EnemyManager.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */