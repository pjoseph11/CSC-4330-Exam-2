import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.lang.model.SourceVersion;

public class Regex {
	public static String match(String word)
	{
	    String token = "ERROR NOT VALID";
	    
 // to match declaration
	    String strID = "^!![\\w]*";
		Pattern patID = Pattern.compile(strID);
	    Matcher matcherID = patID.matcher(word);
	    boolean matchFoundID = matcherID.find(); 
	    if(matchFoundID) {
	    	token = "Declaration";
	    	return token;
	    }    
 // to match Start Stop
		String strDL = "^(~~|!~)[\\\\w]*";
		Pattern patDL = Pattern.compile(strDL);
	    Matcher matcherDL = patDL.matcher(word);
	    boolean matchFoundDL = matcherDL.find(); 
	    if(matchFoundDL) {
	    	token = "START STOP";
	    	return token;
	    }
	    
// to match integer literal
		String strL = "^[1248]_\\d*";
		Pattern patL = Pattern.compile(strL);
	    Matcher matcherL = patL.matcher(word);
	    boolean matchFoundL = matcherL.find(); 
	    if(matchFoundL) {
	    	token = "Integer Literal";
	    	return token;
	    }
// to match variables
 		String strOL = "^[a-zA-Z_]{6,8}$";
 		Pattern patOL = Pattern.compile(strOL);
 	    Matcher matcherOL = patOL.matcher(word);
 	    boolean matchFoundOL = matcherOL.find(); 
 	    if(matchFoundOL) {
 	    	token = "Variable";
 	    	return token;
 	    }
// to match loops
 	   String strBI = "^@\\w*";
		Pattern patBI = Pattern.compile(strBI);
	    Matcher matcherBI = patBI.matcher(word);
	    boolean matchFoundBI = matcherBI.find(); 
	    if(matchFoundBI) {
	    	token = "Binary Literal";
	    	return token;
	    }
	    
// to match selection statement
	    String strSTR = "^(##|!#)[\\w]*";
		Pattern patSTR = Pattern.compile(strSTR);
	    Matcher matcherSTR = patSTR.matcher(word);
	    boolean matchFoundSTR = matcherSTR.find(); 
	    if(matchFoundSTR) {
	    	token = "Selection Statement";
	    	return token;
	    }
	    
 // to match operators
	    String strOP = "(\\+|-|\\*|/|%|<|>|<=|>=|==|!=)";
		Pattern patOP = Pattern.compile(strOP);
	    Matcher matcherOP = patOP.matcher(word);
	    boolean matchFoundOP = matcherOP.find(); 
	    if(matchFoundOP) {
	    	token = "Operator";
	    	return token;
	    }
	    
		return token;  	
    } 	

}

