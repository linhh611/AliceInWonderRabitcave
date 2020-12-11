/*    */ package base.counter;
/*    */ 
/*    */ public class FrameCounter {
/*    */   int frameCount;
/*    */   int maxCount;
/*    */   
/*    */   public FrameCounter(int maxCount) {
/*  8 */     this.maxCount = maxCount;
/*  9 */     this.frameCount = 0;
/*    */   }
/*    */   public boolean run() {
/* 12 */     if (this.frameCount >= this.maxCount) {
/* 13 */       return true;
/*    */     }
/* 15 */     this.frameCount++;
/* 16 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void reset() {
/* 22 */     this.frameCount = 0;
/*    */   }
/*    */   
/*    */   public void addMaxCount(int maxCount) {
/* 26 */     this.maxCount = maxCount;
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\counter\FrameCounter.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */