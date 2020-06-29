# spring_docs
spring_docs적용

1. project명/src/main/asciidoc 폴더 생성 ( 실제 물리적인 폴더에 추가)
1-1. 프로젝트 우클릭 - buildpath - Configure Build Path - Source - Add Folder... - 내가 만든 asciidoc폴더 체크후 ok - Apply ( 이렇게 해야 이클립스 화면상에 폴더가 보임)
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





