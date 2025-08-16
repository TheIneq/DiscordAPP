package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import org.example.Commands.Test;
import java.util.EnumSet;

@Slf4j
public class Example {

   private static void initAPP() {
      Dotenv dotenv = Dotenv.load();
      String token = dotenv.get("TOKEN");
      DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.create(token, EnumSet.allOf(GatewayIntent.class));
      builder.setStatus(OnlineStatus.ONLINE);
      builder.setActivity(Activity.of(Activity.ActivityType.PLAYING, "/help"));
      ShardManager shardManager = builder.build();
      shardManager.addEventListener(
              new CommandsManager(),
              new Test()
      );

   }

   public static void main(String[] args) {

      try {
         initAPP();
      }catch (Exception e) {
         log.error("Invalid token!");
      }

   }
}