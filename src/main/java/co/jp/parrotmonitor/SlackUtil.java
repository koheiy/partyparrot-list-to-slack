package co.jp.parrotmonitor;

import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;
import org.springframework.beans.factory.annotation.Value;

public class SlackUtil {

    private static SlackApi api;

    @Value("${webhook.url}")
    private static String webhookUrl;

    static {
        System.out.println(webhookUrl);
        api = new SlackApi(webhookUrl);
    }

    public static void sendSlack(String icon, String channel, String msg) {
        SlackMessage message = new SlackMessage();
        message.setChannel(channel);
        message.setIcon(icon);
        message.setText(msg);
        api.call(message);
    }
}