/*    */ package me.DuncanGaming.AbusePrevent;
/*    */ 
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.BlockBreakEvent;
/*    */ 
/*    */ 
/*    */ public class NoBreak
/*    */   implements Listener
/*    */ {
/*    */   public NoBreak(AbusePrevent abusePrevent) {}
/*    */   
/*    */   @EventHandler
/*    */   public void onBreak(BlockBreakEvent e) {
/* 15 */     if (e.getPlayer().hasPermission("admin.nobreak") && !e.getPlayer().isOp())
/* 16 */       e.setCancelled(true); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Duncan Wijnberg\Downloads\AbusePrevent.jar!\me\DuncanGaming\AbusePrevent\NoBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */