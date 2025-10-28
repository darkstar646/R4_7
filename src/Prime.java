//R4_7
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
}
*/


public class Prime extends MyFrame2 {
	public void run() {
		int n=47+50;
		int x;
		int y;
		for (int i=0 ; i<n ; i++) {
			setColor(0,0,0);
			int a=i%10;
			int b=i/10;
			x=30+20*a;
			y=80+20*b;
			fillRect(x,y,10,10);
			}

	}
	
	public static void main(String[] args) {
		MyFrame2 frame1=new Prime();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}

