/*
Author{ Yared Y Yehualashet }
Date{ 11/01/2022 }

Variables{
  Label hrLb; 
  Label perLb;
  Label yrLb;
  TextField hrTxt;
  TextField perTxt;
  TextField yrTxt;
  Button hrBut;
  Button yrBut;
  int value;
  int hrPrWk;
  HBox lbBox;
  HBox txtBox;
  HBox butBox;
  VBox mnBox;
  Scene scene;
}

Methods{
  main(String[] args)
  start(Stage primaryStage)
}

Classes{
  Main extends Application
}

Description{
  *This was just a quick side project to make a hourly wage to annual wage converter.
  *I made it because the online calculators I found don't switch hours per week.
  *Perfect to convert one from another when answering how much you wanted to get paid.
  *You can always steal this code and use/improve if you want, just give me some credit.
}
*/

//javafx imports *none are useless*
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

//class, only class, comment for looks
public class Converter extends Application 
{ 
  //app start method, *required
  @Override
  public void start(Stage primaryStage) {
    //variable in ordered list of appearance
    Label hrLb; 
    Label perLb;
    Label yrLb;
    
    TextField hrTxt;
    TextField perTxt;
    TextField yrTxt;
    
    Button hrBut;
    Button yrBut;
    int value;
    int hrPrWk;
    
    HBox lbBox;
    HBox txtBox;
    HBox butBox;
    VBox mnBox;
    
    Scene scene;

    
    //creates label with size
    hrLb = new Label("Hourly Wage!");
    hrLb.setMaxWidth(200);

    perLb = new Label("Hours per Week");
    perLb.setMaxWidth(200);

    yrLb = new Label("Annual Wage!");
    yrLb.setMaxWidth(200);

    
    //adds to a HBox for labels
    lbBox = new HBox(hrLb, perLb, yrLb);
    lbBox.setSpacing(50);
    lbBox.setAlignment(Pos.CENTER);

    
    //creates text field with size
    hrTxt= new TextField("0");
    hrTxt.setMaxWidth(80);

    perTxt = new TextField("40");
    perTxt.setMaxWidth(50);
    
    yrTxt= new TextField("0");
    yrTxt.setMaxWidth(80);
    

    //sets up text HBox
    txtBox = new HBox(hrTxt, perTxt,yrTxt);
    txtBox.setSpacing(85);
    txtBox.setAlignment(Pos.CENTER);


    //creates buttons and int holder for getting value of txtFields
    hrBut = new Button("Convert to Yearly!");
    yrBut = new Button("Convert to Hourly!");
    value = 0;
    hrPrWk = 40;
    
    //sets up actions
    hrBut.setOnAction(
      new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
          
          yrTxt.setText(hrTxt.getText());
        } 
      }
    );

    
    //sets up button Hbox
    butBox = new HBox(hrBut, yrBut);
    butBox.setSpacing(150);
    butBox.setAlignment(Pos.CENTER);



    
    //sets up main VBox
    mnBox = new VBox(lbBox, txtBox, butBox);
    mnBox.setSpacing(20);
    mnBox.setAlignment(Pos.CENTER);

    //scene setup
    scene = new Scene(mnBox, 515, 325);

    //stage setup
    primaryStage.setTitle("Wage Converter!");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 

  //main method for running javaFx
  public static void main(String[] args) {
    launch(args);
  }
} 
