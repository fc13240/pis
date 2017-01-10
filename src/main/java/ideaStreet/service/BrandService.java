package ideaStreet.service;

import ideaStreet.domain.Brand;
import ideaStreet.domain.BrandCategory;
import ideaStreet.domain.BrandSearchCondition;

import java.util.List;
import java.util.Map;

import ideaStreet.domain.Page;

public interface BrandService {

	int getBrandsCountByCategory(int categoryId);

	List<Brand> getBrandsByCategory(int categoryId, Page page);

	Brand getbrandDetail(int brandId);

	BrandCategory getBrandCategoryById(int categoryId);

	List<Brand> getRecommendBrands(int brandId);

	int getAllBrandsCount();

	List<Brand> getAllBrandsList(Page page);

	Map<String, List<Brand>> getIndexRecommendBrands();
	
	List<Brand> getSearchBrandsList(BrandSearchCondition brandSearchCondition);
	
	int getSearchBrandsCount(BrandSearchCondition brandSearchCondition);

	List<Brand> getIndexSlideBrands();

	List<Brand> getAllBrands();
	
	List<Brand> getAlreadySaleBrands(Page page);
	
	int getAlreadyBrandsCount();

	List<Brand> getSearchAlreadySaleBrands(BrandSearchCondition brandSearchCondition);
	
	int getSearchAlreadySaleBrandsCount(BrandSearchCondition brandSearchCondition);

	int getBrandsCountBetweenRange(int startIndex);

	List<Brand> getBrandsBetweenRange(int startIndex, Page page);


}
