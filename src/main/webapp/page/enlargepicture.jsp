<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="${url}/resources/jquery-1.10.2.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图片放大器</title>


<style type="text/css">

#div1 { width: 240px; height: 320px; padding: 5px; border: 1px solid #ccc; position: relative; }

#div1 .small_pic { width: 240px; height:320px; background: #eee; position: relative; }
#div1 .float_layer { width: 50px; height: 50px; border: 1px solid #000; background: #fff; filter: alpha(opacity: 30); opacity: 0.3; position: absolute; top: 0; left: 0; display:none; }
#div1 .mark {width:100%; height:100%; position:absolute; z-index:2; left:0px; top:0px; background:red; filter:alpha(opacity:0); opacity:0;}
#div1 .big_pic { position: absolute; top: -1px; left: 255px; width:400px; height:400px; overflow:hidden; border:2px solid #CCC; display:none; }
#div1 .big_pic img { position:absolute; top: -30px; left: -80px; }

</style>

</head>
<body>


<div id="div1">

	<div class="small_pic">
			<span class="mark"></span>
			<span class="float_layer"></span>
			<img src="http://www.helloweba.com/demo/cloud-zoom/images/smallimage.jpg" />
	</div>

	<div class="big_pic">
		<img src="http://www.helloweba.com/demo/cloud-zoom/images/bigimage00.jpg"/>
	</div>

</div>



</body>

<script type="text/javascript">

$(function(){
	$(".mark").hover(function(){
		$(".float_layer,.big_pic").show();
	},function(){
		$(".float_layer,.big_pic").hide();
	})
	
	$(".mark").mousemove(function(ev){
		var e = ev || event;
		
		var left = e.clientX - $("#div1").offset().left-$(".small_pic").offset().left-$(".float_layer").width()/2;
		var top = e.clientY - $("#div1").offset().top-$(".small_pic").offset().top-$(".float_layer").height()/2;
		
		var sDistanceX = $(".mark").outerWidth()-$(".float_layer").outerWidth();
		var sDistanceY = $(".mark").outerHeight()-$(".float_layer").outerHeight();

		if(left<0){
			left = 0;
		}
		else if(left > sDistanceX){
			left = sDistanceX ;
		}
		if(top<0){
			top=0;
		}
		else if(top > sDistanceY){
			top = sDistanceY;
		}

		$(".float_layer").css({'left':left,"top":top});

		var scoreX = left/sDistanceX;
		var scoreY = top/sDistanceY;
		
		var  bDistanceX = $(".big_pic img").outerWidth() - $(".big_pic").outerWidth();
		var  bDistanceY = $(".big_pic img").outerHeight() - $(".big_pic").outerHeight();

		$(".big_pic img").css({left:(-scoreX*bDistanceX),top:(-scoreY*bDistanceY)});
	})
})


</script>
</html>