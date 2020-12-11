/*    */ package base.action;
/*    */ 
/*    */ import base.GameObject;
/*    */ import base.counter.FrameCounter;
/*    */ 
/*    */ public class ActionWait
/*    */   extends Action {
/*    */   public ActionWait(int frame) {
/*  9 */     this.isDone = false;
/* 10 */     this.counter = new FrameCounter(frame);
/*    */   }
/*    */   FrameCounter counter;
/*    */   
/*    */   public void run(GameObject master) {
/* 15 */     if (this.counter.run()) {
/* 16 */       this.isDone = true;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 22 */     this.counter.reset();
/* 23 */     this.isDone = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\action\ActionWait.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */