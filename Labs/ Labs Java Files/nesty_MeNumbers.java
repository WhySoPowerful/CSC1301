package labs;

public class nesty_MeNumbers {

		public static void main(String[] args) 	{	

			      int n = 5;
			        
			        for(int i=1; i<=5; i++) {
			            
			            for(int j=n-i; j>0; j--) {
			                
			                System.out.print(" ");
			                
			            }
			            
			            
			            for(int k=0; k<i ; k++) {
			                
			                System.out.print(k);
			                System.out.print(" ");
			            }
			            
			            
			            System.out.println();
			            
			        }
			    
			    }

			}