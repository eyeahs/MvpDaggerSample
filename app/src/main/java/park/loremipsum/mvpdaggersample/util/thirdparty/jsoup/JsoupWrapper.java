package park.loremipsum.mvpdaggersample.util.thirdparty.jsoup;

import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;

import java.io.IOException;

public interface JsoupWrapper {

    /**
     * Execute the request as a GET, and parse the result.
     *
     * @return parsed Document
     * @throws java.net.MalformedURLException  if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed
     * @throws HttpStatusException             if the response is not OK and HTTP response errors are not ignored
     * @throws UnsupportedMimeTypeException    if the response mime type is not supported and those errors are not ignored
     * @throws java.net.SocketTimeoutException if the connection times out
     * @throws IOException                     on error
     */
    Document get(String url) throws IOException;
}