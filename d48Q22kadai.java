//s23013
//d48Q22の課題をコンパイルエラーしないように

enum Connection {OFFLINE, ONLINE}

class d48Q22kadai {
	public static void main(String[] args) {
		Connection s =Connection.OFFLINE;
		if (s == Connection.OFFLINE){
			s = Connection.ONLINE;
		}
		System.out.println(s);
	}
}
