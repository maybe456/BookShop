module com.example.bookshop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bookshop to javafx.fxml;
    exports com.example.bookshop;
    exports com.example.bookshop.Controllers;
    exports com.example.bookshop.Controllers.Print;
    exports com.example.bookshop.Controllers.Cart;
    exports com.example.bookshop.Controllers.Items;
    exports com.example.bookshop.Controllers.Receipt;
    exports com.example.bookshop.Models;
    exports com.example.bookshop.Views;
}