/*    */ package base.action;
/*    */ 
/*    */ import base.GameObject;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class ActionParallel
/*    */   extends Action {
/*    */   ArrayList<Action> actions;
/*    */   
/*    */   public ActionParallel(Action... actions) {
/* 12 */     this.actions = new ArrayList<>(Arrays.asList(actions));
/*    */   }
/*    */ 
/*    */   
/*    */   public void run(GameObject master) {
/* 17 */     if (this.actions.size() > 0 && !this.isDone) {
/*    */       
/* 19 */       boolean isContinue = true;
/* 20 */       for (Action action : this.actions) {
/* 21 */         if (!action.isDone) {
/* 22 */           action.run(master); continue;
/*    */         } 
/* 24 */         isContinue = false;
/*    */       } 
/*    */       
/* 27 */       this.isDone = !isContinue;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 33 */     for (Action action : this.actions) {
/* 34 */       action.reset();
/*    */     }
/* 36 */     this.isDone = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\action\ActionParallel.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */