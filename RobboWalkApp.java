import java.util.Scanner;

public class RobboWalkApp {

	public static void main(String[] args) {
		final int W = 10;
		final int H = 10;
		      int rr = 2;
		      int rc = 2;
		      int gr = 7;
		      int gc = 7;
		      
	    String dir ;   
	Scanner in = new Scanner(System.in);
	
		      
	while (true)	     {  
    clearScrean ();	
	renderMap(W,H,rr,rc,gr,gc);
	System.out.println("directions a,d,w,s");
	System.out.print("move >>>>");
    dir = in.next();
    if (dir.equals("a")) {
    	--rc; 
    	if (rc < 0) rc = 9;	
    }
    if (dir.equals("d")) {
       rc++;
       if (rc == H ) rc = 0;   	
    }
    if (dir.equals("w")) {
    	--rr;
    	if (rr < 0 ) rr = 9;
    }
    if (dir.equals("s")) {
    	rr++;  	
    	if ( rr == W) rr= 0;  	
    } 
    if ( rr == gr && rc == gc ) { 
    	gr = 2 ; gc = 2;	
    }
    if ( rr == gr && rc == gc ) { 
    	gr = 9 ; gc = 9;
	}
    if ( rr == gr && rc == gc ) { 
    	System.out.println("YOU WIN !!!!!");
    }
	}
	}
 static void renderMap (final int W , final int H ,int rr , int rc,int gr , int gc) { 
	 for (int row = 0 ; row < W ; row++ ) {
		 for (int col = 0 ; col < H ; col++) {
			 if ( row == rr && col == rc ) {
			 System.out.print("R ");
			 }    else if (row == gr && col == gc ) {
				 System.out.print("X ");
				 } else {
			 System.out.print(". ");
			 } 
		 }
		 System.out.println();
		 }	 
 }	
 static void clearScrean () {
	 for ( int i = 0 ; i<13 ; i++ ) {
		 System.out.println();
	 }
 }
 
}
