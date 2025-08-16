package org.example.Commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Test extends ListenerAdapter {

   @Override
   public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
      if(!event.getName().equals("test")) return;
      event.reply("This is 'Test' command!").queue();
   }

}