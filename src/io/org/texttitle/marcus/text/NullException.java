package io.org.texttitle.marcus.text;

public class NullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static boolean isNull(Object object) {
     
      if(object == null) {
    	  return true;
      }else {
    	  return false;
      }
	}

}
