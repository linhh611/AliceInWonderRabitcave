/*    */ package base.action;
/*    */ 
/*    */ import base.GameObject;
/*    */ 
/*    */ public class ActionRepeat extends Action {
/*    */   Action action;
/*    */   
/*    */   public ActionRepeat(Action action) {
/*  9 */     this.action = action;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run(GameObject master) {
/* 14 */     if (!this.action.isDone) {
/* 15 */       this.action.run(master);
/*    */     } else {
/* 17 */       this.action.reset();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void reset() {}
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\action\ActionRepeat.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */