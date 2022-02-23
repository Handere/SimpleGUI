import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class allClientCode {

    //Scenario 1.1: Les example.json og skriv ut alle values i HashMapet
    //Alt 1
    String jsonFile = "example.json";
    HashMap<String, String> jsonHasMapFromFile = new HashMap<>();
    jsonHasMapFromFile = FileReader.readJsonFile(jsonFile);

    for (String value : jsonHasMapFromFile.values()) {
        System.out.print(value);
    }

    //Alt 2
    String filePath = "example.json";
    JsonString json = FileReader.opneFil(filePath);
    HashMap<String, String> jsonHashMap = new HashMap<>();
    jsonHashMap = json.toHashMap();

    for (String value : jsonHashMap.values()) {
        System.out.print(value);
    }


    //Scenario 1.2: Les example.csv og skriv ut alle verdier fra listen
    //Alt 1
    String csvFile = "example.csv";

    ArrayList<String> csvArrayFromFile = new ArrayList<>();
    csvArrayFromFile = FileReader.readCSVFile(csvFile);

    for (String value : csvArrayFromFile) {
        System.out.print(value);
    }

    //Alt 2
    String filename = 'filepath';
    FileReader fileReader = new FileReader(filename);

    while(fileReader.line != null) {
        String[] csvValues = line.split(';');
    }

    for(String value : csvValues) {
        System.out.println(value);
    }

    //Alt 3
    static void readCSV(String filePath){
        CSV = opneFil(filePath);
        content = toString(checkContent(CSV));
        return content;
    }


    //Scenario 1.3: Skriv et objekt, randomObject, til example.json
    //Alt 1
    String jsonFile = "example.json";
    RandomObject randomObject = new RandomObject();
    FileReader.writeToJsonFile(jsonFile, randomObject);

    //Alt 2
    String jsonFile = "example.json";
    static void writejSON(){
        FileWriter fw = new FileWriter("example.json");
        try {
            writeToFile;
        }catch (error){

        }
    }


    //Scenario 1.4: Skriv en tekststreng i csv format til ønsket csv fil
    //Alt 1
    String stringToBeWrittenToCSVFile;
    FileReader.writeToCSVFile("example.csv", stringToBeWrittenToCSVFile);

    //Alt 2
    static void writeCSV(){
        FileWriter fw = new FileWriter("navn.CSV");
        try {
            writeToFile;
        }catch (error){

        }
    }


    //Scenario 2.1: Opprette et tomt vindu og sette størrelsen til 500x500
    //Alt 1
    int height = 500;
    int width = 500;
    WindowBuilder rootWindow = new WindowBuilder();
    rootWindow.setHeight(height);
    rootWindow.setWidth(width);

    //Alt 2
    //javafx i bunn
    int height = 500;
    int width = 500;
    Group root = new Group();
    Scene.containModules moduleHolder = new Scene();
    moduleHolder.setsize(height, width);
    moduleHolder.build();

    //Alt 3
    int height = 500;
    int width = 500;
    static void createWindow(int height, int width){
        Window = createFrame(height, width);
        ShowInGUI(frame);
    }


    //Scenario 2.2: Opprett en ramme, og sett størrelse til 250x250 på rammen
    //Alt 1
    int height = 250;
    int width = 250;
    WindowBuilder rootWindow = new WindowBuilder();
    FrameBuilder frame = new FrameBuilder();
    frame.setHeight(height);
    frame.setWidth(width);
    rootWindow.addFrame(frame);

    //Alt 2
    int height = 250;
    int width = 250;
    ModuleFrame moduleFrame = new ModuleFrame();
    moduleFrame.setSize(height, width);

    //Alt 3
    int height = 250;
    int width = 250;
    static void createModuleWindow(int height, int width){
        frame = createFrame(height, width);
        ShowInGUI(frame);
    }


    //Scenario 2.3: Sette x/y koordinater på to rammer i samme vindu til: ramme 1 = 0.0, 0.0 og ramme 2 = 0.5, 0.5
    //Alt 1
    WindowBuilder rootWindow = new WindowBuilder();
    FrameBuilder frame1 = new FrameBuilder();
    FrameBuilder frame2 = new FrameBuilder();

    rootWindow.addFrame(frame1);
    rootWindow.addFrame(frame2);
    rootWindow.placeFrame(frame1, 0.0, 0.0);
    rootWindow.placeFrame(frame2, 0.5, 0.5);

    //Alt 2
    moduleHolder.place(moduleFrame1, 0.0, 0.0);
    moduleHolder.place(moduleFrame2, 0.5, 0.5);


    //Scenario 2.4: Opprette navigasjonsmeny med navigering mellom et vindu 1 og et vindu 2
    //Alt 1
    WindowBuilder rootWindow = new WindowBuilder();
    WindowBuilder window1 = new WindowBuilder();
    FrameBuilder navigationFrame = new FrameBuilder();

    NavigationBar navigationBar = new NavigationBar();
    Button navigationButton1 = new Button();
    Button navigationButton2 = new Button();

    navigationButton1.setTarget(window1);
    navigationButton2.setTarget(rootWindow);
    navigationButton1.setLabel("Go to window1");
    navigationButton2.setLabel("Go to rootWindow");

    navigationBar.addButton(navigationButton1);
    navigationBar.addButton(navigationButton2);

    navigationFrame.addModule(navigationBar);

    rootWindow.addFrame(navigationFrame);
    window1.addFrame(navigationFrame);

    //Alt 2
    Navigation meny = new navigation();
    meny.addButton(moduleHolder1.show());
    meny.addButton(moduleHolder2.show());
    //placeMeny() places the meny at the top of the window
    moduleHolder1.placeMeny(meny);
    moduleHolder2.placeMeny(meny);

    //Alt 3
    static void navigation(){
        menu = CreateToppbar();
        list = new Array [window1, window2];
        menu.items = list;
        showNavinGUI(menu);
    }


    //Scenario 2.5: Opprett rullefelt og sett retning til horisontalt og plassering nederst i vinduet
    //Alt 1
    WindowBuilder rootWindow = new WindowBuilder();
    rootWindow.addScrollbar();
    rootWindow.setScrollbarDirection().horizontal();
    rootWindow.setScrollbarLoaction().bottom();

    //Alt 2
    Navigation scrollbar = new navgiation();
    scrollbar.scroll(moduleHolder1, horizontal);

    //Alt 3
    static void scrollbar(){
        Scrollbar scroll = New Scrollbar(horizontal);
        Stick bottom;
        ShowScrollbarinGUI;
    }


    //Scenario 2.6: Opprette brødsmulesti og plassere den øverst i vinduet
    //Alt 1
    WindowBuilder rootWindow = new WindowBuilder();
    FrameBuilder frame = new FrameBuilder();

    frame.addBreadCrums();
    frame.setBreadCrumsLocation().top();

    rootWindow.addFrame(frame);

    //Alt 2
    Navigation breadcrum = new navigation();
    breadcrum.addLink(moduleHolder1);
    breadcrum.place(moduleHolder2).top();


    //Scenario 3.1: Opprette skjema-modul og sette tittel til "Form"
    //Alt 1
    FormBuilder form = new FormBuilder();
    form.setTitle("Form");

    //Alt 2
    Form form = new Form();
    form.setTitle('Form');
    form.place(moduleFrame1);

    //Alt 3
    static void FormModule(){
        newForm = createForm();
        setTitle = newTitle("Form");
        viewForm();
    }

    //Scenario 3.2: Opprette skjema-modul og legge til feltene navn, e-post, telefonnummer, adresse, passord,
    // nettadresse og bankkort. Og legge til korrosponderende validering.
    //Alt 1
    FormBuilder form = new FormBuilder();
    FieldBuilder fieldBuilder = new FieldBuilder();

    Field nameField = fieldBuilder.textField();
    Field mailField = fieldBuilder.spesialField();
    Field phoneField = fieldBuilder.integerField();
    Field addressField = fieldBuilder.spesialField();
    Field passwordField = fieldBuilder.spesialField();
    Field urlField = fieldBuilder.spesialField();
    Field creditCardField = fieldBuilder.integerField();

    nameField.addValidation().name();
    mailField.addValidation().mail();
    phoneField.addValidation().phone();
    addressField.addValidation().address();
    passwordField.addValidation().password();
    urlField.addValidation().url();
    creditCardField.addValidation().creditCard();


    form.addField(nameField);
    form.addField(mailField);
    form.addField(phoneField);
    form.addField(addressField);
    form.addField(passwordField);
    form.addField(urlField);
    form.addField(creditCardField);

    //Alt 2
    Form form = new Form();

    Field nameFiled = new Field;
    Field mailField = new Field;
    Field phoneField = new Field;
    Field addressField = new Field;
    Field passwordField = new Field;
    Field urlField = new Field;
    Field creditCardField = new Field;

    nameFiled.place(form);
    mailField.place(form);
    phoneField.place(form);
    addressField.place(form);
    passwordField.place(form);
    urlField.place(form);
    creditCardField.place(form);

    nameFiled.setType('name');
    mailField.setType('mail');
    phoneField.setType('phone');
    addressField.setType('address');
    passwordField.setType('password');
    urlField.setType('url');
    creditCardField.setType('card');

    nameFiled.setVal('personName');
    mailField.setVal('mailAddress');
    phoneField.setVal('phoneNumber');
    addressField.setVal('streetAddress');
    passwordField.setVal('password');
    urlField.setVal('url');
    creditCardField.setVal('creditCard');


    //Alt 3
    Form form = new Form();

    form.add(nameFiled(), emailFiled(), phoneFiled(), addressFiled(), PasswordFiled(), urlFiled(), bankcardFiled());

    static void nameFiled(){
        Add Onclick("Enter", validateName());
        ShowTextboxinGUI();
    }
    static void emailFiled(){
        CreateTextBox();
        Add Onclick("Enter", validateEmail());
        ShowTextboxinGUI();
    }
    static void phoneFiled(){
        CreateTextBox();
        Add Onclick("Enter", validatePhone());
        ShowTextboxinGUI();
    }
    static void addressFiled(){
        CreateTextBox();
        Add Onclick("Enter", validateAddress());
        ShowTextboxinGUI();
    }
    static void PasswordFiled(){
        CreateTextBox();
        Add Onclick("Enter", validatePassword());
        ShowTextboxinGUI();
    }
    static void urlFiled(){
        CreateTextBox();
        Add Onclick("Enter", validateURL());
        ShowTextboxinGUI();
    }
    static void bankcardFiled(){
        CreateTextBox();
        Add Onclick("Enter", validateBankCard());
        ShowTextboxinGUI();
    }

    //Scenario 3.3: Opprette skjema og legge til felt for filopplasting med begrensning til json og csv format
    //Alt 1
    FormBuilder form = new FormBuilder();
    FieldBuilder fieldBuilder = new FieldBuilder();

    Field fileUploadField = fieldBuilder.fileUpload();

    fileUploadField.addValidation().upload("json", "csv");
    form.addField(fileUploadField);

    //Alt 2
    Form form = new Form();
    Field fileUpload = new Field;
    fileUpload.place(form);
    fileUpload.setType('upload');
    fileUpload.selectFileFormat('json', 'csv');

    //Alt 3
    Form form = new Form();
    form.add(fileUpload(String filLocation));

    static void fileUpload(String filLocation){
        file = openFile(filLocation);
        fileButton = newButton(file);
        if checkFileType(file){
            showFileinGUI(file);
        }else{
            showwarning(wrongFileType);
        }
    }


    //Scenario 3.4: Opprette nedtrekksmeny og legge til feltene "German", "English" og "Norwegian".
    //Alt 1
    FormBuilder form = new FormBuilder();
    FieldBuilder fieldBuilder = new FieldBuilder();
    Field dropDownField = fieldBuilder.dropDown();

    dropDownField.addField("German");
    dropDownField.addField("English");
    dropDownField.addField("Norwegian");
    form.addField(dropDownField);

    //Alt 2
    Field pulldown = new Field;
    pulldown.place(form);
    pulldown.setType('pulldown');
    pulldown.addField('German');
    pulldown.addField('English');
    pulldown.addField('Norwegian');


    //Scenario 3.5: Opprette avkrysningsbokser og legge til feltnene "German", "English" og "Norwegian".
    //Alt 1
    FormBuilder form = new FormBuilder();
    FieldBuilder fieldBuilder = new FieldBuilder();
    Field checkBoxField = fieldBuilder.checkBox();

    checkBoxField.addField("German");
    checkBoxField.addField("English");
    checkBoxField.addField("Norwegian");
    form.addField(checkBoxField);

    //Alt 2
    static void checkBoxField1(){
        checkBox = newCheckBox(checkBoxF);
        setTextButton('German');
        showCheckBoxInGUI(checkBox);
    }
    static void checkBoxField2(){
        checkBox = newCheckBox(checkBoxF);
        setTextButton('English');
        showCheckBoxInGUI(checkBox);
    }
    static void checkBoxField3(){
        checkBox = newCheckBox(checkBoxF);
        setTextButton('Norwegian');
        showCheckBoxInGUI(checkBox);
    }


    //Scenario 4.1: Validere om en tekststreng er en e-postadresse
    //Alt 1
    String stringToBeValidated;
    if (Validation.mail(stringToBeValidated, TLD: "no"))
        DoSomething();
    else
        DoSomething();

    //Alt 2
    static boolean validateEmail (String email){
        String emailRegex = ""+""+"";
        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }


    //Scenario 4.2: Validere om et heltall er et telefonnummer med norsk landskode og 8 siffer
    //Alt 1
    int integerToBeValidated;
    if (Validation.phone(integerToBeValidated), country: "NO", numbers: 8)
        DoSomething();
    else
        DoSomething();

    //Alt 2
    static boolean validatePhone(String str){
        Pattern monster = Pattern.compile("(0047|\\+47|47)?\\d{8}");
        Matcher match = monster.matcher(str);
        return (match.find() && match.group().equals(str));
    }


    //Scenario 4.3: Validere om en tekststreng er et passord med minst 8 tegn, én stor bokstav, én liten bokstav, ett tall og ett spesialtegn
    //Alt 1
    String stringToBeValidated;
    if (Validation.password(stringToBeValidated, Min: 8, Maks: 20, UppercaseChar: True, LowercaseChar: True, Integer: True, SpesialChar: True))
        DoSomething();
    else
        DoSomething();

    //Alt 2
    static boolean validatePassword(String pass){
        String passRegex = ("^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$");
        Pattern pat = Pattern.compile(passRegex);
        return pat.matcher(pass).matches();
    }


    //Scenario 4.4: Validere om en tekststreng er en nettadresse med toppdomene .com
    //Alt 1
    String stringToBeValidated;
    if (Validation.url(stringToBeValidated, TLD: "com"))
        DoSomething();
    else
        DoSomething();

    //Alt 2
    static boolean validateURL(String url){
        String nettRegex = ("/(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\." +
                "[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]" +
                "{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})/gi");
        Pattern pat = Pattern.compile(nettRegex);
        return pat.matcher(url).matches();
    }


    //Scenario 4.5: Validere om et heltall er et bankkontonummer
    //Alt 1
    int integerToBeValidated;
    if (Validation.creditCard(integerToBeValidated))
        DoSomething();
    else
        DoSomething();

    //Alt 2
    static void validateBankCard(String cardNr) {
        if (CheckIfOnlyNumbers() and CheckIfLenghtIsCorrect()){
            return true;
        }
        else {
            return false;
        }
    }


    //Scenario 4.6: Validere om en tekststreng er et navn med minst 2 og maks 50 bokstaver
    //Alt 1
        String stringToBeValidated;
    if (Validation.name(stringToBeValidated, Min: 2, Max: 50))
        DoSomething();
    else
        DoSomething();

    //Alt 2
    static void validateName(){
        if (CheckIfOnlycharacters(Min 2, Max 50)) {
            return true;
        }else {
            return false;
        }

    }


    //Scenario 4.7: Validere om en tekststreng er en gateadresse
    //Alt 1
    String stringToBeValidated;
    if (Validation.address(stringToBeValidated))
        DoSomething();
    else
        DoSomething();


    //Scenario 5.1: Opprette nedtrekksmeny og legge til feltene "German", "English" og "Norwegian".
    //Alt 1
    DropDownButton dropDownButton = new DropDownButton();
    dropDownButton.addField("German");
    dropDownButton.addField("English");
    dropDownButton.addField("Norwegian");

    //Alt 2
    static void MakeDropDownButton(list with elements){
        DropDown = CreateDropDown("German", "English", "Norwegian");
        showinGUI(DropDown);
    }


    //Scenario 5.2: Opprette tre radioknapper med etikettene "German", "English" og "Norwegian".
    //Alt 1
    RadioButton radioButton = new RadioButton();
    RadioButton radioButton1 = new RadioButton();
    RadioButton radioButton2 = new RadioButton();
    radioButton.setLabel("German");
    radioButton1.setLabel("English");
    radioButton2.setLabel("Norwegian");

    //Alt 2
    static void radioButton1(){
        radioButton = newRadioButton(radioB);
        setButtonText("German");
        showRadioButtonInGUI(radioButton);
    }
    static void radioButton2(){
        radioButton = newRadioButton(radioB);
        setButtonText("English");
        showRadioButtonInGUI(radioButton);
    }
    static void radioButton3(){
        radioButton = newRadioButton(radioB);
        setButtonText("Norwegian");
        showRadioButtonInGUI(radioButton);
    }


    //Scenario 5.3: Opprette tre toggle-knapper med etikettene "German", "English" og "Norwegian".
    //Alt 1
    ToggleButton toggleButton = new ToggleButton();
    ToggleButton toggleButton1 = new ToggleButton();
    ToggleButton toggleButton2 = new ToggleButton();
    toggleButton.setLabel("German");
    toggleButton1.setLabel("English");
    toggleButton2.setLabel("Norwegian");

    //Alt 2
    static void toggleButton1(){
        toggleButton = newButton(toggle);
        settextButton("German");
        showToggleInGUI(toggleButton);
    }
    static void toggleButton2(){
        toggleButton = newButton(toggle);
        settextButton("English");
        showToggleInGUI(toggleButton);
    }
    static void toggleButton3(){
        toggleButton = newButton(toggle);
        settextButton("Norwegian");
        showToggleInGUI(toggleButton);
    }


    //Scenario 6.1: Opprette bildefremviser og sette høyden til 100px og bredden til 150px.
    //Alt 1
    int height = 100;
    int width = 150;

    PictureViewer pictureViewer = new PictureViewer();

    pictureViewer.setSource("examplePicture.jpg");
    pictureViewer.setHeight(height);
    pictureViewer.setWidth(width);

    //Alt 2
    static void pictureViewer(String fileLocation){
        PictureFile = openFile(fileLocation);
        width = checkWidth(PictureFile);
        height = checkHeight(PictureFile);
        showPictureGUI(PictureFile, width, height);
    }


    //Scenario 6.2: Opprette musikkspiller og sette høyden til 100px og bredden til 150px.
    //Alt 1
    int height = 100;
    int width = 150;

    MusicPlayer musicPlayer = new MusicPlayer();

    musicPlayer.setSource("exampleMusic.mp3");
    musicPlayer.setHeight(height);
    musicPlayer.setWidth(width);

    //Alt 2
    static void musicPlayer(String fileLocation){
        soundFile = openFile(fileLocation);
        time = checkTime(soundFile);
        setWidth(150);
        setHeight(100);
        playFileGUI(soundFile, time);
    }


    //Scenario 7.1: Opprette kalender og legge til en eksempel hendelse
    //Alt 1
    Calender calender = new Calender();
    CalenderEvent calenderEvent = new CalenderEvent();

    calenderEvent.setDateTime("2022.01.01 12:00");
    calenderEvent.setLabel("Example event");
    calender.addEvent(calenderEvent);

    //Alt 2
    static Calendar makeCalendar(){
        makeCalendarVariable();
        return Calendar;
    }

    static void showCalendar(){
        makeCalendar;
        showCalendarinGUI();
    }
    static void CalendarEvent(){
        eventTime("2022.01.01 12:00");
        nameEvent("BirthdayParty");
        showeventinCalendar();
    }


    //Scenario 7.2: Opprette klokke og angi visning til digital
    //Alt 1
    Clock clock = new Clock();
    clock.setView().digital();

    //Alt 2
    static Clock makeWatch(){
        makeWatchVariable();
        return Clock;
    }

    static void showWatch(){
        makeWatch();
        showWatchinGUI();
    }


}
