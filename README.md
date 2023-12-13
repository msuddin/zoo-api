# Zoo Data API

## Description

This project is divided into 4 parts:
- [Zoo Data API](https://github.com/msuddin/zoo-data-api) (Java Rest API) -> Talks to Zoo Elastic Search
- [Zoo Elastic Search](https://github.com/msuddin/zoo-elastic-search) (dockerized Elasticsearch instance)
- [Zoo Search API](https://github.com/msuddin/zoo-search-api) (Java Rest API) -> Pulls from Zoo Elastic Search
- [Zoo UI](https://github.com/msuddin/zoo-ui) (React APP) -> Pulls data from Zoo Search API

Zoo Data API is a Java Rest API that posts data to Zoo Elastic Search (a dockerized Elasticsearch instance).
You can use curl (or Postman) to post data to Zoo Elastic Search. Zoo Data API is the entry point of this project.

## Instructions

To run the API (from command line):

```
mvn spring-boot:run
```

To run tests (from command line):

```
mvn clean install
```

To run tests (from command line):

```
mvn clean install
```

To post data (from command line):

```
curl -X POST -H "Content-Type: application/json" -d '{"name": "mo"}' http://localhost:8080/api/post-data
```

## Learning Outcomes

Here are the learning outcomes of this project.

- [x] To build a Java Rest API that can post data to Zoo Elastic Search
- [ ] To use tests using JUnit
- [ ] More to follow