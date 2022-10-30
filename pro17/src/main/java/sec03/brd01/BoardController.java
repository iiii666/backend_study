package sec03.brd01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String ARTICLE_IAMGE_REPO = "C:\\dev64\\workspace\\pro17\\src\\main\\webapp\\board01";
	BoardService boardService;
	ArticleVO articleVO;
	
	@Override
	public void init() throws ServletException {
		boardService = new BoardService();
		articleVO = new ArticleVO();
	}
   @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String nextPage = "";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String action = request.getPathInfo();
		System.out.println("action:" + action);
		try {
			List<ArticleVO> articlesList = new ArrayList<ArticleVO>();
			if (action == null) {
				articlesList = boardService.listArticles();
				request.setAttribute("articlesList", articlesList);
				nextPage = "/board01/listArticles.jsp";
			
			} else if (action.equals("/listArticles.do")) {
				articlesList = boardService.listArticles();
				request.setAttribute("articlesList", articlesList);
				nextPage = "/board01/listArticles.jsp";
			
			}else if(action.equals("/articleForm.do")){
				nextPage = "/board01/articleForm.jsp";
			}else if(action.equals("/addArticle.do")) {
				Map<String, String> articleMap = upload(request, response);
				String title = articleMap.get("title");
				String content = articleMap.get("content");
				String imageFileName = articleMap.get("imageFileName");
				
				articleVO.setParentNO(0);
				articleVO.setId("hong");
				articleVO.setTitle(title);
				articleVO.setContent(content);
				articleVO.setImageFileName(imageFileName);
				nextPage = "/board/listArticles.do";
			}
			
			
			else {
				
				nextPage = "/board01/listArticles.jsp";
	
			}
			
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
   
   
   
   
   private Map<String, String> upload(HttpServletRequest request, HttpServletResponse reponse){
	   Map<String,String> articleMap = new HashMap<>();
	   File currentDirPath = new File(ARTICLE_IAMGE_REPO);
	   DiskFileItemFactory factory = new DiskFileItemFactory();
	   String encoding = "UTF-8";
	   factory.setRepository(currentDirPath);
	   factory.setSizeThreshold(1024 *1024);
	   ServletFileUpload upload= new ServletFileUpload(factory);
	   
	   try {
		   List items = upload.parseRequest(request);
		   for(int i = 0;i<items.size();i++) {
			   FileItem fileItem = (FileItem) items.get(i);
			   if(fileItem.isFormField()) {
				   System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
					articleMap.put(fileItem.getFieldName(), fileItem.getString(encoding));
			   }else {
				   if(fileItem.getSize()>0){
					   int idx = fileItem.getName().lastIndexOf("\\");
					   if(idx ==-1) {
						   idx = fileItem.getName().lastIndexOf("/");
					   }
					   String fileName = fileItem.getName().substring(idx + 1);
						System.out.println("���ϸ�:" + fileName);
						articleMap.put(fileItem.getFieldName(), fileName);  //�ͽ��÷η����� ���ε� ������ ��� ���� �� map�� ���ϸ� ����
						File uploadFile = new File(currentDirPath + "\\" + fileName);
						fileItem.write(uploadFile);
				   }
			   }
			   
			   
		   }
	   }catch(Exception e) {
		   
	   }
	   return articleMap;
   }

}
