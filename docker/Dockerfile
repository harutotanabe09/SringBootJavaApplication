FROM openjdk:11

# 作業ディレクトリ作成
RUN mkdir /usr/app
WORKDIR /usr/app

# コンテナにJarをコピー
COPY application.jar app.jar

# Javaコマンドで実行
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/app/app.jar"]
