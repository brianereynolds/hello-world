# hello-world project

## Introduction
A very simple gradle-based project that uses Spring boot.

Includes endpoints which are commonly used with Kubernetes

## Quick start

### Gradle
```
gradle bootRun
```

### Docker
```
docker pull brianereynolds/hello-world

docker run -p 7000:7000 brianereynolds/hello-world
```

Open http://localhost:7000/ in your browser

## Swagger
A Swagger definition is also available.
```
http://localhost:7000/v2/api-docs
```

## CI/CD
When a commit is pushed to github, Travis CI will build and test at https://travis-ci.org/brianereynolds/hello-world. The the build is successful, 
a docker image is built and pushed to https://hub.docker.com/r/brianereynolds/hello-world/.

## Kubernetes Monitoring

*Health*: ```http://localhost:7000/healthz```

A healthy server returns HTTP 200

*Ready*: ```http://localhost:7000/readinessz```

A ready server returns HTTP 200
