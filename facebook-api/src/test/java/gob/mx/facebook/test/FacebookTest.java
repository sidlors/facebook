/**
 * 
 */
package gob.mx.facebook.test;

import static org.junit.Assert.*;

import org.junit.Test;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;



/**
 * @author jhernandezn
 *
 */
public class FacebookTest {
	
	
	Facebook facebook = new FacebookFactory().getInstance();
	
	@Test
	public void connect(){
		
//		facebook.setOAuthAppId(appId, appSecret);
//		facebook.setOAuthPermissions(commaSeparetedPermissions);
//		facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
		
	}
	

}
