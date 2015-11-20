import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("１から１００までの数字を入れてください" + "\n");
		int x = 0;
		String tu = null;
		boolean jo = true;
		int y = 0;
		String mo = null;
		boolean rt = true;
		while (jo) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				tu = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (isNumber(tu)) {
				x = Integer.parseInt(tu);
				if ((x == 0) || (x > 100)) {
					System.out.println("もう一度打ってください");
					continue;
				} else {
					break;
				}
			} else {
				System.out.println("もう一度打ってください");
			}
		}
		while (rt) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				mo = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (isNumber(mo)) {
				y = Integer.parseInt(mo);
				if ((y == 0) || (y > 100)) {
					System.out.println("もう一度打ってください");
					continue;
				} else {
					break;
				}
			} else {
				System.out.println("もう一度打ってください");
			}
		}
		for (int ui = 1; ui <= y; ui++) {
			System.out.println();
			for (int pio = 1; pio <= x; pio++) {

				System.out.print(ui * pio + " ");
			}
		}
	}

	public static boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfex) {
			return false;
		}
	}
}

