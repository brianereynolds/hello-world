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

http://localhost:7000/v2/api-docs

## Kubernetes Monitoring

*Health*: http://host:port/healthz
A healthy server returns HTTP 200

*Ready*: http://host:port/readinessz
A ready server returns HTTP 200
