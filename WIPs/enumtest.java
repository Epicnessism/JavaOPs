import java.util.Scanner;

public enum enumtest {
	Q1(Signum.POS),Q2(Signum.NEG),Q3(Signum.NEG),Q4(Signum.POS);
	
	Signum x;
	
	private enumtest(Signum x) {
		this.x = x;
	}
	
	public String toString() {
		return String.format("this number is ");
	}
	
	public enumtest where(){
   switch(this){
     case Q1:
       return Q1;
     case Q2:
       return Q2;
     case Q3:
       return Q3;
     case Q4:
       return Q4;
   }
   throw new RuntimeException("can't do that!");
 }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Here give int");
		int ans = input.nextInt();
		//System.out.println(Q1);
	}
}

/*
public enum Signum {
 
  POS, Z, NEG
  
}
public enum Quadrant { //implements java.io.Serializable
  
 None (Signum.Z, Signum.Z),
   I   (Signum.POS,Signum.POS),
 II  (Signum.NEG,Signum.POS),
 III (Signum.NEG,Signum.NEG),
 IV  (Signum.POS,Signum.NEG)
   ;
  
 Signum x, y;
 private Quadrant(Signum x, Signum y){
  this.x = x;
  this.y = y;
 } 
 
 public Quadrant nHops(int n){
   n %= 4;
   Quadrant q = this;
   while (n>0){
     q = q.next();
     n--;
   }
   return q;
 }
 
 public Quadrant next(){
   switch(this){
     case I:
       return II;
     case II:
       return III;
     case III:
       return IV;
     case IV:
       return I;
   }
   throw new RuntimeException("can't do that!");
 }
 
 
 private int getNumericValue(){
   Quadrant[] qs = Quadrant.values();
   for (int i=0; i<qs.length; i++){
     if (qs[i]==this){
      return i; 
     }
   }
   throw new RuntimeException("what the heck was this??"+this);
 }
}
*/