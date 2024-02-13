Redis-Project
---------------------------------------------------------------------------------------------------------------------------------------------------------------
This is an example demonstrating how to connect to a Redis caching mechanism and utilize a useful time coverage option to set a timeout for a key.

Redis Installation
---------------------------------------------------------------------------------------------------------------------------------------------------------------
First and foremost, you can easily install Redis on your local machine using Docker with the following command:

docker run --name my-redis -p 6379:6379 -d redis

Project Overview
---------------------------------------------------------------------------------------------------------------------------------------------------------------
This is a simple Spring-Boot project which includes:

A POJO class “Personnel” under the domain package.
A configuration class “RedisConfig” under the config package, which includes the creation of RedisTemplate.
In the controller package, you can find how to implement CRUD operations using Redis Template.

Key Timeout Parameter
---------------------------------------------------------------------------------------------------------------------------------------------------------------
With redisTemplate.expire(KEY, 50, TimeUnit.MINUTES);, you can set a timeout parameter for your Key. This is useful for tokens or session values.
