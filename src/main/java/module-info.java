module br.edu.fap.ce.pds2_ex13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.fap.ce.pds2_ex13 to javafx.fxml;
    exports br.edu.fap.ce.pds2_ex13;
}