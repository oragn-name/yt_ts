//扩展easyui表单的验证
$
		.extend(
				$.fn.validatebox.defaults.rules,
				{
					// 验证汉子
					CHS : {
						validator : function(value) {
							return /^[\u0391-\uFFE5]+$/.test(value);
						},
						message : '只能输入汉字'
					},
					// 移动手机号码验证
					mobile : {// value值为文本框中的值
						validator : function(value) {
							var reg = /^1[3|4|5|8|9]\d{9}$/;
							return reg.test(value);
						},
						message : '输入手机号码格式不准确.'
					},
					// 国内邮编验证
					zipcode : {
						validator : function(value) {
							var reg = /^[1-9]\d{5}$/;
							return reg.test(value);
						},
						message : '邮编必须是非0开始的6位数字.'
					},
					idcard : {// 验证身份证
						validator : function(value) {
							return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
						},
						message : '身份证号码格式不正确'
					},
					intOrFloat:{
						validator:function(value){
							return /^\d+(\.\d+)?$/i.test(value);
						},
					    message:'请输入小数或整数'
					},
					number : {//正整数，包括0（00，01非数字）  
				        validator: function(value, param){  
				            return isNumber(value);  
				        },  
				        message: '只能输入整数'  
				    },
					qq : {// 验证QQ,从10000开始
						validator : function(value) {
							return /^[1-9]\d{4,9}$/i.test(value);
						},
						message : 'QQ号码格式不正确'
					},
					// 用户账号验证(只能包括 _ 数字 字母)
					account : {// param的值为[]中值
						validator : function(value, param) {
							if (value.length < param[0]
									|| value.length > param[1]) {
								$.fn.validatebox.defaults.rules.account.message = '长度必须在'
										+ param[0] + '至' + param[1] + '范围';
								return false;
							} else {
								if (!/^[\w]+$/.test(value)) {
									$.fn.validatebox.defaults.rules.account.message = '只能数字、字母、下划线组成.';
									return false;
								} else {
									return true;
								}
							}
						},
						message : ''
					}
				})
				
				
				
 function isNumber(z_check_value){  
    var z_reg = /^(([0-9])|([1-9]([0-9]+)))$/;  
    return z_reg.test($.trim(z_check_value));  
};  