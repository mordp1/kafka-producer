NAME_SPACE=infra-amqstreams-dev
APP_NAME=kafka-producer

oc import-image openjdk/openjdk-11-rhel7:1.15-1 \
   --from=registry.redhat.io/openjdk/openjdk-11-rhel7:1.15-1 \
   --confirm \
   -n ${NAME_SPACE}

oc new-build --name=${APP_NAME} \
    openjdk-11-rhel7:1.15-1~https://github.com/dfarias/kafka-producer-sample \
    -n ${NAME_SPACE}

oc new-app ${APP_NAME} \
    -e KAFKA_SERVER="sema-kafka-bootstrap" \
    -e KAFKA_PORT="9092" \
    -n ${NAME_SPACE}
