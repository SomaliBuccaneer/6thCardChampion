6thCardChampion
===============
Welcome to the 6thCardChampion wiki!

Project Scope:

This project should provide a stable, network based multiplayer capable version of 6th Card Champion that is playable for 5 players.

Overview:

6th Card Champion is a card game designed to be multiplayer. The aim of the game is to guess your opponents 6th card through a series of 5 rounds in order to win.

This implementation of 6th Card Champion will be a client/server implementation, with a user message feature and simple graphical UI.

Product Perspective:

6th Card Champion is a single product that is not a part of any higher-level project. The program comes in two parts:

A Java JAR file to launch the server process. A Java JAR file to launch a client process.

See the separate top-level Class Model for an overview of the 6th Card Champion system.

Issues List

1)The game is unplayable to any realistic extend.

2)Action cards such as reverse or draw two do nothing.

3)There is currently no logic behind controlling what cards are legit to play.

4)If all cards are drawn, exceptions will be thrown.

5)Two users can join with the same nickname. This will cause many problems.

6)Opponent player card counts are not updated. They will always show 5.
