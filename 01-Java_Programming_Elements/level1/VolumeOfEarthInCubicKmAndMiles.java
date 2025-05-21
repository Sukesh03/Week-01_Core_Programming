public class VolumeOfEarthInCubicKmAndMiles {
	public static void main(String[] args){
		double radius=6378;
		double milec=1.6*6378;
		double volume=4/3*Math.PI*(Math.pow(radius,3));
		double volumem=4/3*Math.PI*(Math.pow(milec,3));
		System.out.println("Volume of earth in cubic km: "+volume+" Volume of earth in cubic miles: "+volumem);
	}
}