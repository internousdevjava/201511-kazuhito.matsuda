import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		while (true) {
			try {
				System.out.println("1.ファイル・フォルダの選択　2.新規作成　3.終了");
				BufferedReader bou = new BufferedReader(new InputStreamReader(System.in));
				String str = bou.readLine();

				switch (str) {
				case "1":
					System.out.println("ファイル名・フォルダ名を打つ");
					System.out.println("[例] > java TextStream C:\test\test.txt");
					BufferedReader jon = new BufferedReader(new InputStreamReader(System.in));
					String rei = jon.readLine();
					System.out.println("1.読み込み　2.書き込み");
					BufferedReader won = new BufferedReader(new InputStreamReader(System.in));
					String hei = won.readLine();

					switch (hei) {
					case "1":

						File file = new File(rei);
						BufferedReader br = new BufferedReader(new FileReader(file));
						String mei = br.readLine();

						while (mei != null) {
							System.out.println(mei);
							mei = br.readLine();

						}
						br.close();
						break;

					case "2":
						System.out.println("1.追記　2.上書き");
						BufferedReader fan = new BufferedReader(new InputStreamReader(System.in));
						String tou = fan.readLine();

						switch (tou) {
						case "1":
							BufferedReader kto = new BufferedReader(new InputStreamReader(System.in));
							String zen = kto.readLine();

							File oto = new File(rei);
							FileWriter filewriter = new FileWriter(oto, true);

							filewriter.write(zen);
							filewriter.close();
							break;
						case "2":
							File a = new File(rei);
							BufferedReader ko = new BufferedReader(new InputStreamReader(System.in));
							String to = ko.readLine();
							FileWriter filewr = new FileWriter(a, false);
							filewr.write(to);
							filewr.close();

						default:
							break;
						}

					default:
						break;
					}

				case "2":
					System.out.println("新しいファイルの名前を入れてください");
					System.out.println("[例] > java TextStream C:\test\test.txt");
					BufferedReader leo = new BufferedReader(new InputStreamReader(System.in));
					String ron = leo.readLine();




				// ファイルパスを指定する
				File file = new File(ron);
				// ディレクトリパスを取得する
				File dir=new File(file.getParent());

				if(!dir.exists()){
					System.out.println("フォルダがありません。:"+file.getAbsolutePath());
					dir.mkdirs();
					System.out.println("作成成功");
				} else {
					System.out.println("フォルダは既に存在します。");
				}

				if(file.exists()){
					System.out.println("ファイルは既に存在します。\n" + file.getAbsolutePath());
				}else{
					System.out.println("ファイルは存在しません。\n"+file.getAbsolutePath());
					try{
						if (file.createNewFile()){
							System.out.println("作成成功");
						}else{
							System.out.println("作成失敗");
						}
					}catch(IOException e){
						System.out.println(e);
					}
				}



				case "3":
					System.out.println("終了");
					break;

				}
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			break;
		}
		System.out.print("終了です");
		// メソッドの終了
	}

}
