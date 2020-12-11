package base.action;

import base.GameObject;

public abstract class Action {
  public boolean isDone;
  
  public abstract void run(GameObject paramGameObject);
  
  public abstract void reset();
}


/* Location:              C:\Users\ADMIN\Downloads\Compressed\Alice in the wonderland\Alice in the wonderland\Alice in the wonder land.jar!\base\action\Action.class
 * Java compiler version: 10 (54.0)
 * JD-Core Version:       1.1.3
 */