package kiosk;


public class Menu {
	private String category;
	private String menuName;
	private int menuPrice;
	private Addition addition;
	private Long id;
	
	public Addition getAddition() {
		return addition;
	}

	public void setAddition(Addition addition) {
		this.addition = addition;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

	@Override
	public String toString() {
		return "Menu [category=" + category + ", menuName=" + menuName + ", menuPrice=" + menuPrice + ", addition="
				+ addition + ", id=" + id + "]";
	}
	
}
