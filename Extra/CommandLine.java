class CommandLine{
	public static void main(String args[]){
		/*for( int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}*/
		
		/*for( int i=0; i<args.length;i++){
			args[i]="Test"
			System.out.println(args[i]);
		}*/
		
		int sum=0;
		int lar=Integer.parseInt(args[0]);
		for( int i=0; i<args.length;i++){
			sum=sum+Integer.parseInt(args[i]);
			if(lar<Integer.parseInt(args[i])){
				lar=Integer.parseInt(args[i]);
			}
		}
		System.out.println(sum);
		System.out.println(lar);
		
		/*for(String x: args){
			System.out.println(x);
		}
		
		for(String x: args){
			x="Test"
			System.out.println(x);
		}*/
	}
}