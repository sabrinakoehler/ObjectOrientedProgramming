# ObjectOrientedProgramming
IST 242, Section 001: Inter Oo App Dev, SP18 Fonseca WC 2181 - 201718SP

### Homework 1 

Create 3 classes, app, football player and football team. The application (app) will use the two other classes (football player and football team).

#### Description
	- January 14, 2018
App will create 11 football players (you can place them in an array or ArrayList) create a football team using the players above use the football team instance (object) to display the information requested in the lab.

```
Player class
	- 5 attributes from your choice
	- a method that returns the complete info about the player
	- 
Team class
	- a name and 
	- a mascot 
	- 11 football players	
	- A method that displays all the information about a team including:
    	- name
    	- mascot
    	- information on each player in the team

A "search" method that display information about a specific player in the team using an input parameter such as the player position or player number for instance. 
    
   "For instance, from team A, displays information about the quarterback, or display information about player number 5."
    
You can find some ideas for football player attributes on Wikipedia  (Links to an external site.)Links to an external site.or Go PSU Sports (Links to an external site.)Links to an external site.

---

### Homework 2

Create 3 classes, app, football player and football team. The application (app) will use the two other classes (football player and football team).

#### Description
	- January 21, 2018
App will create 11 football players (you can place them in an array or ArrayList) create a football team using the players above use the football team instance (object) to display the information requested in the lab.
	- Display the team info
	- Display the team rushing yards
	- use the football team instance (object) new search method to return an instance of a football player.
		- Display the returned player info or an error message if the player is not found

Player class
	- 5 attributes from your choice
	- a method that returns the complete info about the player
	- the regular set/get methods
	- *new* different from the lab requirement: a method that return the number of rushing yards as a random number. For instance, you call the method any time and the player       instance will return a random number between 0 and 100.
Team class
	- a name and 
	- a mascot 
	- 11 football players	
	- A method that displays all the information about a team including:
    	- name
    	- mascot
    	- information on each player in the team
	- a method that
		- *new* different from the lab requirement
			returns a footbalPlayer object based on  input information such as the player position or player number for instance. For instance, from team A, displays information about the quarterback, or display information about player number 5.
				- make provisions for the case in which the player is not found.
	- a method that
		- return the instant number of rushing yards of the team
		- this number is a sum of each player rushing yards
```
		