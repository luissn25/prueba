/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menufileyedit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


/**
 *
 * @author luisj
 */
public class MenuFileyEdit extends Application {
    
 @Override
    public void start(Stage primaryStage) {
       MenuBar mnbMenus = new MenuBar();
        Menu mnuFile = new Menu("_File");
        MenuItem mniNewProject = new MenuItem("_New Project");
        mniNewProject.setGraphic(new ImageView("folder/2.png")); 
        MenuItem mniNewFile = new MenuItem("_New File...");
        mniNewFile.setGraphic(new ImageView("folder/1.png")); 
        MenuItem mniOpenProject = new MenuItem("_Open Project...");
        mniOpenProject.setGraphic(new ImageView("folder/3.png")); 
        MenuItem mniOpenRecentProject = new MenuItem("_Open Recent Project");
        MenuItem mniCloseProject = new MenuItem("_Close Project");
        MenuItem mniCloseOtherProjects = new MenuItem("_Close Other Projects");
        MenuItem mniCloseAllProjects = new MenuItem("_Close All Projects");
        MenuItem mniOpenFile = new MenuItem("_Open File...");
        MenuItem mniOpenRecentFile = new MenuItem("_Open Recent File");
        MenuItem mniProjectGroups = new MenuItem("_Project Groups...");
        MenuItem mniProjectProperties = new MenuItem("_Project Properties");
        MenuItem mniImportProject = new MenuItem("_Import Project");
        MenuItem mniExportProject = new MenuItem("_Export Project");
        MenuItem mniSave = new MenuItem("_Save");
        MenuItem mniSaveAs = new MenuItem("_Save As...");
        MenuItem mniSaveAll = new MenuItem("_Save All");
        MenuItem mniPageSetup = new MenuItem("_Page Setup...");
        MenuItem mniPrint = new MenuItem("_Print...");
        MenuItem mniPrinttoHTML = new MenuItem("_Print to HTML...");
        MenuItem mniExit = new MenuItem("E_xit");
        Menu mnuEdit = new Menu("Edit");   
        CheckMenuItem cmiUndo = new CheckMenuItem("_Undo");
        cmiUndo.setGraphic(new ImageView("folder/undo.png")); 
        CheckMenuItem cmiRedo = new CheckMenuItem("_Redo");
        cmiRedo.setGraphic(new ImageView("folder/redo.png")); 
        CheckMenuItem cmiCut = new CheckMenuItem("_Cut"); 
        cmiCut.setGraphic(new ImageView("folder/cut.png")); 
        CheckMenuItem cmiCopy = new CheckMenuItem("_Copy");
        cmiCopy.setGraphic(new ImageView("folder/copy.png")); 
        CheckMenuItem cmiPaste = new CheckMenuItem("_Paste");
        cmiPaste.setGraphic(new ImageView("folder/paste.png")); 
        CheckMenuItem cmiPasteFormatted = new CheckMenuItem("_Paste Formatted");
        CheckMenuItem cmiPastefromHistory = new CheckMenuItem("_Paste from History");
        CheckMenuItem cmiPasteasLines = new CheckMenuItem("_Paste as Lines");       
        CheckMenuItem cmiDelete = new CheckMenuItem("_Delete");
        cmiDelete.setGraphic(new ImageView("folder/trash.png")); 
        CheckMenuItem cmiSelectAll = new CheckMenuItem("_Select All");
        CheckMenuItem cmiSelectIdentifier = new CheckMenuItem("_Select Identifier");
        CheckMenuItem cmiFindSelection = new CheckMenuItem("_Find Selection");
        CheckMenuItem cmiFindNext = new CheckMenuItem("_Find Next");       
        CheckMenuItem cmiFindPrevious = new CheckMenuItem("_Find Previous");
        CheckMenuItem cmiFind = new CheckMenuItem("_Find...");
        CheckMenuItem cmiReplace = new CheckMenuItem("_Replace...");
        CheckMenuItem cmiFindUsages = new CheckMenuItem("_Find Usages");
        CheckMenuItem cmiFindinProjects = new CheckMenuItem("_Find in Projects...");       
        CheckMenuItem cmiReplaceinProjects = new CheckMenuItem("_Replace in Projects...");
        CheckMenuItem cmiStartMacroRecording = new CheckMenuItem("_Start Macro Recording");
        CheckMenuItem cmiStopMacroRecording = new CheckMenuItem("_Stop Macro Recording");
        CheckMenuItem cmiResetJavaShell = new CheckMenuItem("_Reset Java Shell");
        cmiResetJavaShell.setGraphic(new ImageView("folder/skip.png")); 
        Label LblMsg = new Label();
        
        mnuFile.getItems().addAll(mniNewProject,mniNewFile,new SeparatorMenuItem(),mniOpenProject,mniOpenRecentProject,mniCloseProject,mniCloseOtherProjects,mniCloseAllProjects,mniOpenFile,mniOpenRecentFile,new SeparatorMenuItem(),mniProjectGroups,mniProjectProperties,new SeparatorMenuItem(),mniImportProject,mniExportProject,new SeparatorMenuItem(),mniSave,mniSaveAs,mniSaveAll,new SeparatorMenuItem(),mniPageSetup,mniPrint,mniPrinttoHTML,new SeparatorMenuItem(), mniExit); 
        mnuEdit.getItems().addAll(cmiUndo,cmiRedo,new SeparatorMenuItem(),cmiCut,cmiCopy,cmiPaste,cmiPasteFormatted,cmiPastefromHistory,cmiPasteasLines,cmiDelete,cmiSelectAll,cmiSelectIdentifier,new SeparatorMenuItem(),cmiFindSelection,cmiFindNext,cmiFindPrevious,new SeparatorMenuItem(),cmiFind,cmiReplace,cmiFindUsages,new SeparatorMenuItem(),cmiFindinProjects,cmiReplaceinProjects,new SeparatorMenuItem(),cmiStartMacroRecording,cmiStopMacroRecording,cmiResetJavaShell);
     
        mnuFile.setMnemonicParsing(true);
        mniNewProject.setMnemonicParsing(true);
        mniNewFile.setMnemonicParsing(true);
        mniOpenProject.setMnemonicParsing(true);
        mniOpenRecentProject.setMnemonicParsing(true);
        mniCloseProject.setMnemonicParsing(true);
        mniCloseOtherProjects.setMnemonicParsing(true);
        mniCloseAllProjects.setMnemonicParsing(true);
        mniOpenFile.setMnemonicParsing(true);
        mniOpenRecentFile.setMnemonicParsing(true);
        mniProjectGroups.setMnemonicParsing(true);
        mniProjectProperties.setMnemonicParsing(true);
        mniImportProject.setMnemonicParsing(true);
        mniExportProject.setMnemonicParsing(true);
        mniSave.setMnemonicParsing(true);
        mniSaveAs.setMnemonicParsing(true);
        mniSaveAll.setMnemonicParsing(true);
        mniPageSetup.setMnemonicParsing(true);
        mniPrint.setMnemonicParsing(true);
        mniPrinttoHTML.setMnemonicParsing(true);
        mniExit.setMnemonicParsing(true);  
        cmiUndo.setMnemonicParsing(true);
        cmiRedo.setMnemonicParsing(true);
        cmiCut.setMnemonicParsing(true);       
        cmiCopy.setMnemonicParsing(true);
        cmiPaste.setMnemonicParsing(true);
        cmiPasteFormatted.setMnemonicParsing(true);
        cmiPastefromHistory.setMnemonicParsing(true);
        cmiPasteasLines.setMnemonicParsing(true);      
        cmiDelete.setMnemonicParsing(true);
        cmiSelectAll.setMnemonicParsing(true);
        cmiSelectIdentifier.setMnemonicParsing(true);
        cmiFindSelection.setMnemonicParsing(true);
        cmiFindNext.setMnemonicParsing(true);       
        cmiFindPrevious.setMnemonicParsing(true);
        cmiFind.setMnemonicParsing(true);
        cmiReplace.setMnemonicParsing(true);
        cmiFindUsages.setMnemonicParsing(true);
        cmiFindinProjects.setMnemonicParsing(true);      
        cmiReplaceinProjects.setMnemonicParsing(true);
        cmiStartMacroRecording.setMnemonicParsing(true);
        cmiStopMacroRecording.setMnemonicParsing(true);
        
       mnbMenus.getMenus().addAll(mnuFile,mnuEdit);
         

        FlowPane root = new FlowPane();
        root.getChildren().add(mnbMenus);
        root.getChildren().add(LblMsg);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Uso de Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    }
