//R4_7
/*public class Prime extends MyFrame2 {
	
	int n=47+50;
	public void run() {
		
		
		int y = 50;
		for (int i=0 ; i<(int)n/10+1 ; i++) {
			
			
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				
				if(j+i*10+1<n) {
					setColor(255,255,255);
					x+=20;
					fillRect(x,y,10,10);
				}
				setColor(0,0,0);
				x+=20;
				fillRect(x,y,10,10);
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new Prime();
		frame1.setLocation(200,100);
		frame1.setSize(300,600);
/*
public class Prime extends MyFrame2 {
	public void run() {
		
		int n=47+50;
		int y = 50;
		for (int i=0 ; i<n ; i++) {
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				fillRect(x,y,10,10);
				x+=20;
			}
			y+=20;
		}
		
		
		for(int i=0 ; i<n ; i++) {
			int x=30;
			if(i<2) {
				for(int j=0 ; j<10 ; j++) {
					setColor(0,128,0);
					fillRect(x,y,10,10);
					x+=20;
				}
				y+=20;
			}
			else {
				for(int j=0 ; j<10 ; j++) {
					fillRect(x,y,10,10);
					x+=20;
				}
				y+=20;
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new Prime();
		frame1.setLocation(0,0);
		frame1.setSize(300,1000);

	}
}*/

public class Prime extends MyFrame2 {
	public void run() {
		int n=47+50;
		int x;
		int y;
		for (int i=0 ; i<n ; i++) {
			//setColor(175,223,228);
			
			
			
			if(i==0 || i==1) {
				setColor(175,223,228);
			}else if(2*2<=i && i%2==0) {
				setColor(175,223,228);
			}else if(3*3<=i && i%3==0) {
				setColor(175,223,228);
			}else if(4*4<=i && i%4==0) {
				setColor(175,223,228);
			}else if(5*5<=i && i%5==0) {
				setColor(175,223,228);
			}else if(6*6<=i && i%6==0) {
				setColor(175,223,228);
			}else if(7*7<=i && i%7==0) {
				setColor(175,223,228);
			}else if(8*8<=i && i%8==0) {
				setColor(175,223,228);
			}else if(9*9<=i && i%9==0) {
				setColor(175,223,228);
			}else if(10*10<=i && i%10==0) {
				setColor(175,223,228);
			}else if(11*11<=i && i%11==0) {
				setColor(175,223,228);
			}else if(12*12<=i && i%12==0) {
				setColor(175,223,228);
			}else if(2<=i && i<=n-1) {
				setColor(0,0,0);
			}
			
			x=30+20*(i%10);
			y=80+20*(i/10);
			fillRect(x,y,10,10);
		}

	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new Prime();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}

}



