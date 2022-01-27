/*
 * @author Jordon m
 * @date 2022-01-19
 * @class name: FXMLDocumentController
 * @description: This class contains all the code when the user interacts with the GUI
 */


//Importing all the nessary libaries for JAVA FX
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

//Implements mean that we are using an interface in the class
public class FXMLDocumentController implements Initializable {
    
    //@FXML is used to tag a non public stuff for use by the FXML documnet
    @FXML
    //the TextFeild variable will hold the value inside the display screen of the calculator
    private TextField txtDisplay;
    //The decimal Click Variable will hold the number of times the user clicked the decimal button so that the user doesnt click the decimal button more than once
    private int decimalClick = 0;
    //This String variable holds the value of the general operation(+, -, %, x) of the general operations button that the user clicked
    private String generalOperationObject;
    //This double variable stores the first number that the user inputted 
    private double firstDouble;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //the following methods were automaticly generated by JAVA FX screen buidler
    @FXML
    
    /**
     * @method name: handlerGeneralAction
     * @Discription: This method holds all the code that is to be excuted once the user clicks a General action button
     */
    private void handlerGeneralAction(ActionEvent event) {
        //This variable holds the text value inside the button so the program knows what operation to do
        generalOperationObject = ((Button)event.getSource()).getText();
        //I use a switch for each type of button that could be clicked
        switch(generalOperationObject){
            //This case is for if the user clicks the AC button
            case "AC":
                //Here is set the display screen to nothing
                txtDisplay.setText("");
                //Here I set the amount of times a decimal value was clicked to 0
                decimalClick=0;
                break;
            //This case is for if the user clicks the +/- button which turns a value into postive or negative
            case "+/-":
                //Here I convert the text value that is stored inside the display screen into a double
                double plusMinus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                //Here I multiply the value by -1
                plusMinus = plusMinus*(-1);
                //Here I print out the resultant value into the display screen
                txtDisplay.setText(String.valueOf(plusMinus));
                break;
             //These cases are for all the operations that the calculator can preform
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                //This string gets the value that was orginally in the screen
                String currentText = txtDisplay.getText();
                //This variable converts the value that was originally in the screen into a double
                firstDouble = Double.parseDouble(currentText);
                //This clears the screen
                txtDisplay.setText("");
                //This sets the decimal click to 0
                decimalClick = 0;
                break;
            default:
             
                
        }
    }

    @FXML
    /**
     * @method name: handlerDigitAction
     * @Discription: This method holds all the code that is to be excuted once the user clicks a digit
     */
    private void handlerDigitAction(ActionEvent event) {
        String digitObject = ((Button)event.getSource()).getText();
        String oldText = txtDisplay.getText();
        String newText = oldText+digitObject;
        txtDisplay.setText(newText);
    }
    
    /**
     * @method name: handlerDecimalAction
     * @Discription: This method holds all the code that is to be excuted once the user clicks a decimal button
     */
    @FXML
    private void handlerDecimalAction(ActionEvent event) {
        //Here I make sure the user never clicked a decimal before, becuase u cant have more than 1 decimal per number
        if(decimalClick == 0){
            //here it gets the string values stored inside the decimal
            String decimalObject = ((Button)event.getSource()).getText();
            //Here It gets the string value currently displayed on screen
            String oldText = txtDisplay.getText();
            //Here It adds the decimal to the old number and stores it in this new variable
            String newText = oldText+decimalObject;
            //Here I set the screen to the new variable
            txtDisplay.setText(newText); 
            //Here I set the decimal click varible into 1, so that the user cannot click another decimal
            decimalClick = 1;
        }
    }
    
    /**
     * @method name: handlerEqualAction
     * @Discription: This method holds all the code that is to be excuted once the user clicks a equal button
     */
    @FXML
    private void handlerEqualAction(ActionEvent event) {
        //Here It stores the number the user inpuuted right before the user pressed the equals button, which is the second number
        double secondDouble;
        //Here It initializes the result variable
        double result = 0;
        //Here It gets the text that was displayed on screen before the user hit the equal button
        String secondText = txtDisplay.getText();
        //Here I convert that text into a double to preform claculations
        secondDouble = Double.parseDouble(secondText);

        //This switch is to preform each type of clacultion
        switch(generalOperationObject){
            //this case is for addition
            case "+":
                //Here I set the result to the first number plus the second number
                result = firstDouble + secondDouble;
                break;
            //this case is for subtration
            case "-":
                //Here I set the result to the first number subtract the second number
                result = firstDouble - secondDouble;
                break;
            //this case is for multiplication
            case "*":
                //Here I set the result to the first number times the second number
                result = firstDouble * secondDouble;
                break;
            //this case is for addition
            case "/":
                
                //Here I set the result to the first number divide the second number
                result = firstDouble / secondDouble;
                break;
                default:
        }
        //Here I format the result
        String format = String.format("%.1f", result);
        //Here I set the display screen to the result
        txtDisplay.setText(format);
        
    }
    
}
