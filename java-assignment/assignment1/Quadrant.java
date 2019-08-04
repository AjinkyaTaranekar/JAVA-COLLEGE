import java.util.Scanner;
    class Quadrant {
        private
        	double x,y;
        public double getX() {
			return x;
		}
		public double getY() {
			return y;
		}        
        public void setX(double x) {
			this.x = x;
		}
		public void setY(double y) {
			this.y = y;
		}
		
		public int quadrant(double x, double y) {
			if(x==0){
            	if(y==0)
            		return 0;
            	else
            		return -2;
            }
			if(x>0){
                if(y>0){
                    return 1;
                }
                else{
                    return 4;
                }
            }
			else if(y>0){
                return 2;
            }
            else  if(y<0){
                return 3;
            }
            else
            	return -1;
        }
        public static void main(String args[]) {
            Quadrant quadrant = new Quadrant();
            Scanner scan=new Scanner(System.in);
            
            double x=scan.nextDouble();
            quadrant.setX(x);
            
            double y=scan.nextDouble();
            quadrant.setY(y);
            
            scan.close();
            
            System.out.println(quadrant.quadrant(quadrant.getX(),quadrant.getY()));
        }
		
		
    }