package main;

import events.online;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.*;
import events.Reply;
public class bot {


    public static JDA jda;
    public static void main(String[] args) throws Exception
    {
        jda = new JDABuilder(AccountType.BOT).setToken("NDgxNzIzNjI3MDQyMTExNDg5.Dl_uSw.nQMMF50LOoH0GQj9dMS-").buildBlocking();

        jda.addEventListener(new Reply());
        jda.addEventListener(new online());

    }
}
