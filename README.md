# springboot-mysql-docker-compose-demo

## Run the system
First thing, you need to install **docker** and **docker-compose**.

If you are on Windows Machine, you can go to [Docker Link](https://www.docker.com/products/docker-desktop)

If you are on Linux Machine (Debian), you can run these commands on the bash contents into docker-installation-linux.sh file

We can easily run the whole with only a single command:
```bash
$ docker-compose up
```

Docker will pull the MySQL and SpringBoot images (if our machines does not have it before)

The services can be run on the background with the command:
```bash
$ docker-compose up -d
```
