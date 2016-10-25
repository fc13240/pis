$(function(){
	/*topBanner*/
	newTopslider("#topCurtain");
	
    // 左侧菜单 
    $('.all-category-mod').menuSlide({ titMod: '.all-category-list', maniMod: '.cat-cont' });

    /*focusBox*/
    $(".focusBox").hover(function(){ $(this).find(".prev,.next").stop(true,true).fadeTo("show",1) },function(){ $(this).find(".prev,.next").fadeOut() });
    $(".focusBox").slide({ mainCell:".pic",effect:"fold",autoPlay:true, delayTime:600,trigger:"click"});
	
	/*mod-main-c轮播*/
	$("#switchimg1").slide({effect:"leftLoop",vis:5,autoPlay:true, delayTime:800, trigger:"click",easing:"easeInOutExpo"});
	
	/*notice_box*/
	$(".notice_box").slide({mainCell:".bd",effect:"topLoop",vis:4,autoPlay:true});
	
    /* side-r-tab */
    $(".side-r-tab").slide({effect:"left"});
	
	/*资讯 幻灯片*/
    $("#slideNews").slide({ mainCell:".bd ul",autoPlay:true,effect:"fold"});
	
	//搜索类型切换
	$(".top_search_tabs a").click(function(){
		$(".top_search_tabs a").removeClass("on");
		$(this).addClass("on");
	})
	
	/*底部合作伙伴*/
    $(".scrolltxt").slide({ mainCell:"ul", effect:"top", autoPlay:true, interTime:5000, delayTime:1000,easing:"easeOutCubic" });	
	
   //知商会员介绍层
   $("#zsItro .clk1,#zsItro .clk3").click(function(){
       $(this).parents("#zsItro").fadeOut();
   });
   $("#zsItro .clk4").click(function(){
        $(this).toggleClass("clk-on");
    });
	
	
	//楼层导航
	$(window).scroll(function(){
		var ling = $(document).scrollTop();
		$('#floorNav li,.floor_num').removeClass("active");
		if(ling> $(".floor_box:eq(0)").offset().top-200){
			$("#floorNav").fadeIn();
			$(".toolbar").addClass("pos_fixed");
			$("#fixed_header").addClass("pos_fixed2");
		}else{
			$("#floorNav").fadeOut();
			$(".toolbar").removeClass("pos_fixed");
			$("#fixed_header").removeClass("pos_fixed2");
		};
		for(var i=0;i<$('#floorNav li').length;i++){
			var f_box_top=$(".floor_box:eq("+i+")").offset().top-200;
			var f_box_height=f_box_top+$(".floor_box:eq("+i+")").height()+19;
			if( f_box_top<ling && ling< f_box_height){
				$("#floorNav li:eq("+i+"),.floor_num:eq("+i+")").addClass("active");
			};
		};
		
	});
	$('#floorNav li').click(function(){
		var el = $('.floor_box').eq($(this).index());
        $('body,html').animate({scrollTop: el.offset().top-80},800);
		return false;
	});
	
	//ie8以下
	var isIE = document.all ? 1 : 0;
	   if (isIE == 1){
			var isIE=!!window.ActiveXObject;
			var isIE8=isIE&&!!document.documentMode;
			var isIE7=isIE&&!isIE8;
			if (isIE8 || isIE7){
				if ($(window).width() < 1280) {
						$(".floor-nav").addClass("v8");
					} else {
					   $(".floor-nav").removeClass("v8");
					}					
		   }
	   }
	
});


/*左菜单二级菜单*/
(function($){
    $.fn.menuSlide = function(optoins){
        var defaults = {
            titMod: '.all-category-list',
            maniMod: '.cat-cont'
        };

        var opts = $.extend({},defaults,optoins);
        var This = $(this);
        var timer = null;
        This.find(opts.titMod).find('li').hover(function(){
            clearTimeout(timer);
            This.find(opts.titMod).find('li').removeClass('active');
			This.find(opts.titMod).find('li').css({borderBottomColor:'#ddd'});
            $(this).addClass('active').css({borderBottomColor:'#F64914'});
			$(this).prev("li").css({borderBottomColor:'#F5F5F5'});
            This.find(opts.maniMod).css({ display: 'block'});
            This.find(opts.maniMod).find('.cat-cont-bd').children('li').css({display: 'none'});
            
            if (This.find(opts.maniMod).find('.cat-cont-bd').children('li').eq($(this).index()).find("dd").length > 0) {
            	This.find(opts.maniMod).find('.cat-cont-bd').children('li').eq($(this).index()).css({display: 'block'});
            	if($(this).offset().top+This.find(opts.maniMod).height()>$(window).height()+$(window).scrollTop())
            	{
            		This.find(opts.maniMod).stop(true,true) .animate({top: $(window).height()-(This.find(opts.maniMod).height()+$(this).offset().top-$(this).position().top)+50},150)
            	}else{
            		This.find(opts.maniMod).stop(true,true).animate({top: $(this).offset().top-$('.all-category-mod').offset().top},150);
            	}
            }

			},function(){
				var _this = $(this);
				timer = setTimeout(function(){
					This.find(opts.titMod).find('li').removeClass('active').css({borderBottomColor:'#ddd'});
					This.find(opts.maniMod).css({ display: 'none'});
			},30);
        });

        This.find(opts.maniMod).hover(function(){
            clearTimeout(timer);
	
			},function(){
				timer = setTimeout(function(){
					This.find(opts.titMod).find('li').removeClass('active').css({borderBottomColor:'#ddd'});
					This.find(opts.maniMod).css({ display:'none'});
			},30);
        });
    };
})(jQuery);

/*顶通广告*/
function newTopslider(p) {
    var n = jQuery(p);
    if (n.length < 1) {
        return
    }
    var l = n.find(".index_topbanner_fold");
    var v = n.find(".big_topbanner");
    var s = jQuery("#smallTopBanner");
	setTimeout(function(){v.slideDown();},1000)
	setTimeout(function(){
		l.removeClass("index_topbanner_unfold").html("展开<i></i>");
		v.slideUp();
		s.slideDown();
	},4000)
    l.click(function() {
        if ($(this).hasClass("index_topbanner_unfold")) {
            $(this).removeClass("index_topbanner_unfold");
            $(this).html("展开<i></i>");
            v.slideUp();
            s.slideDown();
        } else {
            $(this).addClass("index_topbanner_unfold");
            $(this).html("收起<i></i>");
            v.slideDown();
            s.slideUp();
        }
    });

}

     
