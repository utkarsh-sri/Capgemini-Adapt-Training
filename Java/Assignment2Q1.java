class SingletonInheritanceCheck{
	public String str;
	private SingletonInheritanceCheck() {
		str="object created";
	}
	 static SingletonInheritanceCheck ob=null;
	public static SingletonInheritanceCheck getInstance() {
		if(ob==null) {
			ob=new SingletonInheritanceCheck();
		}
		return(ob);
	}
}
public class Assignment2Q1 {
	public static void main(String []args) {
		SingletonInheritanceCheck ob1=SingletonInheritanceCheck.getInstance();
		System.out.println(ob1.s);
	}
	
}