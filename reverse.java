public class reverse {
	public static void main(String[] args) {
		String name = "Guvi PrOvIDING goooD PlatFoRM ";
		System.out.println(name);
		String split[] = name.split(" ");
		String result1 = "";
		for (int i = 0; i < split.length; i++) {
			char[] array = split[i].toCharArray();
			for (int j = 0; j < split[i].length(); j++) {
				if (Character.isLowerCase(array[j])) {
					array[j] = Character.toUpperCase(array[j]);
				} else {
					array[j] = Character.toLowerCase(array[j]);
				}
				result1 = result1 + array[j];
			}
			result1 = result1 + " ";
		}
		System.out.println(result1);

		String result = "";
		String split1[] = result1.split(" ");
		for (int i = 0; i < split1.length; i++) {
			StringBuffer sbsplit = new StringBuffer(split1[i]);
			sbsplit = sbsplit.reverse();
			result = result + " " + sbsplit;
		}
		System.out.println(result);
	}
}
