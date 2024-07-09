//Factory Design Pattern For Different types of OS used in Smart Phones.
interface OS{
	void speciality();
}
class Android implements OS{
	@Override
	public void speciality(){
		System.out.println("\nAndroid OS :: Open-Source and widely used OS.");
	}
}
class Ios implements OS{
	@Override
	public void speciality(){
		System.out.println("\nIOS OS :: Closed-Source and most secured OS.");
	}
}
class Windows implements OS{
	@Override
	public void speciality(){
		System.out.println("\nWindows OS :: About to die....");
	}
}
class OperatingSystemFactory{

	public OS getInstance(String str){

		if(str.equalsIgnoreCase("Android")){
			return new Android();
		}else if(str.equalsIgnoreCase("Ios")){
			return new Ios();
		}else if(str.equalsIgnoreCase("Windows")){
			return new Windows();
		}
		return null;
	}
}
public class FactoryDesignPattern{
	public static void main(String[] args) {
		
		OperatingSystemFactory osf = new OperatingSystemFactory();

		OS obj;

		obj = osf.getInstance("Android");
		obj.speciality();

		obj = osf.getInstance("Ios");
		obj.speciality();

		obj = osf.getInstance("Windows");
		obj.speciality();

	}
}