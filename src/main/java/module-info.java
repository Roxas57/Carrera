module com.hilos.carrera.Carrera {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;

    opens com.hilos.carrera.Carrera to javafx.fxml;
    exports com.hilos.carrera.Carrera;
}
