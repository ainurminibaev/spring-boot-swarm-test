0. Init swarm
   
docker swarm init
   
1. Create registry

docker service create --name registry --publish published=5000,target=5000 registry:2

2. Push to registry
docker-compose push

3. Deploy stack 

docker stack deploy --compose-file docker-compose.yml ainurstack

4. Look into stack

docker stack services ainurstack

5. Try out API

curl http://localhost:8081/ping

6. Delete all containers

7. Bring docker to normal state deleting swarm mode

docker swarm leave --force

https://docs.docker.com/engine/swarm/stack-deploy/