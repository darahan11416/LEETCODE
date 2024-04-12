
public class palindrome
{
    public boolean ispalin(int x)
    {

        String re = "";
        String s = Integer.toString(x);
        for(int i=s.length()-1;i>=0;i--)
        {

            re = re+s.charAt(i);


        }
int rev = Integer.parseInt(re);



        return x==rev;
    }
public static void main(String args[])
{
    palindrome p = new palindrome();
    System.out.println(p.ispalin(-121));



}




}
