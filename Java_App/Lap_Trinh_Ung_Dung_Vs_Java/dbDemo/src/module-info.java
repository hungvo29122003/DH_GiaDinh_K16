/**
 * 
 */
/**
 * 
 */
module dbDemo {
	requires java.sql;
	requires javafx.controls;
	
	exports databaseGUI ;
	
	opens databaseGUI to javafx.graphics;
}