

public class  room{

	 private double width;

	 private double length;

	 private int floor;

	 

	 room()

	 {

		width = 10;

		length = 12.5;

		floor = 1;

	 }

	 

	 public void setWidth(double width) {

		 if(width>0) {

			 width = 10;

		 }else {

			 this.width = width;

		 }

		 

	 }

	 public void setLength(double length) {

		 if(length>0) {

			length = 12.5;

		 }else {

			 this.length= length;

		 }

	 }



	 public void setFloor (int floor)

	 {

		 this.floor = floor;

	 }



	 public double getWidth ()

	 {

		 return this.width;

	 }



	 public double getLength ()

	 {

		 return this.length;

	 }

	 public int getFloor()

	 {

		 return this.floor;

	 }



	 room(double first,double second ,int floor)

	 { 

		 if (first > second)

		 {

			 this.setLength = first;

			 this.setWidth = second;

			 this.setFloor = floor;

		 }

		 else

		 {

			 this.setLength = second;

			 this.setWidth = first;

			 this.setFloor = floor;

		 }

		 



	 }

	 

	 @override

	 public String toString()

	 {

		 return this.getLength + " x " + this.getWidth + ", floor " + this.getFloor + "\n";

	 } 





	 public static void main(String [] args) {

}

}



public class classroom extends room

{

	private int numStudents;



	public int getNumStudents()

	{

		return this.numStudents;

	}

	public void setNumStudents(int numStudents)

	{

		this.numStudents = numStudents;

	}



	classroom (double first,double second,int floor,int numStudents)

	{

		if (first > second)

		 {

			 this.setLength = first;

			 this.setWidth = second;

			 this.setFloor = floor;

			 this.numStudents=this.setNumStudents;

		 }

		 else

		 {

			 this.setLength = second;

			 this.setWidth = first;

			 this.setFloor = floor;

			 this.numStudents=this.setNumStudents;

		 }

	}



	 @override

	 public String toString()

	 {

		 return this.getLength + " x " + this.getWidth + ", floor " + this.getFloor + 

		 ", capacity = " + this.getNumStudents + " students\n";

	 } 



}

