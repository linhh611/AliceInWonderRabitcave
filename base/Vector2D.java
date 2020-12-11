/*     */ package base;
/*     */ 
/*     */ public class Vector2D {
/*     */   public float x;
/*     */   
/*     */   public Vector2D() {
/*   7 */     this.x = 0.0F;
/*   8 */     this.y = 0.0F;
/*     */   }
/*     */   public float y;
/*     */   public Vector2D(float x, float y) {
/*  12 */     this.x = x;
/*  13 */     this.y = y;
/*     */   }
/*     */   
/*     */   public Vector2D setThis(Float x, Float y) {
/*  17 */     this.x = x.floatValue();
/*  18 */     this.y = y.floatValue();
/*  19 */     return this;
/*     */   }
/*     */   
/*     */   public Vector2D setThis(Vector2D other) {
/*  23 */     return setThis(Float.valueOf(other.x), Float.valueOf(other.y));
/*     */   }
/*     */   
/*     */   public Vector2D Clone() {
/*  27 */     return new Vector2D(this.x, this.y);
/*     */   }
/*     */ 
/*     */   
/*     */   public Vector2D add(float x, float y) {
/*  32 */     Vector2D result = new Vector2D(this.x + x, this.y + y);
/*     */     
/*  34 */     return result;
/*     */   }
/*     */   
/*     */   public Vector2D add(Vector2D other) {
/*  38 */     return add(other.x, other.y);
/*     */   }
/*     */ 
/*     */   
/*     */   public Vector2D addThis(float x, float y) {
/*  43 */     this.x += x;
/*  44 */     this.y += y;
/*  45 */     return this;
/*     */   }
/*     */   
/*     */   public Vector2D addThis(Vector2D other) {
/*  49 */     return addThis(other.x, other.y);
/*     */   }
/*     */   
/*     */   public Vector2D subtract(float x, float y) {
/*  53 */     Vector2D result = new Vector2D(this.x - x, this.y - y);
/*     */     
/*  55 */     return result;
/*     */   }
/*     */   
/*     */   public Vector2D subtract(Vector2D other) {
/*  59 */     return subtract(other.x, other.y);
/*     */   }
/*     */   
/*     */   public Vector2D subtractThis(float x, float y) {
/*  63 */     this.x -= x;
/*  64 */     this.y -= y;
/*  65 */     return this;
/*     */   }
/*     */   
/*     */   public Vector2D subtractThis(Vector2D other) {
/*  69 */     return subtractThis(other.x, other.y);
/*     */   }
/*     */ 
/*     */   
/*     */   public Vector2D scale(float x, float y) {
/*  74 */     Vector2D result = new Vector2D(this.x * x, this.y * y);
/*  75 */     return result;
/*     */   }
/*     */   
/*     */   public Vector2D scaleThis(float x, float y) {
/*  79 */     this.x *= x;
/*  80 */     this.y *= y;
/*  81 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public float length() {
/*  86 */     return (float)Math.sqrt((this.x * this.x + this.y * this.y));
/*     */   }
/*     */ 
/*     */   
/*     */   public void print() {
/*  91 */     System.out.println("" + this.x + "," + this.x);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  98 */     return "(X:" + this.x + "; y :" + this.y + ")";
/*     */   }
/*     */   public static void main(String[] args) {
/* 101 */     Vector2D v1 = new Vector2D(10.0F, 10.0F);
/* 102 */     v1.print();
/*     */     
/* 104 */     System.out.println(v1);
/*     */   }
/*     */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\Vector2D.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */