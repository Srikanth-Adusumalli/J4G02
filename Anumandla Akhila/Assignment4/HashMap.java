package Assignment4;


	
	import java.util.Map;
import java.util.Map.Entry;
	public class HashMap {
		private Entry[] entrySet() {
			
			return null;
		}

		private void put(int i, String string) {
			
		}

	
			public static void main(String[] args) {
				
				HashMap hasgMap = new HashMap();
				
				hasgMap.put(1, "Aadhar");
				hasgMap.put(2, "Akhila");
				hasgMap.put(3, "baanusri");
				hasgMap.put(4, "kanni");
				hasgMap.put(5, "mary");
				hasgMap.put(6, "tillu");
				hasgMap.put(7, "upasy");
				hasgMap.put(8, "Gani");
				hasgMap.put(9, "rakhi");
				hasgMap.put(10, "shoaib");
				hasgMap.put(11, "Uma");
				hasgMap.put(12, "Teju");
				
				
				System.out.println("Itereating hashmap:");
				
				for(Map.Entry m: (hasgMap).entrySet()) {
					System.out.println(m.getKey()+" "+m.getValue());
				}

				
				
				

			}


		
			}

		


