/*    */ package base.action;
/*    */ 
/*    */ import base.GameObject;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class ActionSequence extends Action {
/*    */   ArrayList<Action> actions;
/*    */   int currentActionIndex;
/*    */   
/*    */   public ActionSequence(Action... actions) {
/* 12 */     this.actions = new ArrayList<>(Arrays.asList(actions));
/* 13 */     this.currentActionIndex = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run(GameObject master) {
/* 18 */     if (this.actions.size() > 0 && this.currentActionIndex < this.actions
/* 19 */       .size() && !this.isDone) {
/*    */       
/* 21 */       Action currentAction = this.actions.get(this.currentActionIndex);
/* 22 */       if (!currentAction.isDone) {
/* 23 */         currentAction.run(master);
/*    */       } else {
/* 25 */         this.currentActionIndex++;
/* 26 */         if (this.currentActionIndex >= this.actions.size()) {
/* 27 */           this.isDone = true;
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 35 */     for (Action action : this.actions) {
/* 36 */       action.reset();
/*    */     }
/* 38 */     this.currentActionIndex = 0;
/* 39 */     this.isDone = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\action\ActionSequence.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */