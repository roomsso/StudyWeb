package profile.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import framework.BaseAction;
import hoge.StudyUtils;

/**
 * プロフィール入力画面Action
 * 
 * @author Masa
 */
public class ProfileInputAction extends BaseAction {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** JSP名 */
	private static final String JSP_NAME = "profile_input.jsp";

	@Override
	protected void doInit(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setAttribute("kenList", StudyUtils.getKenList());

		forwardJSP(JSP_NAME, req, resp);
	}

	@Override
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// パラメータをフォーム変換
		ProfileInputForm form = convertParamToForm(req);

		// 入力チェック
		List<String> msgList = validate(form);
		if (msgList.size() > 0) {
			req.setAttribute("msgList", msgList);
			doInit(req, resp);
		}

		req.setAttribute("inputForm", form);
		req.getRequestDispatcher("/profile/confirm/init").forward(req, resp);
	}

	/**
	 * パラメータをフォームに変換します。
	 * 
	 * @param req HttpServletRequest
	 * @return ProfileInputForm
	 */
	private ProfileInputForm convertParamToForm(HttpServletRequest req) {
		ProfileInputForm form = new ProfileInputForm();
		form.setName(req.getParameter("name")); // 名前
		form.setGender(req.getParameter("gender")); // 性別
		form.setAge(req.getParameter("age")); // 年齢
		form.setPostalcode(req.getParameter("postalcode")); // 郵便番号
		form.setPrefecture(req.getParameter("prefecture")); // 都道府県
		form.setCity(req.getParameter("city")); // 市区町村
		form.setAddress(req.getParameter("address")); // 番地
		return form;
	}

	/**
	 * 入力チェックを行ってエラーメッセージリストを返します。
	 * 
	 * @param form ProfileInputForm
	 * @return エラーメッセージリスト。 エラーが無い場合は空リスト
	 */
	private List<String> validate(ProfileInputForm form) {
		List<String> msgList = new ArrayList<>();

		if (isEmpty(form.getName())) {
			msgList.add("名前は必ず入力してください。");
		}

		if (!isEmpty(form.getAge())) {
			if (!isNumber(form.getAge())) {
				msgList.add("年齢は数値で入力してください。");
			}
		}

		if (!isEmpty(form.getPostalcode())) {
			if (isNumber(form.getPostalcode())) {
				if(form.getPostalcode().length() != 7) {
					msgList.add("郵便番号は7桁数値で入力してください。");
				}
			} else {
				msgList.add("郵便番号は数値で入力してください。");
			}
		}
			
		
		return msgList;
	}

	/**
	 * 空判定。
	 * 
	 * @param val 対象文字列
	 * @return 対象文字列がnull または空文字の場合、true
	 */
	private boolean isEmpty(String val) {
		return val == null || val.equals("");
	}

	/**
	 * 数文字判定。
	 * 
	 * @param val　対象文字列
	 * @return 対象文字列が数文字の場合はtrue
	 */
	private boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
