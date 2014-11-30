function chg(obj) {
	if (obj.className != "over") {
		obj.oldClass = obj.className; // 暂存原来的class，用于恢复
		obj.className = "over";
	} else if (obj.oldClass) {
		obj.className = obj.oldClass; // 暂存原来的class，用于恢复
	}
}
