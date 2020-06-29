package com.enm.framework.web;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith({ RestDocumentationExtension.class, SpringExtension.class })
@SpringBootTest
class UserControllerTest {

	@Autowired
	private WebApplicationContext context;

	private RestDocumentationResultHandler document;

	private MockMvc mockMvc;

	@BeforeEach
	public void setUp(WebApplicationContext webApplicationContext, RestDocumentationContextProvider restDocumentation) {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
				.apply(documentationConfiguration(restDocumentation)).build();
	}

	@Test
	@Disabled
	void findAll() throws Exception {

		// 미완성
		this.mockMvc
				.perform(get("/user/findAll")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(document("findAll-example"
//						responseFields(
//								fieldWithPath("no").description("몇번째"),
//								fieldWithPath("user_Id").description("아이디는 5자리 이상"),
//								fieldWithPath("name").description("이름은 3자리 이상"),
//								fieldWithPath("age").description("나이는 0살 이상"),
//								fieldWithPath("email").description("이메일 형식 지켜야 함"))
								)
						)
				;
	}

	@Test
	void save() throws Exception {

		MvcResult result = mockMvc
				.perform(post("/user/save").contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
						.param("userId", "siri").param("age", "30").param("name", "choi")
						.param("email", "siri@naver.com"))
				.andExpect(content().contentType("application/json")).andExpect(status().isOk())
				.andDo(document("save-example", requestParameters(
						parameterWithName("userId").description("유저의 아이디"),
						parameterWithName("name").description("유저의 이름"),
						parameterWithName("age").description("유저의 나이"),
						parameterWithName("email").description("유저의 이메일")))).andReturn();
	}
}
