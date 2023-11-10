module pregao.br.pregao1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pregao.br.pregao1 to javafx.fxml;
    exports pregao.br.pregao1;
}