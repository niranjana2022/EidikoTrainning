package in.nareshit.niranjana.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationController {
	@GetMapping("/report/{no}/{cname}")  //if we place more than 2 propeties in postman request url then we get 404 error..becoz it can't found the properties/key in method Request path
	public String fetchData1(@PathVariable Integer no, @PathVariable String cname) //if u change the order of key's value then also we et 404 error.. 
	{                                                                                                                                                  //if u give less than 2 properties then also we get 404 error..But we cann overcome this problem by using required=false
		return "fetchData1 "+ no+"---"+cname;
	}
//	======================================================================	
	@GetMapping("/report/no/{name}")
	public   String  fetchData3(@PathVariable(name="name",required = false)String  cname,
			                                          @PathVariable(required = false) Integer  no) {
		 return    "fetchData3 ";    //http://localhost:8080/report/no/raja(ans: fetchData3)
	}
//======================================================================	
//======================================================================	
	@GetMapping("/report/{no}/name")
	public   String  fetchData5(@PathVariable(name="name",required = false)String  cname,
			                                          @PathVariable(required = false) Integer  no) {
		 return      "fetchData5 ";            //http://localhost:8080/report/101/name (ans: fetchData5 )
	}
//==========================================================================
	@GetMapping("/report/no/name")
	public   String  fetchData6(@PathVariable(name="name",required = false)String  cname,
			                                          @PathVariable(required = false) Integer  no) {
		 return     "fetchData6 ";              //http://localhost:8080/report/no/name (ans: fetchData6 )
	}
}
