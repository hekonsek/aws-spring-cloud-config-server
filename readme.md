# Spring Cloud Config server distribution for AWS

This project provides dockerized distribution of [Spring Cloud Config](https://spring.io/projects/spring-cloud-config) 
server optimized for AWS deployments. In particular it comes with:
- convention over configuration
- Git backend
- AWS KMS based encryption support
- basic authentication for server REST API

## Usage

The easiest way to run Spring Cloud Config server is using Docker client:

    docker run \ 
      -e SPRING_CLOUD_CONFIG_SERVER_GIT_URI=https://github.com/owner/config-repo.git \
      -e AWS_REGION=$AWS_REGION \ 
      -e AWS_ACCESS_KEY_ID=$AWS_ACCESS_KEY_ID \ 
      -e AWS_SECRET_ACCESS_KEY=$AWS_SECRET_ACCESS_KEY \ 
      hekonsek/awsom-spring-cloud-config-server:0.1.0
      
Where:

- `SPRING_CLOUD_CONFIG_SERVER_GIT_URI` indicates which Git
repository should be used by config server. Keep in mind that you need only read access for configuration repository - 
write access is not necessary.
- `AWS_REGION`, `AWS_ACCESS_KEY_ID` and `AWS_SECRET_ACCESS_KEY` are AWS credentials passed via standard AWS environment 
variables.

## Default settings

By default this Cloud Config server distribution uses the following settings:

- Git repository is cloned to current directory instead of `/tmp` to avoid issues related to temporary files being cleaned periodically by OS
- health check endpoint is configured to follow Kubernetes conventions i.e. `/health`
- default health check caching time is reduced from 5 minutes to 15 seconds (so backend connectivity issues can be detected early)

## Build and release

    mvn
    mvn dockerfile:push

## License

This project is distributed under [Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.html).