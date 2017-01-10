package ideaStreet.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ideaStreet.domain.Brand;
import ideaStreet.domain.BrandCategory;
import ideaStreet.domain.BrandSearchCondition;
import ideaStreet.domain.Page;
import ideaStreet.service.BrandService;


@Controller
@RequestMapping(path="/brand")
public class BrandController {
	private BrandService brandService;
	
	@Autowired
	public BrandController(BrandService brandService) {
		this.brandService = brandService;
		
	}
	
	@RequestMapping(path="/index")
	public String getBrandIndex(Model model) {
		List<Brand> slideBrands = brandService.getIndexSlideBrands();
		Map<String, List<Brand>> recommendBrands = brandService.getIndexRecommendBrands();
		model.addAttribute("slideBrands", slideBrands);
		model.addAttribute("recommendBrands", recommendBrands);
		return "brand_index";
	}
	
	@RequestMapping(path="/showBrandsList")
	public String showBrandsList(int categoryId, Page page, Model model) {
		page.setPageSize(15);
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		int totalCount=(int)brandService.getBrandsCountByCategory(categoryId);
		page.setTotalRecords(totalCount);
		List<Brand> brands = brandService.getBrandsByCategory(categoryId,page); 
		BrandCategory brandCategory = brandService.getBrandCategoryById(categoryId);
		model.addAttribute("page", page);
		model.addAttribute("brands", brands);
		model.addAttribute("brandCategory", brandCategory);
		return "brands_list";
	}
	
	@RequestMapping(path="/getbrandDetail")
	public String getbrandDetail(int brandId, Model model) {
		Brand brand = brandService.getbrandDetail(brandId); 
		List<Brand> recommendBrands = brandService.getRecommendBrands(brandId);
		model.addAttribute("brand", brand);
		model.addAttribute("recommendBrands", recommendBrands);
		return "brand_detail";
	}
	
	@RequestMapping(path="/searchBrands")
	public String searchBrands(BrandSearchCondition brandSearchCondition ,Model model){
		
		Page page= brandSearchCondition.getPage();
		page.setPageSize(20);
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		int totalCount= brandService.getSearchBrandsCount(brandSearchCondition);
		page.setTotalRecords(totalCount);
		
		List<Brand> brands = brandService.getSearchBrandsList(brandSearchCondition);
		
		model.addAttribute("page", page);
		model.addAttribute("brands", brands);
		model.addAttribute("searchCondition", brandSearchCondition);
		return "all_brands_list";
	}
	
	
	@RequestMapping(path="/alreadySalebrands")
	public String alreadySalebrands(HttpSession session,Page page,Model model){
		page.setPageSize(20);
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		List<Brand> alreadySaleBrands = brandService.getAlreadySaleBrands(page);
		int totalRecords = brandService.getAlreadyBrandsCount();
		page.setTotalRecords(totalRecords);
		model.addAttribute("brands",alreadySaleBrands);
		model.addAttribute("page",page);
		return "already_sale_brands_list";
	}
	
	
	@RequestMapping(path="/searchAlreadySalebrands")
	public String searchAlreadySalebrands(BrandSearchCondition brandSearchCondition,Model model){
		Page page= brandSearchCondition.getPage();
		page.setPageSize(20);
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		List<Brand> alreadySaleBrands = brandService.getSearchAlreadySaleBrands(brandSearchCondition);
		int totalRecords = brandService.getSearchAlreadySaleBrandsCount(brandSearchCondition);
		page.setTotalRecords(totalRecords);
		model.addAttribute("searchCondition",brandSearchCondition);
		model.addAttribute("brands",alreadySaleBrands);
		model.addAttribute("page",page);
		return "already_sale_brands_list";
	}
	
	@RequestMapping(path="/getBrandsBetweenRange")
	public String getBrandsBetweenRange(int startIndex, Page page, Model model) {
		page.setPageSize(15);
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		int totalCount=(int)brandService.getBrandsCountBetweenRange(startIndex);
		page.setTotalRecords(totalCount);
		List<Brand> brands = brandService.getBrandsBetweenRange(startIndex,page); 
		model.addAttribute("page", page);
		model.addAttribute("brands", brands);
		model.addAttribute("startIndex", startIndex);
		return "brand_range_list";
	}
}
