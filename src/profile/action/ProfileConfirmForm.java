package profile.action;

/**
 * プロフィール確認画面のフォームを表すクラスです。
 */
public class ProfileConfirmForm {

	/** 名前 */
	private String name;
	/** 性別 */
	private String gender;
	/** 年齢 */
	private String age;
	/** 住所 */
	private String fullAddress;
	
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
	 * 住所を取得します。
	 * @return 住所
	 */
	public String getFullAddress() {
		return fullAddress;
	}
	/**
	 * 住所を設定します。
	 * @param fullAddress 住所
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

}
