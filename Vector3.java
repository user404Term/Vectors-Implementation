


	import java.lang.Object;

	public class Vector3{
		
		private double x;
		private double y;
		private double z;

		public Vector3(double x, double y, double z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
		

		// Finds and returns Vector magnitude

		public double magnitude(){
			return Math.sqrt( (this.x * this.x) + (this.y * this.y) +
				 (this.z * this.z) );
		}

		public double magnitude(Vector3 v){
			Vector3 u = new Vector3( (v.getX() * v.getX()), 
					(v.getY() * v.getY()), 
					(v.getZ() * v.getZ()) );
			
			return Math.sqrt(u.getX() + u.getY() + u.getZ() );
		}


		// Vector Operations
		
		// Additon	
		public Vector3 add(Vector3 v){
			Vector3 u = new Vector3(this.x + v.getX(),
					this.y + v.getY(), 
					this.z + v.getZ());
			return u;

		}

		// Subtraction
		public Vector3 subtract(Vector3 v){
			Vector3 u = new Vector3(this.x - v.getX(),
					this.y - v.getY(), 
					this.z - v.getZ());
			return u;

		}

		// Multiplication -> Scaler Multiplication
		public Vector3 multiply(double c){
			Vector3 u = new Vector3(this.x * c, this.y * c,
					this.z * c);
			return u;
		}


		// Negate
		public Vector3 negate(){
			Vector3 u = new Vector3((this.x * -1), 
					(this.y * -1), 
					(this.z * -1));
			return u;
		}

		

			
		// Gets Vector Components

		public double getX(){
			return this.x;
		}


		public double getY(){
			return this.y;
		}


		public double getZ(){
			return this.z;
		}

		
		@Override
		public String toString(){	
			return "< " + this.x  + ", " + this.y 
					+ ", " + this.z + " >"; 		
		}




	}
