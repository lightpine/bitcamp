package java100.app.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java100.app.service.FacebookService;

@Service
public class FacebookServiceImpl implements FacebookService {

    @Override
    public <T> T me(String accessToken, Class<T> type) {

        RestTemplate restTemplate = new RestTemplate();

        try {
            return restTemplate.getForObject(
                    // 요청할 URL
                    // => Url에 들어갈 값이 있다면 중괄호{}를 사용하여 지정하라.
                    // => {변수명}
                    "https://graph.facebook.com/v2.12/me?access_token={v1}&fields={v2}",
                    // 서버에서 받은 값을 어떤 타입의 값으로 리턴할 지 지정한다.
                    type,

                    // URL에 들어갈 값
                    // => 객체에 값을 담아서 전달하거나, 값을 순서대로 나열한다.
                    // 배열을 전달한다면 프로퍼티명으로 값을 찾아서 삽입한다.
                    // 값을 나열한가면, 값이 나온 순서대로 삽입한다.
                    // 
                    accessToken, "id,name,email");

        } catch (Exception e) {
            throw new RuntimeException(
                    "페이스북 Graph API 실행 오류",
                    e);
        }
    }
}
