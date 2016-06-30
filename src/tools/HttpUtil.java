package tools;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

/**
 * @Description: TODO(用一句话描述该类做什么)
 * @author gaozhonghui
 * @mail gaozhh@cdeledu.com
 * @version V1.0
 * @date 2016年6月30日
 */

public class HttpUtil {
    /**
     * @Method: main
     * @Description: 测试方法
     * @param args
     * @return void
     */
    public static void main(String[] args) {
	try {
	    Request.Get("http://toptree.me").execute().returnContent();
	    Request.Post("http://toptree.me")
		    .bodyForm(
			    Form.form().add("username", "vip")
				    .add("password", "secret").build())
		    .execute().returnContent();
	    Request.Post("http://toptree.me").execute().returnContent();
	} catch (ClientProtocolException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }
}
