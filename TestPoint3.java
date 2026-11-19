

	void main(){

		Point3 A = new Point3(1,2,3);
		Point3 B = new Point3(4,6,3);

		IO.println(A.distanceTo(B));
		IO.println(A.vectorTo(B));
		IO.println(A.translate(A.vectorTo(B)));
		IO.println(A.midpoint(B));



	}
