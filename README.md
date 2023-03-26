# Spring-Boot-Docker-Api
Springboot java api which runs inside the docker container, and connection is checked with postman api

Springboot java api which shows the connection with the postman api through the port:8080(locally), port: 8000 (docker), i've already created the image of the java api:

![image](https://user-images.githubusercontent.com/24220136/227764481-756cb219-6bbd-49f6-9b4e-fad87ec73c1c.png)

Then we start the docker image and direct it to another port:

![image](https://user-images.githubusercontent.com/24220136/227764655-74576719-6a72-434c-8463-5e311eeaa96a.png)

And now we can check it from postman client side:

![image](https://user-images.githubusercontent.com/24220136/227764684-80e32615-4053-4830-a1f0-5317bbfc7126.png)

As we can see it is giving the previously created information from the docker container

![image](https://user-images.githubusercontent.com/24220136/227764744-35908228-03d0-4be4-b0be-249bc75a055c.png)


