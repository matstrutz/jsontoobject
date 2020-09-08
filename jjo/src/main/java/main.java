import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class main {

    public static void main (String[] args) throws IOException {
        URL website = new URL("https://ics.multieditoras.com.br/ics/agenda/1/2017/12?chave=TFACSJ48BRYHHRWJD9UZ&parceiro=IQs27SAP&compacto=0&formato=json");

        HttpURLConnection connection = (HttpURLConnection) website.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in .readLine()) != null) {
            response.append(inputLine);
        } in .close();

        ObjectMapper jacksonMapper = new ObjectMapper();

        UnnusedDTO unnusedDTO = jacksonMapper.readValue(response.toString(), UnnusedDTO.class);

        unnusedDTO.agenda.stream().forEach(item -> System.out.println(item.toString()));
    }
}
