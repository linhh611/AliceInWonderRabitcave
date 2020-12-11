/*     */ package base;
/*     */ 
/*     */ import base.physics.Physics;
/*     */ import base.renderer.Renderer;
/*     */ import base.scene.SceneManager;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class GameObject
/*     */ {
/*     */   boolean isActive = true;
/*  13 */   public static ArrayList<GameObject> gameObjects = new ArrayList<>();
/*  14 */   public static ArrayList<GameObject> newGameObjects = new ArrayList<>();
/*  15 */   public static BufferedImage backBuffer = new BufferedImage(Setting.SCREEN_WIDTH, Setting.SCREEN_HEIGHT, 2);
/*  16 */   public static Graphics backBufferGraphics = backBuffer.createGraphics();
/*     */   BufferedImage image;
/*     */   public Vector2D position;
/*     */   
/*     */   public static void add(GameObject go) {
/*  21 */     newGameObjects.add(go);
/*     */   }
/*     */   public Renderer renderer; public Vector2D anchor;
/*     */   
/*     */   public static <E extends GameObject> E create(Class<E> childClass) {
/*     */     try {
/*  27 */       GameObject newGameObject = (GameObject)childClass.newInstance();
/*  28 */       newGameObjects.add(newGameObject);
/*  29 */       return (E)newGameObject;
/*  30 */     } catch (Exception e) {
/*  31 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <E extends GameObject> E recycle(Class<E> childclass) {
/*  40 */     for (GameObject go : gameObjects) {
/*     */       
/*  42 */       if (!go.isActive && go.getClass().isAssignableFrom(childclass)) {
/*  43 */         go.isActive = true;
/*  44 */         return (E)go;
/*     */       } 
/*     */     } 
/*  47 */     return create(childclass);
/*     */   }
/*     */   
/*     */   public static void clearAll() {
/*  51 */     gameObjects.clear();
/*  52 */     newGameObjects.clear();
/*     */   }
/*     */   
/*     */   public static <E extends GameObject> E intersect(Class<E> childClass, Physics physics) {
/*  56 */     for (GameObject go : gameObjects) {
/*     */ 
/*     */       
/*  59 */       if (go.isActive && childClass.isAssignableFrom(go.getClass()) && go instanceof Physics) {
/*  60 */         Physics physicsGo = (Physics)go;
/*  61 */         boolean intersected = physics.getBoxCollider().intersect(physicsGo, (GameObject)physics);
/*  62 */         if (intersected) {
/*  63 */           return (E)physicsGo;
/*     */         }
/*     */       } 
/*     */     } 
/*  67 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void runAll() {
/*  76 */     for (GameObject go : gameObjects) {
/*  77 */       if (go.isActive) {
/*  78 */         go.run();
/*     */       }
/*     */     } 
/*     */     
/*  82 */     gameObjects.addAll(newGameObjects);
/*  83 */     newGameObjects.clear();
/*  84 */     SceneManager.changeSceneIfNeeded();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void renderAllToBackBuffer() {
/*  89 */     for (GameObject go : gameObjects) {
/*  90 */       if (go.isActive) {
/*  91 */         go.render(backBufferGraphics);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void renderBackBufferToGame(Graphics g) {
/*  97 */     g.drawImage(backBuffer, 0, 0, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GameObject() {
/* 124 */     this.isActive = true;
/* 125 */     this.anchor = new Vector2D(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public GameObject(BufferedImage image) {
/* 129 */     this.isActive = true;
/* 130 */     this.image = image;
/* 131 */     this.position = new Vector2D(0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(Graphics g) {
/* 136 */     if (this.renderer != null) {
/* 137 */       this.renderer.render(g, this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void destroy() {
/* 142 */     this.isActive = false;
/*     */   } public void revive() {
/* 144 */     this.isActive = true;
/*     */   }
/*     */   
/*     */   public void run() {}
/*     */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\GameObject.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */