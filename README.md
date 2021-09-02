# springboot-mysql-docker-compose-demo

![java-logo](https://img.icons8.com/color/65/000000/java-coffee-cup-logo--v1.png)
![springboot-logo](https://img.icons8.com/color/65/000000/spring-logo.png)
![mysql-logo](https://img.icons8.com/fluency/65/000000/mysql-logo.png)
![docker-logo](https://img.icons8.com/color/65/000000/docker.png)

## Run the system
First thing, you need to install **docker** and **docker-compose**.

If you are on Windows Machine, you can go to [Docker Link](https://www.docker.com/products/docker-desktop)

If you are on Linux Machine (Debian), you can run these commands on the bash contents into [docker-installation-linux.sh file](https://github.com/vscalcione/springboot-mysql-docker-compose-demo/blob/main/docker-installation-linux.sh)

We can easily run the whole with only a single command:
```bash
$ docker-compose up
```

Docker will pull the MySQL and SpringBoot images (if our machines does not have it before)

The services can be run on the background with the command:
```bash
$ docker-compose up -d
```

## Stop the System
Stopping all the running containers is also simple with a single command:
```bash
$ docker-compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in [docker-compose.yml](https://github.com/vscalcione/springboot-mysql-docker-compose-demo/blob/main/docker-compose.yml) file, use the command:
```bash
$ docker-compose down --rmi all
```
