package lab01;

public class Triangle {
	private int a,b,c;
	
	public Triangle(int side1, int side2, int side3){
        if(side1 > 0 && side2 > 0 && side3 > 0 
        		&& side1 + side2 > side3 && side2 +side3 > side1 && side1 + side3 > side2){
        	a = side1;
        	b = side2;
        	c = side3;
        }
        else
        	a = b = c = 1;         
    
	} 
	public boolean isEquilatera(){
        return (a == b && b == c);
    }
    public boolean isIsosceles(){
        return (a == b || a == c || b == c);
    }
    public boolean isScalene(){
        return !isEquilatera();
    }
    
    
    
    
    public static void main(String[] args){
        Triangle tri = new Triangle(5,5,5);
        System.out.println(tri.isEquilatera());
        System.out.println(tri.isIsosceles());
        System.out.println(tri.isScalene());
    }

}
