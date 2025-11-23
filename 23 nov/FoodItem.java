class FoodItem {
		String name;
		int id;
		int amount;
		
		FoodItem(String nam, int i, int a){
			name = nam;
			id = i;
			amount = a;
		}
		
		void print(){
			System.out.println(name + ", " + id + ", " + amount);
		}
		
		public static void main(String[] args){
			FoodItem f1 = new FoodItem("pizza", 3, 200);
			FoodItem f2 = new FoodItem("cake", 33, 300);
			FoodItem f3 = new FoodItem("cookies", 31, 400);
			
			f1.print();
			f2.print();
			f3.print();
		}
		
}
