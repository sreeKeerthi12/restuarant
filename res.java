import java.util.*;
class color
{
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String bold="\u001B[1m";
    public static final String underline="\u001B[21m";
    public static final String blink="\u001B[5m";

    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    // Background colors
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    // More text colors
    public static final String ORANGE = "\u001B[38;5;208m";  
    public static final String PURPLE = "\u001B[38;5;135m"; 
    public static final String PINK = "\u001B[38;5;205m";    
    public static final String TEAL = "\u001B[38;5;78m";   
  
     public static final String BG_SKY_BLUE = "\u001B[38;5;117m";  // Sky blue text
    public static final String BG_ROSE = "\u001B[38;5;211m";       // Rose text
    public static final String BG_LEMON = "\u001B[38;5;227m";      // Lemon text
    public static final String BG_TURQUOISE = "\u001B[38;5;45m";  // Turquoise text

    public static final String BG_GRAY = "\u001B[48;5;236m";  // Gray background
    public static final String BG_GOLD = "\u001B[48;5;220m";  // Gold background
    public static final String BG_LAVENDER = "\u001B[48;5;183m"; // Lavender background
    public static final String BG_SALMON = "\u001B[48;5;209m"; // Salmon background

}
class vegStarters
{
	Items x=new Items();
	Food obj = new Food();
	double vegmanchuria(int quantity){
		return quantity*150;
	}

	double alu65(int quantity){
		return quantity*170;
	}

	double crispyCorn(int quantity){
		return quantity*170;
	}

	double vegSpinRools(int quantity)
	{
		return quantity*150;
	}
	void selection(){
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t1-Veg-manchuria -->Rs.150.0"+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t2-Alu65 -->Rs.170.0"+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t3-CrispyCorn -->Rs.170.0"+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t4-VegSpinRolls -->Rs.150.0"+color.RESET);
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+vegmanchuria(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+alu65(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+crispyCorn(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+vegSpinRools(vegrices.sc.nextInt());
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}

}

class nonvegStarters{
	Food obj = new Food();
	Items x=new Items();
	double ApolloFish(int quantity){
		return quantity*240;
	}

	double PrawnsManchuria(int quantity){
		return quantity*240;
	}

	double DragonChicken(int quantity){
		return quantity*200;
	}

	double ChickenLollipop(int quantity){
		return quantity*275;
	}

	double Chicken65(int quantity){
		return quantity*200;
	}

	void selection(){
		
		System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t1-ApolloFish -->Rs.240.0"+color.RESET);
		System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t2-PrawnsManchuria -->Rs.240.0"+color.RESET);
		System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t3-DragonChicken -->Rs.200.0"+color.RESET);
		System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t4-ChickenLollipop -->Rs.275.0"+color.RESET);
		System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t5-Chicken65 -->Rs.200.0"+color.RESET);
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+ApolloFish(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+PrawnsManchuria(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+DragonChicken(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+ChickenLollipop(vegrices.sc.nextInt());
		}

		else if(n1==5){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+Chicken65(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}

class vegrices{
	static Scanner sc = new Scanner(System.in);
	Food obj = new Food();
	Items x=new Items();
	double vegFiredRice(int quantity){
		return quantity*150;
	}

	double vegPalavo(int quantity){
		return quantity*180;
	}

	double vegBiriyani(int quantity){
		return quantity*200;
	}

	void selection(){
		
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\t1-Veg Fried Rice -->Rs.150.0"+color.RESET);
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\t2-Veg Palav -->Rs.180.0"+color.RESET);
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\t3-Veg Biriyani -->Rs.200.0"+color.RESET);
		int n1 = sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+vegFiredRice(sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+vegPalavo(sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+vegBiriyani(sc.nextInt());
			
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}

class nonvegrices{
	Items x=new Items();
	Food obj = new Food();
	double nonvegFiredRice(int quantity){
		return quantity*250;
	}

	double nonvegPalavo(int quantity){
		return quantity*280;
	}

	double nonvegBiriyani(int quantity){
		return quantity*300;
	}
	
	void selection(){
		System.out.println(color.PURPLE+"\t\t\t\t\t1-Non-veg Fried Rice -->Rs.250.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t2-Non-veg Palav -->Rs.280.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t3-Non-veg Biriyani -->Rs.300.0"+color.RESET);
		
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+nonvegFiredRice(vegrices.sc.nextInt());
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+nonvegPalavo(vegrices.sc.nextInt());
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+nonvegBiriyani(vegrices.sc.nextInt());
		}
		else if(n1==4){
			selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}
class desserts{
	static Scanner sc = new Scanner(System.in);
	Food obj = new Food();
	Items x=new Items();
	double cakesandCupcakes(int quantity){
		return quantity*300;
	}

	double iceCreams(int quantity){
		return quantity*250;
	}

	double  SizzlingBrownie(int quantity){
		return quantity*480;
	}
	double  chocolateMousse(int quantity){
		return quantity*370;
	}
	
	void selection(){
		System.out.println(color.PURPLE+"\t\t\t\t\t1-Cakes and Cupcakes -->Rs.300.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t2-IceCreams -->Rs.250.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t3-Sizzling Brownie-->Rs.480.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t4- chocolate Mousse-->Rs.370.0"+color.RESET);
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+cakesandCupcakes(vegrices.sc.nextInt());
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+iceCreams(vegrices.sc.nextInt());
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+SizzlingBrownie(vegrices.sc.nextInt());
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+chocolateMousse(vegrices.sc.nextInt());
		}
		else if(n1==5){
			selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}
class mocktails{
	static Scanner sc = new Scanner(System.in);
	Food obj = new Food();
	Items x=new Items();
	double fruitPunch(int quantity){
		return quantity*120;
	}

	double greenApple(int quantity){
		return quantity*99;
	}

	double  strawberry(int quantity){
		return quantity*99;
	}
	double  lychee(int quantity){
		return quantity*110;
	}
	
	void selection(){
		System.out.println(color.PURPLE+"\t\t\t\t\t1- Fruit Punch-->Rs.120.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t2-Green Apple -->Rs.99.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t3-Strawberry-->Rs.99.0"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\t4- Lychee-->Rs.110.0"+color.RESET);
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+fruitPunch(vegrices.sc.nextInt());
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+greenApple(vegrices.sc.nextInt());
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+ strawberry(vegrices.sc.nextInt());
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj.bill = obj.bill+lychee(vegrices.sc.nextInt());
		}
		else if(n1==5){
			selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}
class vodka{
	Food obj1=new Food();
	Liquids obj = new Liquids();
	Items x=new Items();
	double magicMoment(int quantity){
		return quantity*800;
	}

	double absoluteVodka(int quantity){
		return quantity*3000;
	}

	double greyGoose(int quantity){
		return quantity*3500;
	}

	double smirGoof(int quantity){
		return quantity*2000;
	}

	void selection(){
		
		System.out.println(color.ORANGE+"\t\t\t\t\t1-MagicMoment -->Rs.800.0"+color.RESET);
		System.out.println(color.ORANGE+"\t\t\t\t\t2-Absolute Vodka -->Rs.3000.0"+color.RESET);
		System.out.println(color.ORANGE+"\t\t\t\t\t3-GreyGoose -->Rs.3500.0"+color.RESET);
		System.out.println(color.ORANGE+"\t\t\t\t\t4-SmirGoof -->Rs.2000.0"+color.RESET);
		
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+magicMoment(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+absoluteVodka(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+greyGoose(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+smirGoof(vegrices.sc.nextInt());
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj1.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}

class whisky{
	Food obj1=new Food();
	Liquids obj = new Liquids();
	Items x=new Items();
	double johnnieWalker(int quantity){
		return quantity*22000;
	}

	double jackDaniels(int quantity){
		return quantity*2700;
	}

	double redLable(int quantity){
		return quantity*3600;
	}

	double blackDog(int quantity){
		return quantity*1200;
	}

	double royalGreen(int quantity){
		return quantity*800;
	}

	void selection(){
		
		System.out.println(color.GREEN+"\t\t\t\t\t1-JohnnieWalker -->Rs.22000.0"+color.RESET);
		System.out.println(color.GREEN+"\t\t\t\t\t2-JackDaniels -->Rs.2700.0"+color.RESET);
		System.out.println(color.GREEN+"\t\t\t\t\t3-RedLable -->Rs.3600.0"+color.RESET);
		System.out.println(color.GREEN+"\t\t\t\t\t4-BlackDog -->Rs.1200.0"+color.RESET);
		System.out.println(color.GREEN+"\t\t\t\t\t5-RoyalGreen -->Rs.800.0"+color.RESET);
		
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+johnnieWalker(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+jackDaniels(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+redLable(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+blackDog(vegrices.sc.nextInt());
		}
		else if(n1==5){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+royalGreen(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj1.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}

class brandy{
	Food obj1=new Food();
	Liquids obj = new Liquids();
	Items x=new Items();
	double manshinHouse(int quantity){
		return quantity*800;
	}

	double morpehous(int quantity){
		return quantity*1200;
	}

	double mcDowellis(int quantity){
		return quantity*1200;
	}

	double kingLouis(int quantity){
		return quantity*8000;
	}


	void selection(){
		
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t1-MansionHouse -->Rs.800.0"+color.RESET);
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t2-Morpehous -->Rs.1200.0"+color.RESET);
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t3-McDowellis -->Rs.1200.0"+color.RESET);
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t4-KingLouis -->Rs.8000.0"+color.RESET);
		
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+manshinHouse(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+morpehous(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+mcDowellis(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+kingLouis(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
	
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj1.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}
}

class beers{
	Liquids obj = new Liquids();
	Food obj1=new Food();
	Items x=new Items();
	double kingFisher(int quantity){
		return quantity*170;
	}

	double knockOut(int quantity){
		return quantity*150;
	}

	double budwiser(int quantity){
		return quantity*200;
	}

	double carlesberg(int quantity){
		return quantity*200;
	}


	void selection(){
		
		System.out.println(color.PINK+"\t\t\t\t\t1-Carlesberg -->Rs.170.0"+color.RESET);
		System.out.println(color.PINK+"\t\t\t\t\t2-KnockOut -->Rs.150.0"+color.RESET);
		System.out.println(color.PINK+"\t\t\t\t\t3-Budwiser -->Rs.200.0"+color.RESET);
		System.out.println(color.PINK+"\t\t\t\t\t4-Carlesberg -->Rs.200.0"+color.RESET);
		
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+carlesberg(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+knockOut(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+budwiser(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			obj1.bill = obj1.bill+carlesberg(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Go to menu to order Again:\n\t\t\t\t\t2.Billing:"+color.RESET);
		int n2 = vegrices.sc.nextInt();
		if(n2==1){
			x.items();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tTotal bill amount: "+obj1.bill+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
		}
	}

}

class Food{
	static double bill;
	Items  item = new Items();
	void food(){
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Veg Starters "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.Non-veg Starters "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t3.Veg Rices "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t4.Non-veg Rices "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t5.Desserts "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t6.Mocktails "+color.RESET);
		int f = vegrices.sc.nextInt();
		if(f==1){
			vegStarters x1 = new vegStarters();
			x1.selection();
		}
		else if(f==2){
			nonvegStarters x2 = new nonvegStarters();
			x2.selection();
		}
		else if(f==3){
			vegrices x3 = new vegrices();
			x3.selection();
		}
		else if(f==4){
			nonvegrices x4 = new nonvegrices();
			x4.selection();
		}
		else if(f==5){
			desserts x5 = new desserts();
			x5.selection();
		}
		else if(f==6){
			mocktails x6 = new mocktails();
			x6.selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Menu again  "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				food();
			}
			else if(inv==2){
				item.items();
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class Liquids{
	Items  item = new Items();
	void liquids(){
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t1.Vodka"+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t2.Whisky "+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t3.Brandy"+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t4.Beers"+color.RESET);
		int l = vegrices.sc.nextInt();
		if(l==1){
			vodka l1 = new vodka();
			l1.selection();
		}
		else if(l==2){
			whisky l2 = new whisky();
			l2.selection();
		}
		else if(l==3){
			brandy l3 = new brandy();
			l3.selection();
		}
		else if(l==4){
			beers l4 = new beers();
			l4.selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Menu Again "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit"+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				liquids();
			}
			else if(inv==2){
				item.items();
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}

class Items{
	void items(){
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t1.Foods"+color.RESET);
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t2.Liquids"+color.RESET);
		int it = vegrices.sc.nextInt();
		if(it==1){
			Food it1 = new Food();
			it1.food();
		}
		else if(it==2){
			Liquids it2 = new Liquids();
			it2.liquids();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				items();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class Items1{
	void items1(){
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t1.Foods,Desserts and Mocktails"+color.RESET);
		int it = vegrices.sc.nextInt();
		if(it==1){
			Food it1 = new Food();
			it1.food();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				items1();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class Restuarant1{
	void restuarant1(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t          ---------------------------------------"     +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t\t  |             WELCOME TO               |"     +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t\t  |      Chaitanya Bar & Restuarant      |"     +color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t          ---------------------------------------"     +color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r1 = vegrices.sc.nextInt();
		if(r1==1){
			Items r11 = new Items();
			r11.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit"+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant1();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
		
			}
		}
	}
}
class Restuarant2{
	//restuarant obj = new restuarant();
	void restuarant2(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"        +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |               WELCOME TO            |"        +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |   Sitara Grand Bar & Restuarant     |"+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r2 = vegrices.sc.nextInt();
		if(r2==1){
			Items r21 = new Items();
			r21.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant2();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant3{
	//restuarant obj = new restuarant();
	void restuarant3(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------" +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            WELCOME TO               |" +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |        Kritunga Restuarant          |" +color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r3 = vegrices.sc.nextInt();
		if(r3==1){
			Items1 r31 = new Items1();
			r31.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant3();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant4{
	//restuarant obj = new restuarant();
	void restuarant4(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |           WELCOME TO                 |"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |  Platform 65 The Train Restuarant    | "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r4 = vegrices.sc.nextInt();
		if(r4==1){
			Items1 r41 = new Items1();
			r41.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant4();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant5{
	//restuarant obj = new restuarant();
	void restuarant5(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            WELCOME TO                |"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |      Once Upon A Time Restuarant     |"+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r5 = vegrices.sc.nextInt();
		if(r5==1){
			Items1 r51 = new Items1();
			r51.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant5();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant6{
	//restuarant obj = new restuarant();
	void restuarant6(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"   +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |              WELCOME TO             |" +color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |    Rayalaseema Ruchulu Restuarant   | "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r6 = vegrices.sc.nextInt();
		if(r6==1){
			Items1 r61 = new Items1();
			r61.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant6();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant7{
	//restuarant obj = new restuarant();
	void restuarant7(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |               WELCOME TO             |"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            Tulips Restuarant         |   "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r7 = vegrices.sc.nextInt();
		if(r7==1){
			Items1 r71 = new Items1();
			r71.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant7();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant8{
	//restuarant obj = new restuarant();
	void restuarant8(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            WELCOME TO                |"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |        Bawarchi Restuarant           |   "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r8 = vegrices.sc.nextInt();
		if(r8==1){
			Items1 r81 = new Items1();
			r81.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant8();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant9{
	//restuarant obj = new restuarant();
	void restuarant9(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |           WELCOME TO                 |"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |        Paradise Restuarant           | "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r9 = vegrices.sc.nextInt();
		if(r9==1){
			Items1 r91 = new Items1();
			r91.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant9();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant10{
	//restuarant obj = new restuarant();
	void restuarant10(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |          WELCOME TO                 | "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |        Mehfil Restuarant            |     "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r10 = vegrices.sc.nextInt();
		if(r10==1){
			Items1 r101 = new Items1();
			r101.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant10();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant11{
	//restuarant obj = new restuarant();
	void restuarant11(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            WELCOME TO               |  "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |      Naidu Gari Kunda Biryani       | " +color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r11 = vegrices.sc.nextInt();
		if(r11==1){
			Items1 r111 = new Items1();
			r111.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant11();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant12{
	//restuarant obj = new restuarant();
	void restuarant12(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            WELCOME TO               |           "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |             HOT BOX                 | "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r12 = vegrices.sc.nextInt();
		if(r12==1){
			Items1 r121 = new Items1();
			r121.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant12();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant13{
	//restuarant obj = new restuarant();
	void restuarant13(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |                WELCOME TO            |  "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |                  Bar One             |   "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r13 = vegrices.sc.nextInt();
		if(r13==1){
			Items r131 = new Items();
			r131.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant13();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant14{
	//restuarant obj = new restuarant();
	void restuarant14(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |           WELCOME TO                |  "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            Flechazo                 | "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r14 = vegrices.sc.nextInt();
		if(r14==1){
			Items1 r141 = new Items1();
			r141.items1();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant14();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant15{
	//restuarant obj = new restuarant();
	void restuarant15(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |             WELCOME TO                | "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |    The Grand Trunk Road Restaurant    |  "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r15 = vegrices.sc.nextInt();
		if(r15==1){
			Items r151 = new Items();
			r151.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant15();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant16{
	//restuarant obj = new restuarant();
	void restuarant16(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            WELCOME TO                | "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |     Habibi Mandi and Restaurant      | "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r16 = vegrices.sc.nextInt();
		if(r16==1){
			Items r161 = new Items();
			r161.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant16();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}
class Restuarant17{
	//restuarant obj = new restuarant();
	void restuarant17(){
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |            WELCOME TO                | "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+color.bold+color.blink+"\t\t\t\t\t\t    |         Chaitanya Food Court         | "+color.RESET);
		System.out.println(color.RED+color.bold+color.blink+"\t\t\t\t\t\t    ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r17 = vegrices.sc.nextInt();
		if(r17==1){
			Items r171 = new Items();
			r171.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Area Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant17();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			
			}
		}
	}
}

class Kphb{
	void kphb(){
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t1.Chaitanya Bar & Restuarant(3.8)"+color.RESET);
		System.out.println();
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t2.Sitara Grand Bar & Restuarant(3.8)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t3.Kritunga Restuarant(3.7)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t4.Platform 65 The Train Restuarant(4.3)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t5.Naidu Gari Kunda Biryani (4.5)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		int res = vegrices.sc.nextInt();
		if(res==1){
			Restuarant1 loc1 = new Restuarant1();
			loc1.restuarant1();
		}
		else if(res==2){
			Restuarant2 loc2 = new Restuarant2();
			loc2.restuarant2();
		}
		else if(res==3){
			Restuarant3 loc3 = new Restuarant3();
			loc3.restuarant3();
		}
		else if(res==4){
			Restuarant4 loc4 = new Restuarant4();
			loc4.restuarant4();
		}
		else if(res==5){
			Restuarant11 loc5 = new Restuarant11();
			loc5.restuarant11();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				kphb();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class Jntu{
	void jntu(){
		System.out.println(color.BRIGHT_WHITE+"\t\t\t\t\t\t\t\t1.kritunga Restuarant(3.7)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_WHITE+"\t\t\t\t\t\t\t\t2.Paradise Restuarant(3.7)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_WHITE+"\t\t\t\t\t\t\t\t3.Mehfil Restuarant(4.0)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_WHITE+"\t\t\t\t\t\t\t\t4.HOT BOX(4.4)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_WHITE+"\t\t\t\t\t\t\t\t5.Chaitanya Food Court(3.9)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		int res = vegrices.sc.nextInt();
		if(res==1){
			Restuarant3 loc1 = new Restuarant3();
			loc1.restuarant3();
		}
		else if(res==2){
			Restuarant9 loc2 = new Restuarant9();
			loc2.restuarant9();
		}
		else if(res==3){
			Restuarant10 loc3 = new Restuarant10();
			loc3.restuarant10();
		}
		else if(res==4){
			Restuarant12 loc4 = new Restuarant12();
			loc4.restuarant12();
		}
		else if(res==5){
			Restuarant17 loc5 = new Restuarant17();
			loc5.restuarant17();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				jntu();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class Madhapur{
	void madhapur(){
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t\t\t\t1.Kritunga Restuarant(3.7)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t\t\t\t2.Bawarchi Restuarant(3.7)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t\t\t\t3.Flechazo(4.0)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t\t\t\t4.The Grand Trunk Road Restaurant(3.9)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_YELLOW+"\t\t\t\t\t\t\t\t5.Habibi Mandi and Restaurant(4.3)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		int res = vegrices.sc.nextInt();
		if(res==1){
			Restuarant3 loc1 = new Restuarant3();
			loc1.restuarant3();
		}
		else if(res==2){
			Restuarant8 loc2 = new Restuarant8();
			loc2.restuarant8();
		}
		else if(res==3){
			Restuarant14 loc3 = new Restuarant14();
			loc3.restuarant14();
		}
		else if(res==4){
			Restuarant15 loc4 = new Restuarant15();
			loc4.restuarant15();
		}
		else if(res==5){
			Restuarant16 loc5 = new Restuarant16();
			loc5.restuarant16();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				madhapur();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class Ameerpet{
	void ameerpet(){
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t1.Once Upon A Time Restuarant(4.2)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t2.Rayalaseema Ruchulu Restuarant(4.0)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t3.Tulips Restuarant(4.1)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t4.Bawarchi Restuarant(3.7)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t5.Bar One(4.0)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		int res = vegrices.sc.nextInt();
		if(res==1){
			Restuarant5 loc1 = new Restuarant5();
			loc1.restuarant5();
		}
		else if(res==2){
			Restuarant6 loc2 = new Restuarant6();
			loc2.restuarant6();
		}
		else if(res==3){
			Restuarant7 loc2 = new Restuarant7();
			loc2.restuarant7();
		}
		else if(res==4){
			Restuarant8 loc2 = new Restuarant8();
			loc2.restuarant8();
		}
		else if(res==5){
			Restuarant13 loc2 = new Restuarant13();
			loc2.restuarant13();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				ameerpet();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class Miyapur{
	void miyapur(){
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t1.Once Upon A Time Restuarant(4.2)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t2.Rayalaseema Ruchulu Restuarant(4.0)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t3.Tulips Restuarant(4.1)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t4.Bawarchi Restuarant(3.7)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		System.out.println();
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t5.Bar One(4.0)"+color.RESET);
		//System.out.println("\t\t\t\t\t-----------------------------------------------------------");
		int res = vegrices.sc.nextInt();
		if(res==1){
			Restuarant5 loc1 = new Restuarant5();
			loc1.restuarant5();
		}
		else if(res==2){
			Restuarant6 loc2 = new Restuarant6();
			loc2.restuarant6();
		}
		else if(res==3){
			Restuarant7 loc3 = new Restuarant7();
			loc3.restuarant7();
		}
		else if(res==4){
			Restuarant8 loc4 = new Restuarant8();
			loc4.restuarant8();
		}
		else if(res==5){
			Restuarant13 loc5 = new Restuarant13();
			loc5.restuarant13();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				miyapur();
			}
			else if(inv==2){
				restuarant.main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}
class restuarant{
	public static void main(String[] args) {

System.out.println(color.BRIGHT_CYAN+"\t\t\t'########::'########::'######::'########::::'###::::'##::::'##:'########:::::'###::::'##::: ##:'########::'######::"+color.RESET);
System.out.println(color.BRIGHT_CYAN+"\t\t\t ##.... ##: ##.....::'##... ##:... ##..::::'## ##::: ##:::: ##: ##.... ##:::'## ##::: ###:: ##:... ##..::'##... ##:"+color.RESET);
System.out.println(color.BRIGHT_CYAN+"\t\t\t ##:::: ##: ##::::::: ##:::..::::: ##:::::'##:. ##:: ##:::: ##: ##:::: ##::'##:. ##:: ####: ##:::: ##:::: ##:::..::"+color.RESET);
System.out.println(color.BRIGHT_CYAN+"\t\t\t ########:: ######:::. ######::::: ##::::'##:::. ##: ##:::: ##: ########::'##:::. ##: ## ## ##:::: ##::::. ######::"+color.RESET);
System.out.println(color.BRIGHT_CYAN+"\t\t\t ##.. ##::: ##...:::::..... ##:::: ##:::: #########: ##:::: ##: ##.. ##::: #########: ##. ####:::: ##:::::..... ##:"+color.RESET);
System.out.println(color.BRIGHT_CYAN+"\t\t\t ##::. ##:: ##:::::::'##::: ##:::: ##:::: ##.... ##: ##:::: ##: ##::. ##:: ##.... ##: ##:. ###:::: ##::::'##::: ##:"+color.RESET);
System.out.println(color.BRIGHT_CYAN+"\t\t\t ##:::. ##: ########:. ######::::: ##:::: ##:::: ##:. #######:: ##:::. ##: ##:::: ##: ##::. ##:::: ##::::. ######::"+color.RESET);
System.out.println(color.BRIGHT_CYAN+"\t\t\t..:::::..::........:::......::::::..:::::..:::::..:::.......:::..:::::..::..:::::..::..::::..:::::..::::::......:::"+color.RESET);
		System.out.println();
		System.out.println();

		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t\t\t\t\t1.KPHB"+color.RESET);
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t\t\t\t\t2.JNTU"+color.RESET);
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t\t\t\t\t3.Madhapur"+color.RESET);
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t\t\t\t\t4.Ameerpet"+color.RESET);
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t\t\t\t\t5.Miyapur"+color.RESET);
		int loc = vegrices.sc.nextInt();
		if(loc==1){
			Kphb loc1 = new Kphb();
			loc1.kphb();
		}
		else if(loc==2){
			Jntu loc2 = new Jntu();
			loc2.jntu();
		}
		else if(loc==3){
			Madhapur loc3 = new Madhapur();
			loc3.madhapur();
		}
		else if(loc==4){
			Ameerpet loc4 = new Ameerpet();
			loc4.ameerpet();
		}
		else if(loc==5){
			Miyapur loc5 = new Miyapur();
			loc5.miyapur();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\t2.Exit"+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				main(null);
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
			}
		}
	}
}
