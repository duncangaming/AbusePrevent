/*    */ package me.DuncanGaming.AbusePrevent;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class AbusePrevent
/*    */   extends JavaPlugin implements Listener {
/*    */   public void onEnable() {
/* 12 */     PluginManager pm = getServer().getPluginManager();
/* 13 */     pm.registerEvents(new NoBreak(this), (Plugin)this);
/* 14 */     Bukkit.getServer().getPluginManager().getPlugin(getName());
/* 15 */     getServer().getPluginManager().registerEvents(this, (Plugin)this);
/*    */   }
/*    */   
/*    */   public void onDisable() {}
/*    */ }


/* Location:              C:\Users\Duncan Wijnberg\Downloads\AbusePrevent.jar!\me\DuncanGaming\AbusePrevent\AbusePrevent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */