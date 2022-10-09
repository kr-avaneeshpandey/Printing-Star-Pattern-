import static java.lang.System.*;

class WishStarPrint{
	void disp1(){
		int row,col;
		for(row=1;row<=5;row++){
			//for H  
				out.print("\t\t\t\t");
				for(col=1;col<=5;col++){
					if(col==1||col==5||row==3)
						out.print("* ");
					else
						out.print("  ");
				}
			// for A
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1||col==5||row==1||row==3){
						if(row==1 &&(col==1 || col==5))
							out.print("  ");
						else
							out.print("* ");
					}
					else
						out.print("  ");
				}
			// for P
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1||col==5||row==1||row==3)
						if((col==5 && row>3)|| (col==5 && (row==1||row==3) ))
							out.print("  ");
						else
							out.print("* ");
					else
						out.print("  ");
				}
			// for P
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1||col==5||row==1||row==3)
						if((col==5 && row>3) || (col==5 && (row==1||row==3) ))
							out.print("  ");
						else
							out.print("* ");
					else
						out.print("  ");
				}
			// for y
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==row && row<4)
						out.print("* ");
					else if (col==3 && row>3)
						out.print("* ");
					else if ( (col==4 && row==2) || (col==5 && row==1))
						out.print("* ");
					else
						out.print("  ");
				}	
		out.println();
		}

	}
     
     void disp2(){

     	int row,col;
     	out.println();
		for(row=1;row<=5;row++){
			// for D
			    out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1 || col== 5 || row==1 || row==5)
						if(col==5 && (row==1 || row== 5))
							out.print("  ");
						else
							out.print("* ");
					else
						out.print("  ");
				}
			// for U
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1 || col== 5 || row==5)
						if(row==5 && (col==1 || col== 5))
							out.print("  ");
						else
							out.print("* ");
					else
						out.print("  ");
				}
			//for S
				out.print("\t");
				for(col=1;col<=5;col++){
					if(row==1||row==3||row==5){
						if((row==1&&col==1) || (row==3&&col==1) || (row==3&&col==5) || (row==5&&col==5))
							out.print("  ");
						else
							out.print("* ");
					}
					else if((col==1&&row==2) || (col==5&&row==4) )
						out.print("* ");
					else
						out.print("  ");
				}
			//for S
				out.print("\t");
				for(col=1;col<=5;col++){
					if(row==1||row==3||row==5){
						if((row==1&&col==1) || (row==3&&col==1) || (row==3&&col==5) || (row==5&&col==5))
							out.print("  ");
						else
							out.print("* ");
					}
					else if((col==1&&row==2) || (col==5&&row==4) )
						out.print("* ");
					else
						out.print("  ");
				}
			// for E
			    out.print("\t"); 
				for(col=1;col<=5;col++){
					if(col==1||row==1||row==3||row==5)
						out.print("* ");
					else
						out.print("  ");
				}
			//for H  
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1||col==5||row==3)
						out.print("* ");
					else
						out.print("  ");
				}	
	        // for R
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1||col==5||row==1||row==3){
						if((col==5 && row==4)||(col==5 && (row==1||row==3) ) )
							out.print("  ");
						else
							out.print("* ");
					}
					else if(col==row && row>3)
							out.print("* ");
					else
						out.print("  ");
				}	
			 // for A
				out.print("\t");
				for(col=1;col<=5;col++){
					if(col==1||col==5||row==1||row==3){
						if(row==1 &&(col==1 || col==5))
							out.print("  ");
						else
							out.print("* ");
					}
					else
						out.print("  ");
				}   
		out.println();
		}
     }

}



class WishMain{
	public static void main(String args[]){
		out.println("\n");
		WishStarPrint p=new WishStarPrint();
		p.disp1();
		p.disp2();
	}
}