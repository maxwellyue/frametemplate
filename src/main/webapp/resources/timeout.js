/**
 * 实现倒计时功能
 */

function timecount(){
	var day = time/(3600*24*1000);
	var hour = (time % (3600*24*1000))/(3600*1000);
	var min = (time %(3600*1000)) / (60*1000);
	var second = (time % (60*1000))/1000;
	document.getElementById('time').innerHTML = parseInt(day)+'天'+parseInt(hour)+'小时'+parseInt(min)+'分	钟'+parseInt(second)+'秒';
	time = time-1000;

}

var time = 318258274;


setInterval(timecount,1000);


//实现动态时间也是类似   将time = new Date();
