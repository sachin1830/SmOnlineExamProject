$(function() {
$(".selectbtnn").click(function() {
	var test= $(this).closest(".correntcontainer");
	var select=$(this).closest(".correntcontainer").find("input[name='item']:checked").val();
	var uid= $(this).closest(".correntcontainer").find(".qid").val();
	console.log(select);
console.log(uid);
	$.ajax({
		type: 'POST' ,
		url: 'QfController',
		data:{select:select,uid:uid},
		success:function(result){
			if(result === 'Success')
				{
				 $(this).closest(".correntcontainer").find("input[name='item']:checked").after("<i>this is select</i>");
				 test.closest('.correntcontainer').addClass("alert alert-success");
				 test.closest('.correntcontainer').removeClass("alert alert-danger");
				}
			else
				{
				 test.closest('.correntcontainer').addClass("alert alert-danger");
				 test.closest('.correntcontainer').removeClass("alert alert-success");
				}
		}
	});
});
});