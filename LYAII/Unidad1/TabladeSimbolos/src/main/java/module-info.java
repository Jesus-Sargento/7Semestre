module com.jesusystems.tabladesombolos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jesusystems.tabladesombolos to javafx.fxml;
    exports com.jesusystems.tabladesombolos;
}