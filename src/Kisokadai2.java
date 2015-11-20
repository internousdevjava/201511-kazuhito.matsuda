import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 */

/**
 * @author internous
 *
 */
public class Kisokadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		String tu = null;
		boolean jo = true;

		Random ban = new Random();

		int r = ban.nextInt(100) + 1;
		System.out.println("１から１００までの数字を入れてください"+"\n");

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
					System.out.println("１から１００までの数字を打ってください");
					continue;
				}
				if (x > r) {
					System.out.println("この数字より下です");
					continue;
				} else if (x < r) {
					System.out.println("この数字より上です");
					continue;
				} else {
					System.out.println("正解です");
					break;
				}
			} else {
				System.out.println("１から１００までの数字を打ってください");
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
