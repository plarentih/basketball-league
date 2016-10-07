# Basketball League
I am an intern at a software development company. My java exercise was to simulate a basketball season. I would create some
teams and make them play againts each other. The winner is chosen randomly from a match. Each time plays four times against
every other team. After every team plays all the supposed matches, a champion is declared. The winner of the basketball
season is the team with the best winning percentage. The winning percentage is generated for every team. It takes the number 
of wins at the end of the season, dividet by number of games played that season. At the end of the season a table is generated
to list all teams based on the winning  percentage. The entities of the application are listed and explained below. After that
there is a presenter class that designs the league table at the end of season. 

## Entities 
### Team class
The team entity shapes the team. It tells the attributes and methods that it contains. A team has a name, number of wins and
number of losses. It has a constructor to initialize the class attributes, setter and getter methods to set those attributes
and to get them whenever we need to. Last but not least it contains *equals* and *toString* methods, to compare the class
object and the one it receives, and to represent the class as a string respectively. 
### Match class
The match class handles the match between two teams. It has a constructor to initialize two teams. It has a method to randomly
set a winner, and handles the number of wins and losses for each team.
### League class
This class is reponsible for generating the matches and sorting the teams on the list based on the winning percentage. It
contains a list of teams and matches. 
