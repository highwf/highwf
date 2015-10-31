public class GoodsManager {
	Goods[] goods = new Goods[3];

	public GoodsManager() {
		Goods a = new Goods();
		a.set(1, "����", 23);
		goods[0] = a;
		Goods b = new Goods();
		b.set(2, "����", 3);
		goods[1] = b;
		Goods c = new Goods();
		c.set(3, "������", 1);
		goods[2] = c;
	}

	public void show() {

		for (int i = 0; i < goods.length; i++) {

			if (goods[i] != null) {

				System.out.println("���:" + goods[i].getId() + "\t" + "��Ʒ����:"
						+ goods[i].getName() + "\t" + "�۸�:"
						+ goods[i].getPrice());

			}

		}

	}

	public int check(int id1) {
		for (int i = 0; i < goods.length; i++) {
			if (goods[i] != null) {
				if (goods[i].getId() == id1) {
					return i;
				}
			}
		}
		return -1;
	}

	public double qing(int[] nos, int[] nums) {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nos[i] != 0) {
				for (int j = 0; j < goods.length; j++) {
					if (nos[i] == goods[j].getId()) {
						double s = goods[j].getPrice() * nums[i];

						System.out.println(goods[j].getName()+"\t"
								+ goods[j].getPrice()+"\t" + nums[i]+"\t" + (s));
						sum = sum + s;
					}

				}

			}

		}
		return sum;

	}
}
