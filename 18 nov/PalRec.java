class PalRec{
	public static void main(String[] args){
		PalRec p = new PalRec();
		String word = "rayudu";
		boolean res = p.palindrome(word, 0, word.length()-1);
		System.out.print(res);
		
	}
	
	boolean palindrome(String word, int start, int end){
		
		if(start<end){
			if(word.charAt(start)!=word.charAt(end)){
				return false;
			}
			palindrome(word, start+1, end-1);
		}
		return true;
	}
}