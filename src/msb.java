
public class msb {
public static void main(String args[])
{
	int m= -2;
	int msb = (m & (0x01<<31))>>31;
	System.out.println(msb);
}
}
