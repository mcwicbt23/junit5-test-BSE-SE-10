package icbt.batch3.helpers;

public class CodeHelper {
	
	public String createCode(String text){
		
		String prefix = "COD";
		String suffix = "INV";
		
		text = text.replaceAll("-", "_");

        String code = prefix + "-" + text + "-" + suffix;
        code = code.toUpperCase();
        return code;
    }
}
