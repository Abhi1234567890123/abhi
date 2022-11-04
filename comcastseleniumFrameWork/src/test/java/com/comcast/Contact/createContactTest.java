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

"d": {
        "cnt_TRA": "122",
        "cnt_BRQ": "0",
        "cnt_GCS": "0",
        "cnt_LMS": "0",
        "cnt_TAS": "0",
        "cnt_PIPB": "0",
        "cnt_SM": "0",
        "cnt_SR": "0",
        "cnt_SPS": "0",
        "cnt_TARMAC": "0",
        "cnt_ITIME": "0",
        "cnt_AAM": "0",
        "cnt_AAI": "0",
        "cnt_CO": "0",
        "cnt_CA": "0",
        "cnt_CVM": "0",
        "cnt_CCL": "0",
        "cnt_ACT": "0",
        "cnt_ESS": "0",
        "cnt_ESOP": "0",
        "cnt_EMS": "0",
        "cnt_FM": "0",
        "cnt_GIS": "0",
        "cnt_IRFS": "0",
        "cnt_IFC": "0",
        "cnt_ODC": "0",
        "cnt_PMS": "0",
        "cnt_PG": "0",
        "cnt_RAS": "0",
        "cnt_RFS": "0",
        "cnt_SAINFRA": "0",
        "cnt_SMM": "0",
        "cnt_SSD": "0",
        "cnt_STA": "0",
        "cnt_TOSCANA": "0",
        "cnt_TMS": "0",
        "cnt_VCP": "0",
        "cnt_SATECH": "0"
    }
}
