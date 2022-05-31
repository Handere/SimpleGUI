# SimpleGUI
Rammeverk v/2022, gruppe 25


#Getting started guide

* Siste snapshot:  		    SimpleGUI-4.0-SNAPSHOT.jar
* Javadoc (tom. protected):	SimpleGUI/javadoc/index.html
* Javadoc (tom. private):	SimpleGUI/javadoc_developer/index.html


##Importer SimpleGUI til prosjekt i Intellij
File → Project strukture → Modules → Dependencies → + → JARs or directories → Choose .jar-file → Apply → Ok

import simpleGUI.*

```
##Eksempel 1
Opprett et vindu med størrelse 500x500px, og legg til en “click me” knapp.

   Window window = new WindowBuilder()
       .withCustomSize(500, 500)
       .build();
   Frame frame = new FrameBuilder(window)
       .withEventButton("click me")
       .build();

```

```
##Eksempel 2
Opprett to vinduer med menu-knapper som gjør det mulig å gå frem og tilbake mellom vinduene.
Legg videre inn en èn-linje merkelapp med navn  ‘’skjul meg’’ og en knapp med funksjon for
å skjule merkelappen når knappen blir trykket på.


Window window1 = new WindowBuilder()
.withMenu()
.isVisible(true)
.build();

Frame frame1 = new FrameBuilder(window1)
.build();

Window window2 = new WindowBuilder()
.withMenu()
.isVisible(false)
.build();

Frame frame2 = new FrameBuilder(window2)
.build();

Menu menu1 = new Menu(window1);
MenuButton menuButton1 = new MenuButton(menu1,"Go to Window 1");
menuButton1.navigateBetweenWindowsEvent(window1, window2);

SingleLineTextLabel singleLineTextLabel1 = new SingleLineTextLabel(frame1,"skjul meg");
EventButton eventButton1 = new EventButton(frame1, "Skjul");
eventButton1.showAndHideTextDisplayEvent(singleLineTextLabel1);

Menu menu2 = new Menu(window2);
MenuButton menuButton2 = new MenuButton(menu2, "Go to Window 2");
menuButton2.navigateBetweenWindowsEvent(window2, window1);

SingleLineTextLabel singleLineTextLabel2 = new SingleLineTextLabel(frame2, "skjul meg");
EventButton eventButton2 = new EventButton(frame2, "Skjul");
eventButton2.showAndHideTextDisplayEvent(singleLineTextLabel2);