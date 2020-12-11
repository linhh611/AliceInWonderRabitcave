/*    */ package base.physics;
/*    */ 
/*    */ import base.GameObject;
/*    */ 
/*    */ public class BoxCollider {
/*    */   public int width;
/*    */   public int height;
/*    */   
/*    */   public BoxCollider(int width, int height) {
/* 10 */     this.width = width;
/* 11 */     this.height = height;
/*    */   }
/*    */   
/*    */   public int top(GameObject master) {
/* 15 */     return (int)master.position.y;
/*    */   }
/*    */   
/*    */   public int bot(GameObject master) {
/* 19 */     return (int)(master.position.y + this.height);
/*    */   }
/*    */   
/*    */   public int left(GameObject master) {
/* 23 */     return (int)master.position.x;
/*    */   }
/*    */   
/*    */   public int right(GameObject master) {
/* 27 */     return (int)(master.position.x + this.width);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean intersect(Physics other, GameObject master) {
/* 33 */     GameObject oM = (GameObject)other;
/* 34 */     BoxCollider oB = other.getBoxCollider();
/*    */ 
/*    */     
/* 37 */     boolean yIntersect = ((top(master) >= oB.top(oM) && top(master) < oB.bot(oM)) || (bot(master) >= oB.top(oM) && bot(master) < oB.bot(oM)));
/*    */     
/* 39 */     boolean xIntersect = ((right(master) >= oB.left(oM) && right(master) < oB.right(oM)) || (left(master) >= oB.left(oM) && left(master) < oB.right(oM)));
/* 40 */     return (yIntersect && xIntersect);
/*    */   }
/*    */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\physics\BoxCollider.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */