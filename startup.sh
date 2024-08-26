# simple script to run app locally on Docker

# run PostgreSQL Database on Docker
docker-compose up -d transcendent_postgres

# build and run Dockerized backend
cd backend
mvn clean install
cd ../
docker-compose up -d transcendent_backend

# build and run frontend
cd frontend
npm install
# open dev port on which the react app will run
# in case the address differs, refer to address in app console
start http://localhost:5173/
npm run dev

# quit react app to trigger containers to shut down
docker-compose down