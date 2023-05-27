module com.github.truejacobg.agls {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.github.truejacobg.agls to javafx.fxml;
    exports com.github.truejacobg.agls;
}