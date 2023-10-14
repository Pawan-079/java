package stringtokenizer;
import java.util.StringTokenizer;
public class StringTokenizerDemo
{
    public static void main(String args[])
    {
        StringTokenizer st;
        st = new StringTokenizer("Welocme to niet"," ");
        int cnt = st.countTokens();
        System.out.println("No of tokens: "+cnt);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());        
        }
        System.out.println("----------------");
        st = new StringTokenizer("Welocme to niet","o");
        System.out.println("No of tokens: "+cnt);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());        
        }        
        System.out.println("----------------");
        st = new StringTokenizer("abcdefggfedcbaabcdefhg","afh");
        //bcde gg edcb  bcde  g
        cnt = st.countTokens();
        System.out.println("No of tokens: "+cnt);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());        
        }

    }
}