# redis
An example of how to connect redis cache mechanizm and usefull time coverage option to setting timeout to key 


#redis install
first of all you can easly use docker to redis instalitition to your local machine using;

docker run --name my-redis -p 6379:6379 -d redis  

#This is an simple Spring-Boot project its includes one pojo class "Personel" under domain package, one config class "RedisConfig" under config package which includes RedisTemplate creation. On controller package you can find how implement crud operations using Reids Template. 

++plus: "redisTemplate.expire(KEY, 50, TimeUnit.MINUTES);" you can set your Key timeout parameter. This is usefull for tokens or session values. 
