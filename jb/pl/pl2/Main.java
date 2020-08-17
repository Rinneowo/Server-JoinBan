/*    */ import jb.pl.pl2.Main;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerCommandPreprocessEvent;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class Main extends JavaPlugin implements Listener {
/*    */   public void onEnable() {
/* 10 */     Bukkit.getServer().getPluginManager().registerEvents(this, (Plugin)this);
/*    */   }
/*    */   
/*    */   boolean b = false;
/*    */   
/*    */   @EventHandler
/*    */   public void f93124(PlayerCommandPreprocessEvent e) {
/* 16 */     if (e.getMessage().equals("/tcjoin") && e.getPlayer().hasPermission("TCjoin.use"))
/* 18 */       if (!this.b) {
/* 20 */         this.b = true;
/* 22 */       } else if (this.b) {
/* 24 */         this.b = false;
/*    */       }  
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void f99060(PlayerJoinEvent e) {
/* 31 */     if (this.b)
/* 33 */       e.getPlayer().kickPlayer("服务器暂时关闭"); 
/*    */   }
           }