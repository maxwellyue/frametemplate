/**
 * 本js是自己按照JQuery的源码，自己理解，练习
 */



//匿名函数自调，即立即执行
(function(Window,undefined){
	
	//初始化本地JQuery对象
	var jQuery = function(){
		
		 //使用new，创建独立的作用域
		 return new jQuery.fn.init(selector, context, rootjQuery);
	}
	
	//重写jQuery原型，并将prototype简写为fn
	jQuery.fn = jQuery.prototype = {
			
		init:function(){
			
		},
		constructor: jQuery,
		
	}
	
	//
	jQuery.fn.init.prototype = jQuery.fn;
	
	
	//将JQuery对象赋给Window,在外部便可以使用了
	window.jQuery = window.$ = jQuery;
})(Window);
