public class CmdLineArgs {
	public static void main(String[] args) {
		for(String a : args) {
			int arg = Integer.parseInt(a);
			System.out.println(arg + ", " + ((Object)arg).getClass().getSimpleName());
		}
		
		System.out.println("args.length: " + args.length);
	}
}