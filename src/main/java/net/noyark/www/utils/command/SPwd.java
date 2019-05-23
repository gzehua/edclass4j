package net.noyark.www.utils.command;

import net.noyark.www.utils.Connector;

public class SPwd implements CommandBase {

    private Connector connector;

    public SPwd(Connector connector){
        this.connector = connector;
    }

    @Override
    public Object excute(String[] args) {
        connector.setUserName(args[0]);
        return "设置数据库连接密码成功"+args[0].replaceAll(".","\\*");
    }
}