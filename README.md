A project on how you can use reactive repositories in Spring

Medium article: https://mrtoz.medium.com/spring-reactive-repositories-with-mongodb-e0b33c2516dc


## Usage


#### 1. Clone the project

    git clone https://github.com/osemrt/Reactive-Mongo-Repository.git


#### 2. Go to the project directory

    cd Reactive-Mongo-Repository

#### 3. Run the mongo and mongo-express instances on your machine

     docker-compose up -d

#### 4. See the running container to get the running mongo container id

    docker ps

#### 4. Open a bash on the mongo container

    docker exec -it reactivemongorepository_mongo_1 bash

#### 5. Enter the mongo shell using the credentials in docker-compose.yml

    mongo -u root -p secret

#### 6. Switch to the admin database

    use admin

#### 7. Create a new user and give the read and write accesses

    db.createUser(
        {
          user: "dbadmin",
          pwd: "mysecretpassword",
          roles: [
             { role: "readWrite", db: "myDatabase" },
          ]
        }
    )

#### 8. Run the project

