# Jurassic Park Manager

Paired project with [Jim Bevington](https://github.com/jimbevington). Brief provided by Codeclan Instructors.

This was our second project on the CodeClan 16week course.

This Java app incorporates the Spark web framework and Hibernate ORM framework for database interaction.

**Strictly NO Javascript or additional web frameworks permitted.**

## Overview

Simulates a Park Manager web app for Jurassic Park. Users can:

* *monitor key Park information from the Dashboard*
* *view further info on Paddocks, Dinosaurs and Visitors*
* *move Dinosaurs between Paddocks (where appropriate)*
* *add newborn Dinosaurs to the Nursery Paddock*
* *feed hungry Carnivores*
* *deal with escaped Dinosaurs (lock down Paddock and capture escapee)*


To prevent carnage/loss of valuable assets, carnivorous Dinos may only be moved into Paddocks with others of the same species.

Given that safety is Jurassic Parks No. 1 priority, the front-end dynamically updates to alert the user of important issues.

Hint: for a bit of nefarious fun, try logging in as *dennisnedry*!


## Using the App

1. Clone the project onto your machine.

2. In Terminal, create the Park database
  ```
  createdb jurassicparkdb
  ```
3. Run the Park Controller: *main/java/com.codeclan.jurassicpark.db/controllers/ParkController.class*

4. Navigate to [https://localhost:4567/](https://localhost:4567/)

5. Start managing Dinosaurs!
