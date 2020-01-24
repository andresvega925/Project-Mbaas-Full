# ---- Base Java ----
FROM java:8-jdk-alpine

# install openssl
RUN apk add --update openssl && \
    rm -rf /var/cache/apk/*

# Set working directory
WORKDIR /usr/app

COPY ./target/credito-negocio-service-0.0.1-SNAPSHOT.jar /usr/app/

COPY start.sh /conf/start.sh

RUN ["chmod", "+x", "/conf/start.sh"]

EXPOSE 8080
ENTRYPOINT ["java","-jar","credito-negocio-service-0.0.1-SNAPSHOT.jar"]