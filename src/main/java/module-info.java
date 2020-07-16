module com.paulnogas.log.analyzer {
    requires kotlin.stdlib;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.swing;
    requires org.kordamp.iconli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.material;
    requires tornadofx;

    exports com.paulnogas.log.analyzer;
    opens com.paulnogas.log.analyzer;
}