class Solution {
    public String truncateSentence(String s, int k) 
    {
        String[] word = s.split(" ");

        StringBuilder truncate = new StringBuilder();


        for(int i=0;i<k;i++)
        {
            truncate.append(word[i]);
            if(i<k-1)
            {
                truncate.append(" ");
            }



        }
        return truncate.toString();


        
    }
}