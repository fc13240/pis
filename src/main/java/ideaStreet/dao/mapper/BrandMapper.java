package ideaStreet.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import ideaStreet.domain.Brand;
import ideaStreet.domain.BrandCategory;
import ideaStreet.domain.BrandSearchCondition;
import ideaStreet.domain.Page;

public interface BrandMapper {

	int getBrandsCountByCategory(int categoryId);

	List<Brand> getBrandsByCategory(@Param("categoryId") int categoryId,@Param("page") Page page);

	Brand getbrandDetail(int brandId);

	BrandCategory getBrandCategoryById(int categoryId);

	List<Brand> getAllBrandsByCategory(int categoryId);

	List<Brand> getRecommendBrands(int brandId);

	int getAllBrandsCount();

	List<Brand> getAllBrandsList(Page page);

	List<Brand> getIndexRecommendBrands();
	
	List<Brand> getSearchBrandsList(BrandSearchCondition brandSearchCondition);
	
	int getSearchBrandsCount(BrandSearchCondition brandSearchCondition);

	List<Brand> getIndexSlideBrands();

	List<Brand> getAllBrands();
	
	List<Brand> getAlreadySaleBrands(Page page);
	
	int getAlreadyBrandsCount();

	List<Brand> getSearchAlreadySaleBrands(BrandSearchCondition brandSearchCondition);
	
	int getSearchAlreadySaleBrandsCount(BrandSearchCondition brandSearchCondition);

	int getBrandsCountBetweenRange(int startIndex);

	List<Brand> getBrandsBetweenRange(@Param("startIndex")int startIndex,@Param("page") Page page);

}
