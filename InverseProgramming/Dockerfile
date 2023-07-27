FROM ubuntu:latest
LABEL maintainer=gateway07@outlook.com
ARG DEBIAN_FRONTEND=noninteractive
RUN apt update && apt-get update && apt-get install -y python3 python3-pip git wget curl default-jre
RUN python3 -m pip install --no-cache-dir -q --upgrade pip

# Dependencies
COPY requirements.txt /app/requirements.txt
RUN pip install --no-cache-dir -r /app/requirements.txt

WORKDIR /app
CMD ["sleep","infinity"]