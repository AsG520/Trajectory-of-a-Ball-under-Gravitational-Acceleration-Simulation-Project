# Trajectory of a Ball under Gravitational Acceleration Simulation Project

Features in Simulation
- Real time animation using a timer.
- 2D trajectory of ball under gravitational acceleration in vacuum.
- Enhanced with ground detection check from conditional statement.
- Displays loss of energy due to Coefficient of Restitution.
- Vertical position updates from constant field acceleration.

Physics Concepts in Simulation
- Gravitational Acceleration (g).
- Coefficient of Restitution (e).

How it Works
- Has animation with the user of Java Timer.
- The program declares properties for the ball, timer, physics, color, and frame.
- Includes collision detection between the ball and the ground.
- Vertical velocity is being updated from gravitational constant acceleration, which then is updating the ball position.
- Paint method is drawing the ball new position every 15 milliseconds.
- Coefficient of Restitution reduces the motion of ball and allows to come in rest over time.

Requirements
- Java (JDK or higher).
- IDE (e.g., VS Code, Eclipse, or IntelliJ).

How to Run
1) Copy the code into a Java file named "GravityBallSimulation.java".
2) Compile the program: "javac GravityBallSimulation.java".
3) Run the program: "java GravityBallSimulation".
