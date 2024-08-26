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
2. Make sure Docker is running
3. Go to the application directory (i.e. .../transcendent-application)

   ```bash
   C: ...> cd C:<...>/transcendent-application
   ```
4. Run the **startup.sh** script

   ```bash
   C: ...\transcendent-application> startup.sh
   ```

Running the **startup.sh** script will:

1. Start a PostgreSQL database in Docker
2. Build and run a Dockerized Spring Boot backend with connection to the database in **1.**
3. Build and run React frontend in Terminal
   *exit react app in Terminal to trigger shutdown for **1** and **2**

## Demo Snippets
The app in action! The app takes all valid numbers.
![InputOutputZoomGIF](https://github.com/user-attachments/assets/c3034ed7-8907-4eb7-978c-6043960888a8)

The JSON response of all the inputs **n** and the associated values **(n * 2)** and **(n * 2)^2**

![JsonZoomGIF](https://github.com/user-attachments/assets/189c4d9c-3fad-47cd-aa51-582bf70106ac)

The database only stores the input **n** and **(n * 2)^2**

![DatabaseZoomGIF](https://github.com/user-attachments/assets/9531c40d-cb08-40a4-9808-e7a68fda2ef5)

## Troubleshooting

In case the **startup.sh** fails for any reason, try the following in IntelliJ:

1. Run the PostgreSQL database in Docker using docker-compose
   ```bash
   ...> docker-compose up -d transcendent_postgres
   ```
2. Run the backend Spring Boot Application using the green play button, or with the following configuration
   ![image](https://github.com/user-attachments/assets/09e8c3e5-7e2f-4c6e-9f38-e3f2da52149c)
3. Using the Terminal in IntelliJ, run the following in the *frontend* folder
   ```bash
   ...\frontend> npm install
   ...\frontend> npm run dev
   ```
4. Go to the localhost dev port address to see the React app in action

   ![image](https://github.com/user-attachments/assets/c7a7618d-dc6e-4e12-8c7c-9db93a3126d2)



