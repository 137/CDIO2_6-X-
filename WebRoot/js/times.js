var time1 = 1800;
var showtime;

var times = 0;
self.setInterval("show()", 1000);
function updatetime() {
	showtime = Math.floor((time1 / 3600) % 24) + ":" + Math.floor(time1 / 60)
			+ ":" + Math.floor(time1 % 60);
	if (time1 != 0) {
		time1--;
	} else if (time1 == 0)
		{
			time1 = 0;
			alert();
			
		}

}
function show() {
	updatetime();
	document.getElementById("time").innerHTML = showtime;
}

function startTime(){
	if(time==0){
		show();
		times++;
	}
	else{
		var r=confirm("是否重新开始做题");
		if(r==true){
//			window.location.reload(true);
			document.getElementById("practice").reset();
			times=0;
			time1=1800;
		}
	}
}



/**
 * 系统时间
 */
function setDateTime() {
	var date = new Date();
	var day = date.getDay();
	var week;
	switch (day) {
	case 0:
		week = "星期日";
		break;
	case 1:
		week = "星期一";
		break;
	case 2:
		week = "星期二";
		break;
	case 3:
		week = "星期三";
		break;
	case 4:
		week = "星期四";
		break;
	case 5:
		week = "星期五";
		break;
	case 6:
		week = "星期六";
		break;
	}
	var today = date.getFullYear() + "年" + (date.getMonth() + 1) + "月"
			+ date.getDate() + "日  " + week + " " + date.getHours() + ":"
			+ date.getMinutes() + ":" + date.getSeconds();
	document.getElementById("current_time").innerHTML = today;
}
//显示当前时间
function startcurrentTime(){
  window.setInterval("setDateTime()", 1000);
}