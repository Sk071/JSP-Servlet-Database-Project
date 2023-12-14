FROM mysql:8.0
ENV MYSQL_DATABASE="jspdemoproject"
ENV MYSQL_ROOT_PASSWORD="12345678"
ADD jspdemoproject_user.sql /docker-entrypoint-initdb.d/jspdemoproject.sql
EXPOSE 3306
