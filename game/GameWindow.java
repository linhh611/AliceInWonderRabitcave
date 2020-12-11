/*     */ package game;
/*     */ 
/*     */ import base.Setting;
/*     */ import base.event.KeyEventPress;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import javax.swing.JFrame;
/*     */ import tklibs.AudioUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GameWindow
/*     */   extends JFrame
/*     */ {
/*     */   GameCanvas canvas;
/*     */   int SCREEN_WIDTH;
/*     */   int SCREEN_HEIGHT;
/*     */   
/*     */   public GameWindow() {
/*  23 */     getSizeWindow();
/*  24 */     setBounds((this.SCREEN_WIDTH - Setting.SCREEN_WIDTH) / 2, (this.SCREEN_HEIGHT - Setting.SCREEN_HEIGHT) / 2 - 30, Setting.SCREEN_WIDTH, Setting.SCREEN_HEIGHT);
/*     */ 
/*     */     
/*  27 */     setResizable(false);
/*  28 */     setDefaultCloseOperation(3);
/*  29 */     setupEventListtener();
/*     */ 
/*     */     
/*  32 */     this.canvas = new GameCanvas();
/*  33 */     this.canvas.setPreferredSize(new Dimension(Setting.SCREEN_WIDTH, Setting.SCREEN_HEIGHT));
/*  34 */     add(this.canvas);
/*  35 */     setVisible(true);
/*  36 */     AudioUtils.initialize();
/*  37 */     pack();
/*     */   }
/*     */   public void getSizeWindow() {
/*  40 */     setDefaultCloseOperation(3);
/*  41 */     Toolkit tk = getToolkit();
/*  42 */     Dimension dm = tk.getScreenSize();
/*  43 */     this.SCREEN_WIDTH = dm.width;
/*  44 */     this.SCREEN_HEIGHT = dm.height;
/*     */   }
/*     */   
/*     */   private void setupEventListtener() {
/*  48 */     addKeyListener(new KeyAdapter()
/*     */         {
/*     */           public void keyPressed(KeyEvent e)
/*     */           {
/*  52 */             if (e.getKeyCode() == 87) {
/*  53 */               KeyEventPress.isUpPress = true;
/*     */             }
/*  55 */             if (e.getKeyCode() == 83) {
/*  56 */               KeyEventPress.isDownPress = true;
/*     */             }
/*  58 */             if (e.getKeyCode() == 68) {
/*  59 */               KeyEventPress.isRightPress = true;
/*     */             }
/*  61 */             if (e.getKeyCode() == 65) {
/*  62 */               KeyEventPress.isLeftPress = true;
/*     */             }
/*  64 */             if (e.getKeyCode() == 32) {
/*  65 */               KeyEventPress.isSpacePress = true;
/*     */             }
/*  67 */             if (e.getKeyCode() == 27) {
/*  68 */               KeyEventPress.isEscPress = true;
/*     */             } else {
/*  70 */               KeyEventPress.isAnyKey = true;
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/*     */           public void keyReleased(KeyEvent e) {
/*  76 */             KeyEventPress.isAnyKey = false;
/*  77 */             if (e.getKeyCode() == 87) {
/*  78 */               KeyEventPress.isUpPress = false;
/*     */             }
/*  80 */             if (e.getKeyCode() == 83) {
/*  81 */               KeyEventPress.isDownPress = false;
/*     */             }
/*  83 */             if (e.getKeyCode() == 68) {
/*  84 */               KeyEventPress.isRightPress = false;
/*     */             }
/*  86 */             if (e.getKeyCode() == 65) {
/*  87 */               KeyEventPress.isLeftPress = false;
/*     */             }
/*  89 */             if (e.getKeyCode() == 32) {
/*  90 */               KeyEventPress.isSpacePress = false;
/*     */             }
/*  92 */             if (e.getKeyCode() == 27) {
/*  93 */               KeyEventPress.isEscPress = false;
/*     */             }
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void gameLoop() {
/* 100 */     long delay = 16L;
/* 101 */     long lastTime = 0L;
/*     */     
/*     */     while (true) {
/* 104 */       long currentTime = System.currentTimeMillis();
/* 105 */       if (currentTime - lastTime > delay) {
/*     */         
/* 107 */         this.canvas.run();
/* 108 */         this.canvas.render();
/* 109 */         repaint();
/*     */         
/* 111 */         lastTime = currentTime;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\game\GameWindow.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */