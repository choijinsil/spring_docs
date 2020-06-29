# spring_docs
spring_docs적용

0. project명/src/main/asciidoc 폴더 생성
1. 해당 위치에 api-guide.adoc파일 생성

파일 안에 작성하기

````= User

== user 저장하기

include::{snippets}/save-example/request-parameters.adoc[] ````
````

include::{snippets}/target.generated-snippets하위의 폴더명/폴더 안의 파일명.adoc[]

# User

## user 저장

| Parameter | Description   |
| :-------- | :------------ |
| `userId`  | 유저의 아이디 |
| `name`    | 유저의 이름   |
| `age`     | 유저의 나이   |
| `email`   | 유저의 이메일 |    

이런식으로 화면이 나올것임


3. maven update - clean - install


