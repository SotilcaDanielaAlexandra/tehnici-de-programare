
public class SandwichStoreTest {
	public static void main(String[] args) {
		SandwichStore tokyoStore = new TokyoSandwichStore();
		SandwichStore sibiuStore = new SibiuSandwichStore();
 
		Sandwich sandwichTokyo = tokyoStore.orderSandwich("grilled meat");
		System.out.println("Client in Tokyo Sandwich Shop ordered a " + sandwichTokyo + "\n");
		
		sandwichTokyo = tokyoStore.orderSandwich("vegan");
		System.out.println("Client in Tokyo Sandwich Shop ordered a " + sandwichTokyo + "\n");
 
		Sandwich sandwichSibiu = sibiuStore.orderSandwich("grilled meat");
		System.out.println("Client in Sibiu Sandwich Shop ordered a " + sandwichSibiu + "\n");

		sandwichSibiu = tokyoStore.orderSandwich("vegan");
		System.out.println("Client in Sibiu Sandwich Shop ordered a " + sandwichSibiu + "\n");
	}
}
