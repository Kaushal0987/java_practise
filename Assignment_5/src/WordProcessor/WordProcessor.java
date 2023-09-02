package WordProcessor;

interface Counter {
	int countWords(String sentence); 
	int countLetters(String sentence); 
	int getLength(String sentence);
}	

class WordProcessor implements Counter{
	public int countWords(String sentence) {
		int cnt=0;
		for(int i=0; i<sentence.length(); i++) {
			if(Character.isWhitespace(sentence.charAt(i))) {
				cnt++;
			}
		}
		
		return cnt+1;
	}
	
	public int countLetters(String sentence) {
		return sentence.length();
	}
	
	public int getLength(String sentence) {
		int cnt=0;
		for(int i=0; i<sentence.length(); i++) {
			if(Character.isAlphabetic(sentence.charAt(i))) {
				cnt++;
			}
		}
		
		return cnt;
	}
}