/*    */ package base.score;
/*    */ 
/*    */ import base.GameObject;
/*    */ import java.awt.Font;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ 
/*    */ public class Score
/*    */   extends GameObject
/*    */ {
/* 11 */   public int score = 0;
/*    */ 
/*    */   
/*    */   public void addScore(int score) {
/* 15 */     this.score += score;
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 20 */     Font f = new Font("TimesRoman", 50, 15);
/* 21 */     g.setFont(f);
/* 22 */     g.drawString("score: " + this.score, 10, 18);
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\score\Score.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */