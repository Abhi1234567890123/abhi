package com.comcast.Contact;

import org.testng.annotations.Test;

public class createContactTest {
	
	@Test
	public void createContactTest() {
		System.out.println("execute createContactTest");
		
	}
	@Test
	public void createContactWithOrgTest() {
		System.out.println("execute createcontactwithOrgTest");
	}
	@Test
	public void deleteContactTest() {
		System.out.println("execute delete test");
	}

}

pm.test('Schema is valid', function () {
    var result=tv4.validateResult(pm.response.json(),schema);
    if(!result.valid){
        console.log(result);
    }
    pm.expect(result.valid).to.be.true;

