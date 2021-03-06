package com.nt.util;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils {
	
	public static String generateToken(String clientId, String subjet, String secretKey)
	{
		return Jwts.builder().setId(clientId).setSubject(subjet).setIssuer("Eidiko")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(10)))
				.signWith(SignatureAlgorithm.HS256,Base64.getEncoder().encode(secretKey.getBytes())).compact();
	}
//======================================Get Token details=======================
	
	public static Claims getClaims(String skey, String token) {
		return Jwts.parser().setSigningKey(Base64.getEncoder().encode(skey.getBytes())).parseClaimsJws(token).getBody();
	}
//======================validate token===========================
	public static boolean isTokenValid(String skey, String token)
	{
		Date tokenExpiryDate = getClaims(skey,token).getExpiration();
		Date sysDate = new Date();
		return sysDate.before(tokenExpiryDate);
	}
//======================get subject/user name===========================
	public static String getSubject(String skey,String token)
	{
		return getClaims(skey,token).getSubject();
	}
//======================GetExpiry date of token==========================
	public static Date getExpiryDate(String skey,String token)
	{
		return getClaims(skey,token).getExpiration();
	}
}
