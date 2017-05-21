package profile.action;

/**
 * プロフィール入力画面のフォームを表すクラスです。
 */
public class ProfileInputForm {

	/** 名前 */
	private String name;
	/** 性別 */
	private String gender;
	/** 年齢 */
	private String age;
	/** 郵便番号 */
	private String postalcode;
	/** 都道府県 */
	private String prefecture;
	/** 市区町村 */
	private String city;
	/** 番地 */
	private String address;
	
	/**
	 * 名前を取得します。
	 * 
	 * @return 名前
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前を設定します。
	 * 
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 性別を取得します。
	 * @return 性別
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 性別を設定します。
	 * @param gender 性別
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 年齢を取得します。
	 * @return 年齢
	 */
	public String getAge() {
		return age;
	}
	/**
	 * 年齢を設定します。
	 * @param age 年齢
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 郵便番号を取得します。
	 * @return 郵便番号
	 */
	public String getPostalcode() {
		return postalcode;
	}
	/**
	 * 郵便番号を設定します。
	 * @param postalcode 郵便番号
	 */
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	/**
	 * 都道府県を取得します。
	 * @return 都道府県
	 */
	public String getPrefecture() {
		return prefecture;
	}
	/**
	 * 都道府県を設定します。
	 * @param prefecture 都道府県
	 */
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	/**
	 * 市区町村を取得します。
	 * @return 市区町村
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 市区町村を設定します。
	 * @param city 市区町村
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 番地を取得します。
	 * @return 番地
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 番地を設定します。
	 * @param address 番地
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
