FROM iron/java:1.8

ADD target/blackjack.jar \
    target/dependency/* \
    /librerias/

ADD src/main/resources/* \
    features/

ENTRYPOINT java -ea -cp "/librerias/*" cucumber.api.cli.Main --glue pasos /features/