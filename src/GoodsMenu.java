import java.util.Scanner;

public class GoodsMenu {
	static GoodsManager goodsManager = new GoodsManager();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1.mai 2.exit");
			int input = s.nextInt();
			switch (input) {
			case 1:
				mai();
				break;

			case 2:
				break;
			}
		}
	}

	public static void mai() {
		int[] nos = new int[10];
		int[] nums = new int[10];
		while (true) {
			goodsManager.show();
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ�������Ʒ��ţ�");
			int id1 = scanner.nextInt();
			int index = goodsManager.check(id1);
			if (index >= 0) {
				System.out.println("������Ҫ�������Ʒ������");
				int num = scanner.nextInt();
				for (int i = 0; i < nos.length; i++) {
					if (nos[i] == 0) {
						nos[i] = id1;
						nums[i] = num;
						break;
					}

				}
				System.out.println("�Ƿ��������Y/N");
				String n = scanner.next();
				if (n.toUpperCase().equals("N")) {
					double sum = goodsManager.qing(nos, nums);
					System.out.println(sum);
					break;
				}
			}
		}

	}

}
