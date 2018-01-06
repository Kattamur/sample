function validation() {
	var pass1 = document.myform.pass.value;
	var pass2 = document.myform.cpass.value;
	var name = document.myform.fname.value;
	var lname = document.myform.lname.value;
	var flag = true;
	if (pass1 != pass2) {
		alert("password must be same");
		flag = false;
	}
	if (pass1.length < 5) {
		alert("Password must be minimum six characters");
		flag = false;
	}
	return flag;
}

