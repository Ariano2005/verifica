
public class CognomeNomeClass {
/*
 * @author Venneri Ariano
 * @titolo CognomeNomeClass
 * @data 04/02/2023
 */
	
	
	public int cognomeMet(int s,int f) {
		int r=0;
		for(int i=1;i<f;i++) {
			r=r+r;
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CognomeNomeClass a=new CognomeNomeClass();
		System.out.println(a.cognomeMet(5, 7));

	}

}
