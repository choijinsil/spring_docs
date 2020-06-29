# spring_docs
spring_docs적용

1. project명/src/main/asciidoc 폴더 생성
2. 해당 위치에 api-guide.adoc파일 생성
3. maven update - clean - install

4. api-guide.adoc 파일 내용 작성하기

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





