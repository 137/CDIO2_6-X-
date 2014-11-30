flag = 0;
function hide_show(id) {

	if (flag == 0) {
		alert("您确定要关闭输入框吗？");
		document.getElementById(id).style.display = "none";
		document.getElementById("kaiguan").value = "开";
		flag = 1;
		return;
	} else if (flag == 1) {
		document.getElementById(id).style.display = "block";
		document.getElementById("kaiguan").value = "关";
		flag = 0;
		return;
	}
}