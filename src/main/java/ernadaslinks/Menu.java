package ernadaslinks;

public enum Menu {

	Nuorodos("/nuorodos")
	, Kategorijos("/kategorijos")
	, Žymos("/zymos");
	
	private final String itemurl;
	
	Menu( String url ) {
		this.itemurl = url;
	}
	
	public String itemurl() {
		return this.itemurl;
	}
	
}
