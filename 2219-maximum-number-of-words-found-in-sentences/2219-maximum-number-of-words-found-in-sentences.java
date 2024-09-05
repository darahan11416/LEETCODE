class Solution {
    public int mostWordsFound(String[] sentences) 
    {
           int maxwords = 0;
		   
		   for(String sentence : sentences)
		   {
			   //split word in string array
			   String[] words = sentence.split(" ");
			   
				
				maxwords = Math.max(maxwords,words.length);
				
		   }
		   return maxwords;
		   

        
    }
}