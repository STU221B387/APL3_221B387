class Two extends One{
	//error: constructor One in class One cannot be applied to given types 
    //reason: actual and formal argument lists differ in length
    Two(int x){
        super(x);
    }
}