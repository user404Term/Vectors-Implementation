

	// A Point is a Location in time, A Vector is a displacement covered

	public class Point3{

		private double x;
		private double y;
		private double z;

	
		public Point3(double x, double y, double z){
			this.x = x;
			this.y = y;
			this.z = z;
		}


		// Finds distance b/w two points
		public double distanceTo(Point3 p){
			return Math.sqrt(
			((p.getX() - this.x)*(p.getX() - this.x))
			+ ((p.getY() - this.y)*(p.getY() - this.y)) 
			+ ((p.getZ() - this.z)*(p.getZ() - this.z)) );
		}




		public Vector3 vectorTo(Point3 Q){
			Vector3 v = new Vector3(Q.getX() - this.x, 
					Q.getY() - this.y,
					Q.getZ() - this.z ); 	
			
			return v;

		}
		


		public Point3 translate(Vector3 v){
			Point3 np = new Point3((v.getX() + this.x),
					(v.getY() + this.y),
					(v.getZ() + this.z));
			return np;

		}

		public Point3 midpoint(Point3 B){
			Point3 middlePoint = new Point3(
				((B.getX() + this.x) / 2),
				((B.getY() + this.y) / 2),
				((B.getZ() + this.z) / 2 )
					);	

			return middlePoint;
		}
		



		// Getters

		public double getX(){ 
			return this.x; 
		}

		public double getY(){
			return this.y;
		}

		public double getZ(){
			return this.z;
		}


		// toString()

		@Override
		public String toString(){
			return "( " + this.x + ", " + this.y + ", " 
				+ this.z + " )" ;
		}





	} // class
