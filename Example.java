class Box{
	int length;	
	int width;	
	int height;	
	Box(int length, int width, int height){ 
		this.length=length;
		this.width=width;
		this.height=height;
		System.out.println("Box(int,int,int)");
	}
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public void setSize(int length, int width, int height){ 
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Example{
	public static void main(String args[]){
		Box b1=new Box(12,5,3); 
		b1.printVolume();
		
		Box b2=new Box(120,50,30);
		b2.printVolume();
	}
}
