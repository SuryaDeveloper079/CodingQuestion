package PROGRAMS1000;

public class Decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="1212";

        char[] dig= s.toCharArray();
        int len=s.length();

        System.out.println(cnt_decoding_digits(dig, len));
		
		
	}
	
	public static int cnt_decoding_digits(char[] dig, int a)
    {
        int cnt[] = new int[a+ 1];

        cnt[0] = 1;

        cnt[1] = 1;

        for (int k = 2; k <= a; k++) 
        { 
            cnt[k] = 0; 

            cnt[k] = cnt[k-1];

            if (dig[k-2] == '1' || (dig[k-2] == '2' && dig[k-1] < '7') )

                cnt[k] += cnt[k-2];
        }
        return cnt[a];
    }

}
