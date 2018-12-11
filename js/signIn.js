  var lis = document.getElementsByClassName("box_li");
	        var index = 0;
	        var clearFirst = function () {
            for(var i = 0; i < lis.length; i ++) { 
                  lis[i].className = "box_li";
				  lis[i].style.opacity = "0";
             }
        }

        
        var goIndex = function () {
            clearFirst();
            lis[index].className = "box_li first";
			lis[index].style.opacity = "1";

        }

        
        var goNext = function () {
            if(index < 2) {
                 index ++;
            }else {
                 index = 0;
            }
            goIndex();
        }
		setInterval(function() {
	     goNext();
	   }, 3000);
      // 图片轮播	   
	   

     // 输入验证
	   var userName = document.getElementsByClassName("userName")[0];
	   var userPassword = document.getElementsByClassName("userPassword")[0];
	   var userValue = userName.value;
	   var passwordValue = userPassword.value;
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   