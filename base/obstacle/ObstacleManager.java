/*    */ package base.obstacle;
/*    */ import base.GameObject;
/*    */ import base.action.Action;
/*    */ import base.action.ActionRepeat;
/*    */ import base.action.ActionSequence;
/*    */ import base.action.ActionWait;
/*    */ 
/*    */ public class ObstacleManager extends GameObject {
/*    */   public ObstacleManager() {
/* 10 */     defineAction();
/*    */   } Action action;
/*    */   void defineAction() {
/* 13 */     ActionWait actionWait = new ActionWait(160);
/* 14 */     ActionWait actionWait1 = new ActionWait(230);
/* 15 */     Action actionSpawn = new Action()
/*    */       {
/*    */         public void run(GameObject master) {
/* 18 */           ObstacleTree1L obstacleTree1L = (ObstacleTree1L)GameObject.recycle(ObstacleTree1L.class);
/* 19 */           ObstacleTree1R obstacleTree1R = (ObstacleTree1R)GameObject.recycle(ObstacleTree1R.class);
/* 20 */           ObstacleTree1L obstacleTree1L1 = (ObstacleTree1L)GameObject.recycle(ObstacleTree1L.class);
/* 21 */           ObstacleTree1R obstacleTree1R1 = (ObstacleTree1R)GameObject.recycle(ObstacleTree1R.class);
/* 22 */           ObstacleCatL obstacleTree1C = (ObstacleCatL)GameObject.recycle(ObstacleCatL.class);
/* 23 */           ObstacleCatR obstacleCatR = (ObstacleCatR)GameObject.recycle(ObstacleCatR.class);
/*    */           
/* 25 */           if (KeyEventPress.isUpPress) {
/*    */             
/* 27 */             obstacleTree1L.position.y = 4000.0F;
/* 28 */             obstacleTree1R.position.y = 4000.0F;
/* 29 */             obstacleTree1L1.position.y = 3000.0F;
/* 30 */             obstacleTree1R1.position.y = 3000.0F;
/* 31 */             obstacleTree1C.position.setThis(Float.valueOf(180.0F), Float.valueOf(5000.0F));
/* 32 */             obstacleCatR.position.setThis(Float.valueOf(450.0F), Float.valueOf(5000.0F));
/*    */           }
/*    */           else {
/*    */             
/* 36 */             obstacleTree1L.position.y = 1000.0F;
/* 37 */             obstacleTree1R.position.y = 1000.0F;
/* 38 */             obstacleTree1L1.position.y = 2000.0F;
/* 39 */             obstacleTree1R1.position.y = 2000.0F;
/* 40 */             obstacleTree1C.position.setThis(Float.valueOf(180.0F), Float.valueOf(6000.0F));
/* 41 */             obstacleCatR.position.setThis(Float.valueOf(450.0F), Float.valueOf(6000.0F));
/*    */           } 
/*    */           
/* 44 */           this.isDone = true;
/*    */         }
/*    */ 
/*    */         
/*    */         public void reset() {
/* 49 */           this.isDone = false;
/*    */         }
/*    */       };
/* 52 */     Action actionSpawn2 = new Action()
/*    */       {
/*    */         public void run(GameObject master) {
/* 55 */           ObstacleMirror mirror1 = (ObstacleMirror)GameObject.recycle(ObstacleMirror.class);
/* 56 */           mirror1.position.setThis(Float.valueOf(450.0F), Float.valueOf(700.0F));
/* 57 */           for (int i = 0; i < 2; i++) {
/* 58 */             ObstacleMirror mirror = (ObstacleMirror)GameObject.recycle(ObstacleMirror.class);
/* 59 */             ObstacleHat hat = (ObstacleHat)GameObject.recycle(ObstacleHat.class);
/* 60 */             ObstacleChair obstacleChair = (ObstacleChair)GameObject.recycle(ObstacleChair.class);
/* 61 */             obstacleChair.position.setThis(Float.valueOf(190.0F + (i * 350)), Float.valueOf(800.0F - (i * 150)));
/* 62 */             mirror.position.setThis(Float.valueOf(100.0F + (i * 180)), Float.valueOf(750.0F - (i * 200)));
/* 63 */             hat.position.setThis(Float.valueOf(150.0F + (i * 200)), Float.valueOf(950.0F + (i * 250)));
/*    */           } 
/* 65 */           this.isDone = true;
/*    */         }
/*    */ 
/*    */         
/*    */         public void reset() {
/* 70 */           this.isDone = false;
/*    */         }
/*    */       };
/* 73 */     ActionSequence actionSequence = new ActionSequence(new Action[] { actionSpawn2, (Action)actionWait });
/* 74 */     ActionSequence actionSequence1 = new ActionSequence(new Action[] { actionSpawn, (Action)actionWait1 });
/* 75 */     ActionParallel actionParallel = new ActionParallel(new Action[] { (Action)actionSequence, (Action)actionSequence1 });
/* 76 */     ActionRepeat actionRepeat = new ActionRepeat((Action)actionParallel);
/* 77 */     this.action = (Action)actionRepeat;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 82 */     this.action.run(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\obstacle\ObstacleManager.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */