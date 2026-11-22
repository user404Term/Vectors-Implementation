


	

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


		// Dot Product
		
		public double dotProduct(Vector3 v){
			return ( (v.getX() * this.x) +
				 (v.getY() * this.y) +
			         (v.getZ() * this.z) );
		}
		
		// Angle between Vectors
		public double angleBetweenVectors(Vector3 v){
			if(magnitude() == 0 || v.magnitude() == 0){
			throw new IllegalArgumentException("Angle undefined for zero vector");
			} else {
			double cosTheta = dotProduct(v) / (magnitude() * v.magnitude());
			cosTheta = Math.max(-1.0, Math.min(1.0, cosTheta));
			return toDegrees(Math.acos(cosTheta));
			}
		}


		// Calculating Directional Angles

		public double[] directionalAngles(){
			double mag = magnitude();
			double[] angles = new double[3];	
			if (mag== 0){
				throw new IllegalArgumentException("Directional Angle undefined for zero vector");
			} else {
				double cosAlpha = this.x / mag;
    				double cosBeta  = this.y / mag;
    				double cosGamma = this.z / mag;
				
				  // Clamped each cosine value
				cosAlpha = Math.max(-1.0, Math.min(1.0, cosAlpha));
				cosBeta = Math.max(-1.0, Math.min(1.0, cosBeta));
				cosGamma = Math.max(-1.0, Math.min(1.0, cosGamma));

				// Calculating three angles
				angles[0] = toDegrees(Math.acos(cosAlpha));
				angles[1] = toDegrees(Math.acos(cosBeta));
				angles[2] = toDegrees(Math.acos(cosGamma));

				return angles;

			}

		}	
		

		

		// Converting radians into degrees manually
		public double toDegrees(double radians){
			return radians * (180 / Math.PI);
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
