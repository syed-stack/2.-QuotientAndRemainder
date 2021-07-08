package Collections;
import java.util.StringTokenizer;

public class LinearDataOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java,jee,python";
		
		StringTokenizer st=new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
