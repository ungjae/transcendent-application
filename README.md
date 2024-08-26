# Transcendent Application (DOUBLE * DOUBLE)
Enter a number **n** and get values for **(n * 2)** and **(n * 2)^2**

## Installation

Before running the application, you'll need

1. Java JDK 17
2. Maven
3. Docker
4. npm

## Deploying Locally for Demo

Do the following to deploy the app locally for demo purposes:

1. Download or Git Clone the application to your local machine
2. Go to the application directory (i.e. .../transcendent-application)

   ```bash
   C: ...> cd C:<...>/transcendent-application
   ```
3. Run the **startup.sh** script

   ```bash
   C: ...\transcendent-application> startup.sh
   ```

Running the **startup.sh** script will:

1. Start a PostgreSQL database in Docker
2. Build and run a Dockerized Spring Boot backend with connection to the database in **1.**
3. Build and run React frontend in Terminal
   *exit react app in Terminal to trigger shutdown for **1** and **2**



