public Outfit implements ClothingItem { //+1
	private Shoes shoes; //+1
	private Pants pants;
	private Top top;

	public Outfit(Shoes s, Pants p, Top t) { //+1
		this.shoes = s; //+1
		this.pants = p;
		this.top = t;
	}

	public String getDescription() { //+1
		String result = "";
		result += shoes.getDescription() + "/";
		result += pants.getDescription() + "/";
		result += top.getDescription() + " outfit";

		return result; //+1
	}

	public double getPrice() { //+1
		double discountModifier = .9;
		if(shoes.getPrice() + pants.getPrice() >= 100
			|| shoes.getPrice() + top.getPrice() >= 100
			|| pants.getPrice() + top.getPrice() >= 100) {
				discountModifier = .75;
			}

		return discountModifier * (shoes.getPrice() + pants.getPrice() + top.getPrice());
		//+2
	}

}