/*91门户PC文章页图片上CPM*/
if ($(".arc-body").length) {
    var baiduImagePlus = {
        noLogo:true,
        unionId:'u2635630',
        formList:[{formId:2},{formId:3}]
        };
    loadScript("http://cpro.baidustatic.com/cpro/ui/i.js");
}
// loadScript
function loadScript(url) {
    var script = document.createElement("script");
    script.type = "text/javascript";
    if (script.readyState) {
        script.onreadystatechange = function() {
            if (script.readyState == "loaded" || script.readyState == "complete") {
                script.onreadystatechange = null;
            }
        }
    } else {
        script.onload = function() {}
    }
    script.src = url;
    document.getElementsByTagName("head")[0].appendChild(script);
}

$(document).ready(function(){
	/*lazyload*/
	$("img").scrollLoading();
	// hot_talk
	$(".ps_one").mouseover(function(){
		$(".ps_one").removeClass("on");
		$(this).addClass("on");
	});
	// app_tab
	$(".app_tab a").mouseover(function(){
		var i = $(this).index();
		if (i==1) {
			$(".app_tab").addClass("app_and");
		}else{
			$(".app_tab").removeClass("app_and");
		}
		$(".app_list").hide().eq(i).show();
	})
	// article wx
	$('.wx-share').hover(function(){
			$('.wx-img').show();
		},function(){
			$('.wx-img').hide();
	});
	// art share
	$('.share-t').hover(function(){
		$(this).addClass('share-ton');
	},function(){
		$(this).removeClass('share-ton');
	});
        //art iframe
        var inIframe = '<iframe src="http://play.163.com/special/sqt/91qt.html" frameborder="0" width="125" height="128"></iframe>';
	$("#in_iframe").append(inIframe);
	var inIframe2 = '<iframe src="http://ent.cntv.cn/tuiguang/91/mxk/index.shtml" frameborder="0" scrolling="no" width="125" height="128"></iframe>';
	$("#in_iframe-2").append(inIframe2);
	// totop
	var obj = $("#goTopBtn");
	obj.click(function(){
	   document.documentElement.scrollTop = document.body.scrollTop=0;
	});
	// comment
	$('.comcomment').click(function(){$('html,body').animate({scrollTop:$('#SOHUCS').offset().top}, 800);});
	$(".code_2").hover(function(){
		$(this).find("p").show();
	},function(){
		$(this).find("p").hide();
	});
	// article side scroll
	if ( $('#scrollFix').length ) {
		var sT = $('#scrollFix').offset().top + 140*2; // + 35 + 60
		var sH = $('#scrollFix').height();
	};

	$(window).bind("scroll",function(){
		var footerOffset = $('.footer').eq(0).offset().top;
		// toTop
		if(document.documentElement.scrollTop >0 ||document.body.scrollTop>0){
			obj.css("display",'block');
		}else{
			obj.hide();
		}
		// article side scroll
		if ( sT ) {
			var docScrollTop = document.documentElement.scrollTop || document.body.scrollTop;
			if( docScrollTop > sT ){
				var topVal = 0;
				if( docScrollTop > footerOffset - sH - 50 - 90 - 60){
					topVal = footerOffset - docScrollTop - sH - 50 - 90 - 60;
				}
				$('#scrollFix').css({"position":"fixed","top":topVal,"left":$('#scrollFix').offset().left});
			}else{
				$('#scrollFix').css({"position":"static"});
			}
		};

	});
	//滚动 友情链接
	$("#friendly-con").rglSlide({
		productScrollWitch: "ul",
		ast: "ul > li",
		row: 3,
		seeColumn: 5,
		step: 1,
		isAutoPlay: {
			timer: 3000,
			rescrollTime: false,
			orientation: "left"
		},
		isBtn: {
			step: 1,
			left: "#friend-Prev",
			right: "#friend-Next",
			disableCss: "disable"
		}
	});
	/*搜索*/
	SetSearch();
	// pic_show_list_1
	$(".pic_show_list_1 a").hover(function(){
		$(this).find("span").show();
	},function(){
		$(this).find("span").hide();
	});
	
	/*面包屑*/
	// $(".location_link").size()>0?getPosi(".location_link"):'';

});

/*面包屑*/
function getPosi(object){
	var posithtml = $(object).html(),array,y;
	array = posithtml.split("&gt;");
	array.shift();array.shift();
	array[array.length-1]==" "?array.pop():'';
	y = array.join(" &gt; ");
	$(object).html(y).show();
}
// nav
function navOn(id){
	var on = $("#navid_" + id);
	if( on.length < 1 ){
		$(".nav_list li").eq(0).find("a").addClass("on");
	}else{
		$("#navid_" + id).addClass("on");
	}

};
/*搜索*/
function SetSearch(){
	var input = $("#index_search_input"), btn = $("#index_search_btn"), url = $("#index_search_item").val(), finalValue, text = '请输入关键词' ;
	input.val(text);
	input.blur(function(){
		(input.val()=='')?input.val(text):'';
		input.parent().removeClass("search_on");
	});
	input.focus(function(){
		(input.val()==text)?input.val(''):'';
		input.parent().addClass("search_on");
		document.onkeydown=function(e){
			e=(e)?e:window.event;(e.keyCode=="13")?$(".search_on").find("#index_search_btn").click():'';
		}
	});
	btn.click(function(){
		if(input.val() == '' || input.val() ==text){alert(text);input.focus();return false;}
		finalValue = input.val().replace(/(^(\s|　)*)|((\s|　)*$)/g,"");
		window.open( url.replace("$$",  encodeURI(finalValue) ));
	});
}

// slide show
function Focus(option) {
	function byid(id) {
		return document.getElementById(id);
	}
	function bytag(tag, obj) {
		return (typeof obj == 'object' ? obj: byid(obj)).getElementsByTagName(tag);
	}
	// 添加option参数，可以同时运行多个实例
	var option = option ? option : {};
	opt = {
		oFocus : option.oFocus ? option.oFocus : 'tFocus',
		oPic : option.oPic ? option.oPic : 'tFocus-pic',
		oBtn : option.oBtn ? option.oBtn : 'tFocus-btn',
		tLeft : option.tLeft ? option.tLeft : 'tFocus-leftbtn',
		tRight : option.tRight ? option.tRight : 'tFocus-rightbtn',
		prev : option.prev ? option.prev : 'prev',
		next : option.next ? option.next : 'next'
	}
	var timer = null;
	var oFocus = byid(opt.oFocus);
	var oPic = byid(opt.oPic);
	var oPicLis = bytag('li', oPic);
	var oBtn = byid(opt.oBtn);
	var oBtnLis = bytag('li', oBtn);
	var iActive = 0;
	function inlize() {
		oPicLis[0].style.filter = 'alpha(opacity:100)';
		oPicLis[0].style.opacity = 100;
		oPicLis[0].style.zIndex = 5;
	}; 
	for (var i = 0; i < oPicLis.length; i++) {
		oBtnLis[i].sIndex = i;
		oBtnLis[i].onclick = function() {
			if (this.sIndex == iActive) return;
			iActive = this.sIndex;
			changePic();
		}
	};
	byid(opt.tLeft).onclick = byid(opt.prev).onclick = function() {
		iActive--;
		if (iActive == -1) {
			iActive = oPicLis.length - 1;
		}
		changePic();
	};
	byid(opt.tRight).onclick = byid(opt.next).onclick = function() {
		iActive++;
		if (iActive == oPicLis.length) {
			iActive = 0;
		}
		changePic();
	};
	
	function changePic() {
		for (var i = 0; i < oPicLis.length; i++) {
			doMove(oPicLis[i], 'opacity', 0);
			oPicLis[i].style.zIndex = 0;
			oBtnLis[i].className = '';
		};
		doMove(oPicLis[iActive], 'opacity', 100);
		oPicLis[iActive].style.zIndex = 5;
		oBtnLis[iActive].className = 'active';
		if (iActive == 0) {
			doMove(bytag('ul', oBtn)[0], 'left', 0);
		} else if (iActive >= oPicLis.length - 2) {
			doMove(bytag('ul', oBtn)[0], 'left', -(oPicLis.length - 3) * (oBtnLis[0].offsetWidth + 4));
		} else {
			doMove(bytag('ul', oBtn)[0], 'left', -(iActive - 1) * (oBtnLis[0].offsetWidth + 4));
		}
	};
	function autoplay() {
		if (iActive >= oPicLis.length - 1) {
			iActive = 0;
		} else {
			iActive++;
		}
		changePic();
	};
	aTimer = setInterval(autoplay, 3000);
	inlize();
	function getStyle(obj, attr) {
		if (obj.currentStyle) {
			return obj.currentStyle[attr];
		} else {
			return getComputedStyle(obj, false)[attr];
		}
	};
	function doMove(obj, attr, iTarget) {
		clearInterval(obj.timer);
		obj.timer = setInterval(function() {
			var iCur = 0;
			if (attr == 'opacity') {
				iCur = parseInt(parseFloat(getStyle(obj, attr)) * 100);
			} else {
				iCur = parseInt(getStyle(obj, attr));
			}
			var iSpeed = (iTarget - iCur) / 6;
			iSpeed = iSpeed > 0 ? Math.ceil(iSpeed) : Math.floor(iSpeed);
			if (iCur == iTarget) {
				clearInterval(obj.timer);
			} else {
				if (attr == 'opacity') {
					obj.style.opacity = (iCur + iSpeed) / 100;
				} else {
					obj.style.filter = 'alpha(opacity:' + (iCur + iSpeed) + ')';
				}
			}
		},
		30)
	};
	byid(opt.oFocus).onmouseover = function() {
		clearInterval(aTimer);
	}
	byid(opt.oFocus).onmouseout = function() {
		aTimer = setInterval(autoplay, 3000);
	}
}
// lazy load
(function(a){a.fn.scrollLoading=function(b){var c={attr:"data-original",container:a(window),callback:a.noop};var d=a.extend({},c,b||{});d.cache=[];a(this).each(function(){var h=this.nodeName.toLowerCase(),g=a(this).attr(d.attr);var i={obj:a(this),tag:h,url:g};d.cache.push(i)});var f=function(g){if(a.isFunction(d.callback)){d.callback.call(g.get(0))}};var e=function(){var g=d.container.height();if(a(window).get(0)===window){contop=a(window).scrollTop()}else{contop=d.container.offset().top}a.each(d.cache,function(m,n){var p=n.obj,j=n.tag,k=n.url,l,h;if(p){l=p.offset().top-contop,l+p.height();if((l>=0&&l<g)||(h>0&&h<=g)){if(k){if(j==="img"){f(p.attr("src",k))}else{p.load(k,{},function(){f(p)})}}else{f(p)}n.obj=null}}})};e();d.container.bind("scroll",e)}})(jQuery);
/*栏目滚动*/
(function($) {
	$.fn.rglSlide = function(opt) {
		//settings
		var settings = jQuery.extend(true, {
			productScrollWitch: "ul", //相对this选择器，产生滚动条的大div
			list: "ul > li", //相对this选择器，list对象
			row: 1, //分组，即行数（垂直滚动的地方用到，之里只为保持代码同步，所以请先修改垂直滚动）
			seeColumn: 1, //可视范围分列数目
			step: 1, //滚动步长
			speed: "normal", //滚动速度
			orientation: "left", //自动轮播开启时会以设定方向滚动，否则只作为待滚定位，只有左右，left,right
			isAutoPlay: {
				timer: 3000, //间隔时间
				rescrollTime: 2000, //回滚时间
				reboundState: true //回弹状态，默认回滚开启时自动关闭回弹事件，回滚关闭时自动开启回弹事件，如果要同时关闭请手工关闭
			}, //自动播放树配置，false时禁用自动播放功能
			isBtn: {
				step: 1, //步长增值
				left: "#left", //向左按钮
				right: "#right", //向右按钮
				disableCss: "disable", //按钮失效css
				isChangeState: true //按钮事件是否触发滚动方向状态
			}, //按钮树配置，false时禁用按钮控制功能
			bugD1Width: 0, //table布局情况下经常有取不到width值情况，针对此可进行的补丁操作,正常情况下无需启用该补丁
			callback: false //callback:function($this,sTop,splitWidth,d1Width,d2Width){}
		}, opt);
		//settings
		var productScrollWitch = settings.productScrollWitch,
			list = settings.list,
			row = settings.row,
			seeColumn = settings.seeColumn,
			step = settings.step,
			speed = settings.speed,
			orientation = settings.orientation,
			aut = settings.isAutoPlay,
			autTimer = aut.timer,
			autRescrollTime = aut.rescrollTime,
			autReboundState = aut.reboundState,
			btn = settings.isBtn,
			btnStep = btn.step,
			btnLeft = $(btn.left),
			btnRight = $(btn.right),
			btnDisableCss = btn.disableCss,
			btnIsChangeState = btn.isChangeState,
			bugD1Width = settings.bugD1Width,
			callback = settings.callback;
		//div
		var $this = $(this);
		var thisselector = $this.selector;
		var d1 = $this,
			d2 = d1.find(productScrollWitch),
			d3 = d1.find(list);
		//d1Width
		var d1Width = d1.width();
		if (bugD1Width != 0) {
			d1Width = bugD1Width;
		} else {
			if (d1Width == 0) {
				alert("Err:d1Width==0");
			}
		}
		//other width size ...
		var d3Size = d3.size();
		var splitWidth = d1Width / seeColumn;
		var stepWidth = step * splitWidth;
		var stepWidthBtn = btnStep * splitWidth;
		var d2Width = splitWidth * Math.ceil(d3Size / row);
		//fall short of nmuber,return false
		if (d2Width < d1Width) return false;
		//bear with
		d2.width(d2Width + 100);
		//
		var flag = true;
		//left
		var left = function(e) {
			if (!flag) return false;
			flag = false;
			if (btnIsChangeState) {
				orientation = "left";
			}
			var _stepWidth = stepWidth;
			if (e) {
				_stepWidth = stepWidthBtn;
			} else {
				_stepWidth = stepWidth;
			}
			if ((d1Width + d1.scrollLeft()) == d2Width) {
				btnLeft.addClass(btnDisableCss);
				if (e) {
					flag = true;
				} else {
					if (autRescrollTime) {
						d1.animate({
							scrollLeft: 0
						}, autRescrollTime, function() {
							btnLeft.removeClass(btnDisableCss);
							btnRight.addClass(btnDisableCss);
							if (callback) callback($this, 0, splitWidth, d1Width, d2Width);
							flag = true;
						});
					} else {
						if (autReboundState) {
							orientation = "right";
							if (aut) {
								autoStop();
								autoPlay();
							}
						}
						flag = true;
					}
				}
			} else if (_stepWidth + d1.scrollLeft() >= d2Width - d1Width) {
				d1.animate({
					scrollLeft: d2Width - d1Width
				}, speed, function() {
					btnLeft.addClass(btnDisableCss);
					btnRight.removeClass(btnDisableCss);
					if (callback) callback($this, d2Width - d1Width, splitWidth, d1Width, d2Width);
					flag = true;
				});
			} else {
				d1.animate({
					scrollLeft: d1.scrollLeft() + _stepWidth
				}, speed, function() {
					btnRight.removeClass(btnDisableCss);
					if (callback) callback($this, d1.scrollLeft(), splitWidth, d1Width, d2Width);
					flag = true;
				});
			}
			return false;
		};
		//right
		var right = function(e) {
			if (!flag) return false;
			flag = false;
			if (btnIsChangeState) {
				orientation = "right";
			}
			var _stepWidth = stepWidth;
			if (e) {
				_stepWidth = stepWidthBtn;
			} else {
				_stepWidth = stepWidth;
			}
			if (d1.scrollLeft() == 0) {
				btnRight.addClass(btnDisableCss);
				if (e) {
					flag = true;
				} else {
					if (autRescrollTime) {
						d1.animate({
							scrollLeft: d2Width - d1Width
						}, autRescrollTime, function() {
							btnRight.removeClass(btnDisableCss);
							btnLeft.addClass(btnDisableCss);
							if (callback) callback($this, d2Width - d1Width, splitWidth, d1Width, d2Width);
							flag = true;
						});
					} else {
						if (autReboundState) {
							orientation = "left";
							if (aut) {
								autoStop();
								autoPlay();
							}
						}
						flag = true;
					}
				}
			} else if ((d1.scrollLeft()) <= _stepWidth) {
				d1.animate({
					scrollLeft: 0
				}, speed, function() {
					btnRight.addClass(btnDisableCss);
					btnLeft.removeClass(btnDisableCss);
					if (callback) callback($this, 0, splitWidth, d1Width, d2Width);
					flag = true;
				});
			} else {
				d1.animate({
					scrollLeft: d1.scrollLeft() - _stepWidth
				}, speed, function() {
					btnLeft.removeClass(btnDisableCss);
					if (callback) callback($this, d1.scrollLeft(), splitWidth, d1Width, d2Width);
					flag = true;
				});
			}
			return false;
		};
		//gotoscroll
		var gotoscroll = function(xy) {
			if (!flag) return false;
			flag = false;
			d1.animate({
				scrollLeft: xy
			}, speed, function() {
				if (callback) callback($this, xy, splitWidth, d1Width, d2Width);
				if (xy == 0) {
					btnRight.addClass(btnDisableCss);
					btnLeft.removeClass(btnDisableCss);
				} else if (xy == (d2Width - d1Width)) {
					btnRight.removeClass(btnDisableCss);
					btnLeft.addClass(btnDisableCss);
				} else {
					btnRight.removeClass(btnDisableCss);
					btnLeft.removeClass(btnDisableCss);
				}
				flag = true;
			});
			return false;
		};
		//timer
		var timerID;
		var autoPlay = function() {
			switch (orientation) {
				case "left":
					timerID = window.setInterval(left, autTimer);
					break;
				case "right":
					timerID = window.setInterval(right, autTimer);
					break;
			}
			return false;
		};
		var autoStop = function() {
			window.clearInterval(timerID);
			return false;
		};
		if (aut) {
			//ready autoPlay
			autoPlay();
			//
			$this.hover(autoStop, autoPlay);
			if (btn) {
				btnLeft.hover(autoStop, autoPlay);
				btnRight.hover(autoStop, autoPlay);
			}
		}
		//btn
		if (btn) {
			btnLeft.click(left);
			btnRight.click(right);
			switch (orientation) {
				case "left":
					//避免动画的同时初始化callback
					d1.scrollLeft(0);
					gotoscroll(0);
					btnRight.addClass(btnDisableCss);
					break;
				case "right":
					//避免动画的同时初始化callback
					d1.scrollLeft(d2Width - d1Width);
					gotoscroll(d2Width - d1Width);
					btnLeft.addClass(btnDisableCss);
					break;
			}
		}
		if (!aut) {
			return {
				$this: $this,
				autoStop: false,
				autoPlay: false,
				gotoscroll: gotoscroll
			};
		}
		return {
			$this: $this,
			autoStop: autoStop,
			autoPlay: autoPlay,
			gotoscroll: gotoscroll
		};
	};
})(jQuery);

// art icon slide
function iconSlide(){
	function imgScroll(container, containerTag, Prev, Next, index, auto) {
		var container = $(container);
		$.each(container, function(i) {
			var containertags = container.eq(i).find(containerTag),
				litem = container.eq(i).find("li"),
				Prevbtn = container.eq(i).find(Prev),
				NextBtn = container.eq(i).find(Next),
				num = 0;
			if (litem.length <= index) {
				return false;
			};
			var w = litem.width();
			var allWith = w * litem.length;
			containertags.width(allWith);
			var sroll = function(a) {
				var dis = w * a;
				containertags.stop();
				containertags.animate({
					left: -dis
				}, "slow");
			}
			var h = litem.length - index;
			Prevbtn.click(function() {
				num--;
				if (num < 0) {
					num = h;
				}
				sroll(num);
			});
			NextBtn.click(function() {
				num++;
				if (num > h) {
					num = 0;
				}
				sroll(num);
			});

			var autoplay = function() {
				window.setInterval(function() {
					var temp = num + 1;
					sroll(temp);
					num++;
					if (num > litem.length - 1) {
						num = 0
					}
				}, 3000)
			}
			if (auto) {
				autoplay();
			}
		});
	}
	imgScroll(".installed-necessary-list", "ul", ".prev-s", ".next-s", 6, false);
}