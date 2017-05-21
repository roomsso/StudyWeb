package profile.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import framework.BaseAction;

/**
 * プロフィール確認画面Action
 * 
 * @author Masa
 */
public class ProfileConfirmAction extends BaseAction {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** JSP名 */
	private static final String JSP_NAME = "profile_confirm.jsp";

	@Override
	protected void doInit(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ProfileConfirmForm form = convertParamToForm(req);
		req.setAttribute("form", form);
		forwardJSP(JSP_NAME, req, resp);
	}

	@Override
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		
		
		
	}
	
	/**
	 * パラメータをフォームに変換します。
	 * 
	 * @param req HttpServletRequest
	 * @return ProfileConfirmForm
	 */
	private ProfileConfirmForm convertParamToForm(HttpServletRequest req) {
		ProfileInputForm inputForm = (ProfileInputForm)req.getAttribute("inputForm");
		
		ProfileConfirmForm confirmForm = new ProfileConfirmForm();
		confirmForm.setName(inputForm.getName());
		if("1".equals(inputForm.getGender())) {
			confirmForm.setGender("男");
		} else if("2".equals(inputForm.getGender())) {
			confirmForm.setGender("女");
		}
		confirmForm.setAge(inputForm.getAge());
		String postal = String.format("〒%s-%s", inputForm.getPostalcode().substring(0, 3),
				inputForm.getPostalcode().substring(3));
		confirmForm.setFullAddress(postal + " " +  inputForm.getPrefecture() + inputForm.getCity() + inputForm.getAddress());
		return confirmForm;
	}
}
