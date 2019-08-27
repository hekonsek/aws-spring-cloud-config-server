# Spring Cloud Config server distribution for AWS



## Usage

The easiest way to run Spring Cloud Config server is using Docker client:

    docker run \ 
      -e SPRING_CLOUD_CONFIG_SERVER_GIT_URI=https://github.com/owner/config-repo.git \
      -e AWS_REGION=$AWS_REGION \ 
      -e AWS_ACCESS_KEY_ID=$AWS_ACCESS_KEY_ID \ 
      -e AWS_SECRET_ACCESS_KEY=$AWS_SECRET_ACCESS_KEY \ 
      hekonsek/awsom-spring-cloud-config-server:0.0-SNAPSHOT
      
Where:

- `SPRING_CLOUD_CONFIG_SERVER_GIT_URI` indicates which Git
repository should be used by config server. Keep in mind that you need only read access for configuration repository - 
write access is not necessary.
- `AWS_REGION`, `AWS_ACCESS_KEY_ID` and `AWS_SECRET_ACCESS_KEY` are AWS credentials passed via standard AWS environment 
variables.