package framework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 共通BaseAction。
 * 
 * 呼び出しURLが「init」で終わる場合、抽象メソッド「doInit」を呼び出し、それ以外の場合は「doProcess」を呼び出す。
 * 
 */
public abstract class BaseAction extends HttpServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** 文字コード */
	private static final String CHARACTER_ENCODEING = "UTF-8";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding(CHARACTER_ENCODEING);
		resp.setContentType("text/html; charset=" + CHARACTER_ENCODEING);

		try {
			if (isInit(req)) {
				doInit(req, resp);
			} else {
				doProcess(req, resp);
			}

		} catch (Exception e) {
			forwardJSP("common/error.jsp", req, resp);
		}
	}

	/**
	 * 初期表示の呼び出しかどうかをURLから判定する。
	 * 
	 * @param req HttpServletRequest
	 * @return 初期表示処理の呼び出しの場合はtrue
	 */
	private boolean isInit(HttpServletRequest req) {
		return req.getRequestURI().endsWith("init");
	}

	/**
	 * 指定されたJSPにフォワードする。
	 * 
	 * @param jspName JSP名
	 * @param req HttpServletRequest
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void forwardJSP(String jspName, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/" + jspName).forward(req, resp);
	}

	/**
	 * 初期表示処理。
	 * 
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @throws Exception
	 */
	protected abstract void doInit(HttpServletRequest req, HttpServletResponse resp) throws Exception;

	/**
	 * 主処理。
	 * 
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @throws Exception
	 */
	protected abstract void doProcess(HttpServletRequest req, HttpServletResponse resp) throws Exception;

}
