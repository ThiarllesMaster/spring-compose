This project it was developed using docker compose 
To start it you need: 

1) mvn package 
2) docker compose up -d

AMAC02FFM6RMD6M:spring-compose thiarlles.a.gomes$ docker compose up -d
[+] Running 2/2
⠿ Container spring-compose-dbpostgresql-1  Started                                                                                                                                                                                               0.3s
⠿ Container app-springboot-postgresql      Started                                                                                                                                                                                               0.7s
AMAC02FFM6RMD6M:spring-compose thiarlles.a.gomes$ docker ps
CONTAINER ID   IMAGE                       COMMAND                  CREATED              STATUS         PORTS                    NAMES
320ab39272b1   app-springboot-postgresql   "java -jar /app.jar"     About a minute ago   Up 4 seconds   0.0.0.0:8080->8080/tcp   app-springboot-postgresql
8e2e138f011b   postgres                    "docker-entrypoint.s…"   About a minute ago   Up 4 seconds   0.0.0.0:5432->5432/tcp   spring-compose-dbpostgresql-1

3) 