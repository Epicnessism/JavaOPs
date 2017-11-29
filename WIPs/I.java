public interface I {
  public abstract void i1();
  
  public abstract void i2();
}

class b implements I {
  @Override public void i1() { System.out.println("yah"); }
  @Override public void i2() { System.out.println("yah"); }
}

class c extends b {
  //@Override public void i1() { System.out.println("yah"); }
  @Override public void i2() { System.out.println("yahkk"); }
}