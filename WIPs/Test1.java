/**
* stuff again
*/
class Test1 {
	
	public static void main(String[] args) {
		
	
	// Ball testBall = new Ball(4);
	// System.out.println(testBall.toString());
	
	
	//INSERT FROM TAIL(AFTER), POP FROM HEAD(BEFORE)
	
	
	//create initial empty queue
	// dummyHead.setAfter(dummyTail);
	// dummyTail.setBefore(dummyHead);

	Air testAir = new Air();
	
	System.out.println(testAir);
	
	testAir.add(new Ball(5));
	testAir.add(new Ball(7));
	
	System.out.println(testAir.remove());
	
	testAir.add(new Ball(9));
	
	System.out.println(testAir);
	System.out.println(testAir.size());
	
	// //add others
	// ListItem second = new ListItem(new Ball(2));
	
	// second.setBefore(dummyTail);
	// dummyTail = second;
	
	// ListItem third = new ListItem(new Ball(3));
	// third.setBefore(dummyTail);
	// dummyTail=third;
	
	}
	
	
}