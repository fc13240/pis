package zhuanli.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleImg;
import zhuanli.domain.ArticleSearchCondition;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Vote;


public interface ArticleMapper {
	List<Article> getUserArticleByPage(Page page);
	
	int getUserArticleCount(int userId);
	
	List<Article> searchUserArticleByPage(ArticleSearchCondition searchCondition);
	
	int searchUserArticleCount(ArticleSearchCondition searchCondition);
	
	List<ArticleType>getAllArticleTypes();
	
	void auditPass(Article article);
	
	Article getUserArticleById(int id);
	
	void addArticleType(String keyword);

	void deleteArticleType(int typeId);

	void updateArticleType(@Param("typeId")int typeId, @Param("typeName") String typeName);

	void deleteArticle(int articleId);
	
	void insertArticle(Article article);
	
	void updateArticle(Article article);
	
	void addArticleImage(ArticleImg articleImg);
	
	Vote getUpVoteAndDownVote(int id);
	
	void praise(Article article);
	
	void slander(Article article);
	
}
