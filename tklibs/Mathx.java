/*    */ package tklibs;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Mathx
/*    */ {
/*    */   public static double lerp(double a, double b, double f) {
/*  8 */     return a + f * (b - a);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static double clamp(double value, double min, double max) {
/* 23 */     if (value < min) return min; 
/* 24 */     if (value > max) return max; 
/* 25 */     return value;
/*    */   }
/*    */   
/*    */   public static int clamp(int value, int min, int max) {
/* 29 */     if (value < min) return min; 
/* 30 */     if (value > max) return max; 
/* 31 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\tklibs\Mathx.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */