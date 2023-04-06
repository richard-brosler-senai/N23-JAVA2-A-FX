module projetoJavaFX {
	requires javafx.controls;
	requires javafx.media;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.xerial.sqlitejdbc;
	
	opens br.com.senaisp.bauru.richard.secao09.exemplo02 to
		javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
	opens br.com.senaisp.bauru.richard.secao09.exemplo01 to 
		javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
	opens br.com.senaisp.bauru.richard.secao09.exemplo03 to 
	javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
	opens br.com.senaisp.bauru.richard.secao09.exemplo04 to 
	javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
	opens br.com.senaisp.bauru.richard.secao09.exemplo05 to 
	javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
	opens br.com.senaisp.bauru.richard.secao09.exemplo06 to 
	javafx.graphics, javafx.controls, javafx.media, javafx.fxml,
	org.xerial.sqlitejdbc;
}
